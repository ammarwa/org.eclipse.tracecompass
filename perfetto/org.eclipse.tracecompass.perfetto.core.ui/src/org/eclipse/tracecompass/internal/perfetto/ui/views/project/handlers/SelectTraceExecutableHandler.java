/*******************************************************************************
 * Copyright (c) 2025 AMD
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License 2.0 which
 * accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Ammar ELWazir
 *******************************************************************************/

package org.eclipse.tracecompass.internal.perfetto.ui.views.project.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.tracecompass.internal.provisional.perfetto.core.trace.Perfetto;
import org.eclipse.tracecompass.internal.perfetto.ui.views.project.dialogs.SelectTraceExecutableDialog;
import org.eclipse.tracecompass.tmf.ui.project.model.TmfTraceElement;
import org.eclipse.tracecompass.tmf.ui.project.model.TraceUtils;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handler for the Select Trace Executable command
 * @author Ammar ELWazir
 */
public class SelectTraceExecutableHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Shell shell = HandlerUtil.getActiveShell(event);

        // Get the selection before opening the dialog because otherwise the
        // getCurrentSelection() call will always return null
        ISelection selection = HandlerUtil.getCurrentSelection(event);

        SelectTraceExecutableDialog dialog = new SelectTraceExecutableDialog(shell);
        dialog.open();
        if (dialog.getReturnCode() != Window.OK) {
            return null;
        }
        IPath tracedExecutable = dialog.getExecutablePath();

        if (selection instanceof IStructuredSelection) {
            for (Object o : ((IStructuredSelection) selection).toList()) {
                TmfTraceElement traceElement = (TmfTraceElement) o;
                IResource resource = traceElement.getResource();
                try {
                    resource.setPersistentProperty(Perfetto.EXEC_KEY, tracedExecutable.toString());
                } catch (CoreException e) {
                    TraceUtils.displayErrorMsg(e);
                }
            }
        }
        return null;
    }

}
