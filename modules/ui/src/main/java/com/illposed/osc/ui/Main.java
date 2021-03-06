/*
 * Copyright (C) 2003-2014, C. Ramakrishnan / Auracle.
 * All rights reserved.
 *
 * This code is licensed under the BSD 3-Clause license.
 * See file LICENSE (or LICENSE.html) for more information.
 */

package com.illposed.osc.ui;


import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.swing.JFrame;

import com.illposed.osc.OSCPortIn;

/**
 * @author Chandrasekhar Ramakrishnan
 */
public class Main extends JFrame {
// jason was here
	
	private OscUI myUi;
	private OSCPortIn port;

	public void addOscUI() {
		myUi = new OscUI(this);
		setBounds(10, 10, 500, 350);
		setContentPane(myUi);
		
		
	}

	public Main() {
		super("OSC");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				myUi.doSendGlobalOff(1000, 1001, 1002);
				System.exit(0);
			}
		});

		addOscUI();
		Rectangle bounds = getMaximizedBounds(); // set your maximized bounds
		setMaximizedBounds(bounds);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setUndecorated(true);


		setVisible(true);
	}


	public static void main(String[] args) {
		System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");//
		new Main();
	}
}
