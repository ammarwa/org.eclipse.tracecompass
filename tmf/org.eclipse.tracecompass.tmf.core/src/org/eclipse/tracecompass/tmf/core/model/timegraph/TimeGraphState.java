/**********************************************************************
 * Copyright (c) 2017, 2019 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 **********************************************************************/

package org.eclipse.tracecompass.tmf.core.model.timegraph;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.TmfStrings;
import org.eclipse.tracecompass.tmf.core.model.OutputElement;
import org.eclipse.tracecompass.tmf.core.model.OutputElementStyle;

import com.google.common.collect.Multimap;

/**
 * Implementation of {@link ITimeGraphState}
 *
 * @author Simon Delisle
 * @since 4.0
 */
public class TimeGraphState extends OutputElement implements ITimeGraphState {
    private final long fStartTime;
    private final long fDuration;
    private final int fValue;
    private final @Nullable String fLabel;

    /**
     * Constructor
     *
     * @param time
     *            Time
     * @param duration
     *            State duration
     * @param value
     *            Type of state (event type)
     */
    public TimeGraphState(long time, long duration, int value) {
        super(null);
        fStartTime = time;
        fDuration = duration;
        fValue = value;
        fLabel = null;
    }

    /**
     * Constructor
     *
     * @param time
     *            Time
     * @param duration
     *            State duration
     * @param value
     *            Type of state (event type)
     * @param label
     *            State label
     */
    public TimeGraphState(long time, long duration, int value, String label) {
        this(time, duration, value, label, null);
    }

    /**
     * Constructor
     *
     * @param time
     *            Time
     * @param duration
     *            State duration
     * @param label
     *            State label
     * @param style
     *            Style
     * @since 5.2
     */
    public TimeGraphState(long time, long duration, @Nullable String label, @Nullable OutputElementStyle style) {
        this(time, duration, Integer.MIN_VALUE, label, style);
    }

    /**
     * Constructor
     *
     * @param time
     *            Time
     * @param duration
     *            State duration
     * @param value
     *            Type of state (event type)
     * @param label
     *            State label
     * @param style
     *            Style
     * @since 5.2
     */
    public TimeGraphState(long time, long duration, int value, @Nullable String label, @Nullable OutputElementStyle style) {
        super(style);
        fStartTime = time;
        fDuration = duration;
        fValue = value;
        fLabel = label;
    }

    @Override
    public long getStartTime() {
        return fStartTime;
    }

    @Override
    public long getDuration() {
        return fDuration;
    }

    @Override
    public int getValue() {
        return fValue;
    }

    @Override
    public @Nullable String getLabel() {
        return fLabel;
    }

    @Override
    public synchronized Multimap<String, Object> getMetadata() {
        Multimap<String, Object> metadata = super.getMetadata();
        String label = getLabel();
        if (label != null) {
            metadata.put(IMetadataStrings.LABEL_KEY, label);
        }
        metadata.put(TmfStrings.startTime(), fStartTime);
        metadata.put(TmfStrings.endTime(), fStartTime + fDuration);
        metadata.put(TmfStrings.duration(), fDuration);
        return metadata;
    }

    @Deprecated
    @Override
    public Map<String, String> computeData() {
        Map<String, String> toTest = new HashMap<>();
        String label = getLabel();
        if (label != null) {
            toTest.put(IElementResolver.LABEL_KEY, label);
        }
        return toTest;
    }
}
