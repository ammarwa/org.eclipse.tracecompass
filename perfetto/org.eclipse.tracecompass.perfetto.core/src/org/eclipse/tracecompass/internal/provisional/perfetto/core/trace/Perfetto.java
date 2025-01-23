/*******************************************************************************
 * Copyright (c) 2025 AMD
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.eclipse.tracecompass.internal.provisional.perfetto.core.trace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.internal.perfetto.core.Activator;
import org.eclipse.tracecompass.internal.perfetto.core.Messages;
import org.eclipse.tracecompass.internal.perfetto.core.event.PerfettoEvent;
import org.eclipse.tracecompass.internal.perfetto.protos.TraceOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.TracePacketOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.TrackEventOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.DebugAnnotationOuterClass.DebugAnnotation;
import org.eclipse.tracecompass.internal.perfetto.protos.DebugAnnotationOuterClass.DebugAnnotationName;
import org.eclipse.tracecompass.internal.perfetto.protos.InternedDataOuterClass;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.exceptions.TmfTraceException;
import org.eclipse.tracecompass.tmf.core.project.model.ITmfPropertiesProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfContext;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTraceKnownSize;
import org.eclipse.tracecompass.tmf.core.trace.TmfContext;
import org.eclipse.tracecompass.tmf.core.trace.TmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.indexer.ITmfPersistentlyIndexable;
import org.eclipse.tracecompass.tmf.core.trace.indexer.ITmfTraceIndexer;
import org.eclipse.tracecompass.tmf.core.trace.indexer.TmfBTreeTraceIndexer;
import org.eclipse.tracecompass.tmf.core.trace.location.ITmfLocation;
import org.eclipse.tracecompass.tmf.core.trace.location.TmfLongLocation;

import com.google.protobuf.CodedInputStream;

/**
 * Perfetto trace. Can read Perfetto traces.
 *
 * @author Ammar ELWazir
 */
public abstract class Perfetto extends TmfTrace {
    // ------------------------------------------------------------------------
    // Constants
    // ------------------------------------------------------------------------

    private static final int CACHE_SIZE = 20;

    private static final byte[] HEADER = new byte[] {0x7f, 'T', 'R', 'A', 'C', 'E'};

    /** The qualified name for the 'executable' persistent property */
    public static final QualifiedName EXEC_KEY = new QualifiedName(Activator.PLUGIN_ID, "executable"); //$NON-NLS-1$

    // ------------------------------------------------------------------------
    // Attributes
    // ------------------------------------------------------------------------

    private List<TracePacketOuterClass.TracePacket> packets;
    private List<DebugAnnotationName> extraDebugAnnotationsNames = null;
    private boolean flag = true;

    // The trace packet location
    private int fLocation = 0;

    private static String getEventName(long id, List<DebugAnnotationName> names) {
      for (DebugAnnotationName name : names) {
          if(name.getIid() == id) {
              return name.getName();
          }
      }
      return "";
    }

    public Perfetto() {
        setCacheSize(CACHE_SIZE);
    }

    /**
     * {@inheritDoc}
     * <p>
     * This implementation sets the confidence to 100 if the trace is a valid
     * CTF trace in the "ust" domain.
     */
    @Override
    public IStatus validate(final IProject project, final String path) {
        String pluginId = Activator.PLUGIN_ID;
        File file = new File(path);

        try (FileInputStream fis = new FileInputStream(file)) {
            CodedInputStream codedInput = CodedInputStream.newInstance(fis);
            TraceOuterClass.Trace perfetto_trace = TraceOuterClass.Trace.parseFrom(codedInput);
            if(perfetto_trace.getPacketCount() > 0) {
                packets = perfetto_trace.getPacketList();
                return new Status(IStatus.OK, pluginId, Messages.Invalid_trace_file);
            }
        } catch (Exception e) {
            return new Status(IStatus.ERROR, pluginId, "Trace File is valid", e);
        }
        return new Status(IStatus.ERROR, pluginId, "Trace File is valid");
    }

    @Override
    public void initTrace(IResource resource, String path, Class<? extends ITmfEvent> type) throws TmfTraceException {
        try {
            String tracedExecutable = resource.getPersistentProperty(EXEC_KEY);
            if (tracedExecutable == null) {
                throw new TmfTraceException("Trace not set!");
            }
        } catch (CoreException e) {
            throw new TmfTraceException("Failed To Initialize Trace!");
        }

        super.initTrace(resource, path, type);
    }

    @Override
    public synchronized TmfContext seekEvent(ITmfLocation location) {
        fLocation = (location != null) ? ((int) location.getLocationInfo()) : 0;
        return new TmfContext(new TmfLongLocation(fLocation), fLocation);
    }

    @Override
    public PerfettoEvent parseEvent(ITmfContext context) {
        PerfettoEvent event = null;
        TracePacketOuterClass.TracePacket packet = packets.get(fLocation);
        if(packet.hasTrackEvent()) {
            TrackEventOuterClass.TrackEvent track_event = packet.getTrackEvent();
            InternedDataOuterClass.InternedData data = packet.getInternedData();
            String name = "N/A";
            List<String> extraNames = new ArrayList<String>(track_event.getDebugAnnotationsCount());
            List<String> extraValues = new ArrayList<String>(track_event.getDebugAnnotationsCount());
            long timestamp = 0;
            long endTimestamp = 0;
            if(track_event.getType().equals(TrackEventOuterClass.TrackEvent.Type.TYPE_SLICE_BEGIN)) {
              if(flag) {extraDebugAnnotationsNames = data.getDebugAnnotationNamesList(); flag = false;}
              name = track_event.getName();
              if(name.isEmpty() && data.getEventNamesCount() > 0) {
                name = data.getEventNames(0).getName();
              }
              timestamp = packet.getTimestamp();

              if(track_event.getDebugAnnotationsCount() > 0) {
                  for (DebugAnnotation item :  track_event.getDebugAnnotationsList()) {
                      String itemName = getEventName(item.getNameIid(), extraDebugAnnotationsNames);
                      String itemValue = "N/A";
                      switch (item.getValueCase()) {
                          case STRING_VALUE:
                              itemValue = item.getStringValue();
                              break;
                          case BOOL_VALUE:
                              itemValue = item.getBoolValue() + "";
                              break;
                          case DOUBLE_VALUE:
                              itemValue = item.getDoubleValue() + "";
                              break;
                          case INT_VALUE:
                              itemValue = item.getIntValue() + "";
                              break;
                          case LEGACY_JSON_VALUE:
                              itemValue = item.getLegacyJsonValue();
                              break;
                          case NESTED_VALUE:
                              itemValue = item.getNestedValue().toString();
                              break;
                          case POINTER_VALUE:
                              itemValue = item.getPointerValue() + "";
                              break;
                          case STRING_VALUE_IID:
                              itemValue = item.getStringValueIid() + "";
                              break;
                          case UINT_VALUE:
                              itemValue = item.getUintValue() + "";
                              break;
                    case VALUE_NOT_SET:
                          default:
                      }
                      extraNames.add(itemName);
                      extraValues.add(itemValue);
                  }
              }
          } else if (track_event.getType().equals(TrackEventOuterClass.TrackEvent.Type.TYPE_SLICE_END)) {
              endTimestamp = packet.getTimestamp();
          }
        }
        fLocation++;
        return event;
    }

    @Override
    public synchronized ITmfEvent getNext(ITmfContext context) {
        fLocation++;
        return super.getNext(context);
    }
}
