package org.eclipse.tracecompass.internal.perfetto.core.event;

import java.util.List;

import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventType;
import org.eclipse.tracecompass.tmf.core.event.TmfEvent;
import org.eclipse.tracecompass.tmf.core.timestamp.ITmfTimestamp;
import org.eclipse.tracecompass.tmf.core.timestamp.TmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.ITmfContext;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;

public class PerfettoEvent extends TmfEvent{

    // TODO: Use the extra names and values and make sure to use the ITmfEventType, ITmfEventField
    public PerfettoEvent(ITmfTrace trace, long rank, String name, long timestamp, List<String> extraNames, List<String> extraValues) {
        super(trace, rank, TmfTimestamp.fromNanos(timestamp), null, null);
    }

}
