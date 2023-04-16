package no;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientForm {

	private JFrame frame = new JFrame();
	private JTextField txt_PatientID;
	private JTextField txt_PatientName;
	private JTextField txt_PtFatherName;
	private JTextField txt_address;
	private JTextField txt_phone;
	private JTextField txt_email;
	private JTextField txt_age;

	
	/**
	 * Create the application.
	 */
	PatientForm() {
		
		
		frame.setUndecorated(true);
		frame.setType(Type.POPUP);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(PatientForm.class.getResource("/no/Nona/patient_icon.jpg")));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(82, 303, 258, 256);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.setForeground(new Color(50, 205, 50));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.setBounds(1082, 284, 201, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.setForeground(new Color(139, 0, 0));
		btnDetails.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnDetails.setBounds(1082, 349, 201, 47);
		frame.getContentPane().add(btnDetails);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_7.setBackground(new Color(100, 149, 237));
		panel_7.setBounds(423, 89, 559, 602);
		frame.getContentPane().add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Patient ID");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5.setBounds(59, 31, 175, 28);
		panel_7.add(lblNewLabel_5);
		
		txt_PatientID = new JTextField();
		txt_PatientID.setColumns(10);
		txt_PatientID.setBounds(270, 31, 245, 28);
		panel_7.add(txt_PatientID);
		
		JLabel lblNewLabel_5_1 = new JLabel("Patient Name");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(59, 78, 175, 28);
		panel_7.add(lblNewLabel_5_1);
		
		txt_PatientName = new JTextField();
		txt_PatientName.setColumns(10);
		txt_PatientName.setBounds(270, 78, 245, 28);
		panel_7.add(txt_PatientName);
		
		txt_PtFatherName = new JTextField();
		txt_PtFatherName.setColumns(10);
		txt_PtFatherName.setBounds(270, 125, 245, 28);
		panel_7.add(txt_PtFatherName);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Father's Name");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1.setBounds(59, 125, 175, 28);
		panel_7.add(lblNewLabel_5_1_1);
		
		txt_address = new JTextField();
		txt_address.setColumns(10);
		txt_address.setBounds(270, 174, 245, 28);
		panel_7.add(txt_address);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Address");
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1.setBounds(59, 174, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1);
		
		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(270, 225, 245, 28);
		panel_7.add(txt_phone);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Contact Number");
		lblNewLabel_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1.setBounds(59, 225, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1 = new JLabel("Email ID");
		lblNewLabel_5_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1.setBounds(59, 273, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1);
		
		txt_email = new JTextField();
		txt_email.setColumns(10);
		txt_email.setBounds(270, 273, 245, 28);
		panel_7.add(txt_email);
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(270, 323, 245, 28);
		panel_7.add(txt_age);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1 = new JLabel("Age");
		lblNewLabel_5_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1.setBounds(59, 323, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1 = new JLabel("Sex");
		lblNewLabel_5_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1.setBounds(59, 369, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(270, 374, 109, 23);
		panel_7.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(406, 374, 109, 23);
		panel_7.add(rdbtnFemale);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1 = new JLabel("Blood Group");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setBounds(59, 419, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1);
		
		JComboBox cmBox_BloodGroup = new JComboBox();
		cmBox_BloodGroup.setBounds(270, 419, 245, 28);
		panel_7.add(cmBox_BloodGroup);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1_1 = new JLabel("Remark");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setBounds(59, 499, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Optional");
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setBounds(469, 258, 46, 14);
		panel_7.add(lblNewLabel);
		
		TextArea txt_remark = new TextArea();
		txt_remark.setBounds(270, 468, 245, 99);
		panel_7.add(txt_remark);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Patient Form");
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(583, 0, 172, 34);
		panel_1.add(lblNewLabel_2);
		
		Panel panel = new Panel();
		panel.setBounds(0, 741, 1366, 27);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Developed By Mohamed Abdiaziz");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PatientForm.class.getResource("/no/Nona/R.jpeg")));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(0, 0, 1410, 744);
		frame.getContentPane().add(lblNewLabel_1);
		
		frame.setVisible(true);
		
	}
}
