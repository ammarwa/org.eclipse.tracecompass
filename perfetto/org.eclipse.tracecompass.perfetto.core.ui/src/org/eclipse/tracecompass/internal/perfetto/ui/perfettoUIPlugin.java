/*******************************************************************************
 * Copyright (c) 2011, 2015 Ericsson
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Francois Chouinard - Initial API and implementation
 *   Patrick Tasse - Updated for TMF 2.0
 *******************************************************************************/

package org.eclipse.tracecompass.internal.perfetto.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * Perfetto Tracepoint Analysis UI plug-in activator
 * @author Francois Chouinard
 */
public class perfettoUIPlugin extends AbstractUIPlugin {

    // ------------------------------------------------------------------------
    // Attributes
    // ------------------------------------------------------------------------

    /** The plug-in ID */
    public static final String PLUGIN_ID = "org.eclipse.tracecompass.perfetto.ui"; //$NON-NLS-1$

    private static perfettoUIPlugin plugin;

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------

    /**
     * Constructor
     */
    public perfettoUIPlugin() {
        // Do nothing
    }

    // ------------------------------------------------------------------------
    // AbstractUIPlugin
    // ------------------------------------------------------------------------

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // ------------------------------------------------------------------------
    // Accessor
    // ------------------------------------------------------------------------

    /**
     * Returns the Perfetto Tracepoints UI plug-in instance.
     *
     * @return the Perfetto Tracepoints UI plug-in instance
     */
    public static perfettoUIPlugin getDefault() {
        return plugin;
    }

}
