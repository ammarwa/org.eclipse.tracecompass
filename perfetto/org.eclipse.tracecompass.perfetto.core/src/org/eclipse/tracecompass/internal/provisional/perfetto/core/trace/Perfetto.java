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
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.internal.perfetto.core.Activator;
import org.eclipse.tracecompass.internal.perfetto.core.Messages;
import org.eclipse.tracecompass.internal.perfetto.protos.TraceOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.TracePacketOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.TrackEventOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.DebugAnnotationOuterClass.DebugAnnotation;
import org.eclipse.tracecompass.internal.perfetto.protos.DebugAnnotationOuterClass.DebugAnnotationName;
import org.eclipse.tracecompass.internal.perfetto.protos.InternedDataOuterClass;
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
            if(TraceOuterClass.Trace.parseFrom(codedInput).getPacketCount() > 0) {
                return new Status(IStatus.OK, pluginId, Messages.Invalid_trace_file);
            }
        } catch (Exception e) {
            return new Status(IStatus.ERROR, pluginId, "Trace File is valid", e);
        }
        return new Status(IStatus.ERROR, pluginId, "Trace File is valid");
    }
}
