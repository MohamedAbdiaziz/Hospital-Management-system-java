package no;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window.Type;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrugsForm {

	private JFrame frame = new JFrame();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;


	/**
	 * Create the application.
	 */
	DrugsForm() {
		frame.setUndecorated(true);
		frame.setType(Type.POPUP);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.setForeground(new Color(50, 205, 50));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.setBounds(1109, 295, 201, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.setForeground(new Color(139, 0, 0));
		btnDetails.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnDetails.setBounds(1109, 360, 201, 47);
		frame.getContentPane().add(btnDetails);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_7.setBackground(new Color(100, 149, 237));
		panel_7.setBounds(446, 94, 559, 512);
		frame.getContentPane().add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Drug ID");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5.setBounds(59, 31, 175, 28);
		panel_7.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(270, 31, 245, 28);
		panel_7.add(textField);
		
		JLabel lblNewLabel_5_1 = new JLabel("Drug Name");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(59, 78, 175, 28);
		panel_7.add(lblNewLabel_5_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(270, 78, 245, 28);
		panel_7.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(270, 125, 245, 28);
		panel_7.add(textField_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Available Quantity");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1.setBounds(59, 125, 175, 28);
		panel_7.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Re-order Level");
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1.setBounds(59, 174, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(270, 225, 245, 28);
		panel_7.add(textField_4);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Paying Price");
		lblNewLabel_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1.setBounds(59, 225, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1 = new JLabel("Date Expire");
		lblNewLabel_5_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1.setBounds(59, 273, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(270, 273, 245, 28);
		panel_7.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(270, 371, 245, 28);
		panel_7.add(textField_6);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1 = new JLabel("Drug Type");
		lblNewLabel_5_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1.setBounds(59, 323, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1 = new JLabel("Treatment");
		lblNewLabel_5_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1.setBounds(59, 369, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1 = new JLabel("Date Mfg");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setBounds(59, 419, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1);
		
		JComboBox cmBox_BloodGroup = new JComboBox();
		cmBox_BloodGroup.setBounds(270, 325, 245, 28);
		panel_7.add(cmBox_BloodGroup);
		
		JComboBox cmBox_BloodGroup_1 = new JComboBox();
		cmBox_BloodGroup_1.setBounds(270, 179, 245, 28);
		panel_7.add(cmBox_BloodGroup_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(270, 421, 245, 28);
		panel_7.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Date Formated");
		lblNewLabel.setForeground(new Color(253, 245, 230));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(262, 481, 112, 23);
		panel_7.add(lblNewLabel);
		
		JLabel lblDdmmyyyy = new JLabel("dd/mm/yyyy");
		lblDdmmyyyy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDdmmyyyy.setBounds(384, 478, 112, 28);
		panel_7.add(lblDdmmyyyy);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(DrugsForm.class.getResource("/no/Nona/download.jpeg")));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(38, 133, 398, 473);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 1366, 34);
		frame.getContentPane().add(panel_1);
		
		Button button = new Button("X");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Are you sure to exit", "Confirm", 2);
				if(a == 0) {
					frame.setVisible(false);
					Administrator admin = new Administrator();
					
				}
			}
		});
		button.setIgnoreRepaint(true);
		button.setForeground(new Color(178, 34, 34));
		button.setFont(new Font("Dialog", Font.PLAIN, 25));
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(1315, 0, 41, 34);
		panel_1.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("Drug Form");
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(583, 0, 172, 34);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DrugsForm.class.getResource("/no/Nona/R.jpeg")));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(0, 0, 1410, 744);
		frame.getContentPane().add(lblNewLabel_1);
		
		Panel panel = new Panel();
		panel.setBounds(0, 741, 1366, 27);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Developed By Mohamed Abdiaziz");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_1_1);
		
		
		
		frame.setVisible(true);
		
	}
}
