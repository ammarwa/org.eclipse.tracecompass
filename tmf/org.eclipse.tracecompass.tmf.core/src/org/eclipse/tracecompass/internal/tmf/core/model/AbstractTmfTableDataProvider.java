/**********************************************************************
 * Copyright (c) 2022 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 **********************************************************************/

package org.eclipse.tracecompass.internal.tmf.core.model;

import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;

import com.google.common.annotations.VisibleForTesting;

/**
 * Table-specific abstract class to reuse towards the Trace-oriented superclass.
 */
public abstract class AbstractTmfTableDataProvider extends AbstractTmfTraceDataProvider {

    /**
     * Atomic Long so that every column has a unique ID.
     */
    private static final AtomicLong fAtomicLong = new AtomicLong();

    /**
     * Key for table search regex filter expressions (regex only)
     */
    public static final String TABLE_SEARCH_EXPRESSION_KEY = "table_search_expressions"; //$NON-NLS-1$

    /**
     * Key for table search direction (forward or backward)
     */
    public static final String TABLE_SEARCH_DIRECTION_KEY = "table_search_direction"; //$NON-NLS-1$

    /**
     * @param trace
     *            The trace
     */
    protected AbstractTmfTableDataProvider(ITmfTrace trace) {
        super(trace);
    }

    /**
     * Direction of search, navigation etc.
     */
    @VisibleForTesting
    public enum Direction {
        /** Search next */
        NEXT,
        /** Search previous */
        PREVIOUS
    }

    /**
     * @return A new unique column id
     */
    protected static long createColumnId() {
        return fAtomicLong.getAndIncrement();
    }

    /**
     * Extract the id of the column out of an object
     *
     * @param key
     *            The object that contains the id
     * @param matched
     *            Whether or not this key should match the pattern
     *
     * @return The column id
     */
    protected static @Nullable Long extractColumnId(@Nullable Object key, boolean matched) {
        try {
            if (key instanceof String && (!matched || Pattern.compile("[-?\\d+\\.?\\d+]").matcher((String) key).matches())) { //$NON-NLS-1$
                return Long.valueOf((String) key);
            }
            if (key instanceof Long) {
                return (Long) key;
            }
            if (key instanceof Integer) {
                return Long.valueOf((Integer) key);
            }
        } catch (NumberFormatException e) {
            // Fall through
        }
        return null;
    }
}
