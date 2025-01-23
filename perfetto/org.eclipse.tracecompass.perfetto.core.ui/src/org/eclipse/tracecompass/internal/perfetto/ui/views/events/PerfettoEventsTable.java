/*******************************************************************************
 * Copyright (c) 2013, 2014 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Patrick Tasse - Initial API and implementation
 *******************************************************************************/

package org.eclipse.tracecompass.internal.perfetto.ui.views.events;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.tracecompass.tmf.core.event.aspect.ITmfEventAspect;
//import org.eclipse.tracecompass.tmf.core.signal.TmfSelectionRangeUpdatedSignal;
//import org.eclipse.tracecompass.tmf.core.signal.TmfSignalHandler;
//import org.eclipse.tracecompass.tmf.core.signal.TmfTraceUpdatedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.experiment.TmfExperiment;
import org.eclipse.tracecompass.tmf.ui.viewers.events.TmfEventsTable;

/**
 * Perfetto Event Table
 *
 * @author Patrick Tasse
 */
public class PerfettoEventsTable extends TmfEventsTable {

    // ------------------------------------------------------------------------
    // Fields
    // ------------------------------------------------------------------------

//    private perfetto fSelectedTrace = null;
//    private long fSelectedFrame = 0;

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------

    /**
     * Constructor
     *
     * @param parent
     *            the parent
     * @param cacheSize
     *            the cache size
     */
    public PerfettoEventsTable(Composite parent, int cacheSize) {
        super(parent, cacheSize, TmfTrace.BASE_ASPECTS);
        // Set the alignment of the first two columns
        fTable.getColumns()[0].setAlignment(SWT.RIGHT);
        fTable.getColumns()[1].setAlignment(SWT.RIGHT);

//        // Synchronize currently selected frame in Perfetto with table selection
//        addSelectionChangedListener(e -> {
//            TableItem[] selection = fTable.getSelection();
//            if (selection.length > 0) {
//                TableItem selectedTableItem = selection[0];
//                if (selectedTableItem != null) {
//                    Object data = selectedTableItem.getData();
//                    if (data instanceof perfettoEvent) {
//                        perfettoEvent event = (perfettoEvent) data;
//                        perfetto perfetto = (perfetto) event.getTrace();
//                        perfettoEventContent content = event.getContent();
//                        selectFrame(perfetto, content.getFrameNumber());
//                        return;
//                    }
//                }
//            }
//            fSelectedTrace = null;
//        });
    }

//    @Override
//    public void setTrace(ITmfTrace trace, boolean disposeOnClose) {
//        super.setTrace(trace, disposeOnClose);
//        if (trace instanceof perfetto) {
//            fSelectedTrace = (perfetto) trace;
//            fSelectedFrame = 0;
//        } else if (trace instanceof TmfExperiment) {
//            TmfExperiment experiment = (TmfExperiment) trace;
//            List<ITmfTrace> expTraces = experiment.getTraces();
//            if (!expTraces.isEmpty()) {
//                fSelectedTrace = (perfetto) expTraces.get(0);
//                fSelectedFrame = 0;
//            }
//        }
//    }
//
//    @Override
//    @TmfSignalHandler
//    public void selectionRangeUpdated(final TmfSelectionRangeUpdatedSignal signal) {
//        // do not synchronize on time
//    }
//
//    private void selectFrame(final perfetto perfetto, final long frameNumber) {
//        Job b = new Job("Perfetto Trace select frame") { //$NON-NLS-1$
//            @Override
//            protected IStatus run(IProgressMonitor monitor) {
//                // This sends commands to Perfetto and can potentially wait on the UI
//                // thread (gdb traces console buffer full) so it needs to be
//                // exectued on a non-UI thread
//                perfetto.selectFrame(frameNumber);
//                fSelectedTrace = perfetto;
//                fSelectedFrame = frameNumber;
//                return Status.OK_STATUS;
//            }
//        };
//        b.setSystem(true);
//        b.schedule();
//    }
//
//    @Override
//    @TmfSignalHandler
//    public void traceUpdated(TmfTraceUpdatedSignal signal) {
//        super.traceUpdated(signal);
//        if (fSelectedTrace.getNbFrames() == fSelectedTrace.getNbEvents()) {
//            selectFrame(fSelectedTrace, fSelectedFrame);
//        }
//    }
}
