/*******************************************************************************
 * Copyright (c) 2015 hangum.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     hangum - initial API and implementation
 ******************************************************************************/
package com.hangum.tadpole.rdb.core.dialog.dbconnect.dialog;

import org.apache.log4j.Logger;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import com.hangum.tadpole.rdb.core.Messages;

/**
 * tadpole message dialog
 * 
 * @author hangum
 *
 */
public class TDBInfoDialog extends TDBErroDialog {
	private static final Logger logger = Logger.getLogger(TDBInfoDialog.class);
	
	
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public TDBInfoDialog(Shell parentShell, String title, String message) {
		super(parentShell, title, message);
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, Messages.TDBErroDialog_3, true);
	}

}