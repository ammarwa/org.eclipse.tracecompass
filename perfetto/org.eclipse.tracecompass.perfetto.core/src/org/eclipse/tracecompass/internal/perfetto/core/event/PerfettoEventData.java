/**
 *
 */
package org.eclipse.tracecompass.internal.perfetto.core.event;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.event.ITmfEventField;
import org.eclipse.tracecompass.tmf.core.event.TmfEventField;

/**
 *
 */
public class PerfettoEventData extends TmfEventField {

    private static PerfettoEventData[] getExtraFields(Hashtable<String, String> extras) {
        PerfettoEventData[] fields = new PerfettoEventData[extras.size()];
        int i = 0;
        for (String key : extras.keySet()) {
            fields[i] = new PerfettoEventData(key, extras.get(key));
            i++;
        }
        return fields;
    }

    /**
     * @param name
     * @param value
     * @param fields
     */
    public PerfettoEventData(String name, String value, Hashtable<String, String> extras) {
        super(name, value, getExtraFields(extras));
    }

    /**
     * @param name
     * @param value
     */
    public PerfettoEventData(String name, String value) {
        super(name, value, null);
    }


    /**
     * @param field
     */
    public PerfettoEventData(TmfEventField field) {
        super(field);
    }

}
