package no;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class AddUser {

	private JFrame frame;

	
	/**
	 * Create the application.
	 */
	public AddUser() {
		
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

}
