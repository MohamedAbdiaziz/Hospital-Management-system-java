package no;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class DoctorForm {

	JFrame frame = new JFrame();
	private JTextField txt_doctorID;
	private JTextField txt_DoctorName;
	private JTextField txt_DoctorFatherName;
	private JTextField txt_address;
	private JTextField txt_phone;
	private JTextField txt_email;
	private JTextField txt_qualification;
	private JTextField txt_specialization;

	DoctorForm() {
		frame.setUndecorated(true);
		frame.setType(Type.POPUP);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.setForeground(new Color(139, 0, 0));
		btnDetails.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnDetails.setBounds(1068, 371, 201, 47);
		frame.getContentPane().add(btnDetails);
		
		JButton btnAdd = new JButton("Add User");
		btnAdd.setForeground(new Color(50, 205, 50));
		btnAdd.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnAdd.setBounds(1068, 306, 201, 47);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DoctorForm.class.getResource("/no/Nona/doctor.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(45, 234, 258, 256);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_7.setBackground(new Color(100, 149, 237));
		panel_7.setBounds(431, 132, 559, 551);
		frame.getContentPane().add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Doctor ID");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5.setBounds(59, 31, 175, 28);
		panel_7.add(lblNewLabel_5);
		
		txt_doctorID = new JTextField();
		txt_doctorID.setColumns(10);
		txt_doctorID.setBounds(270, 31, 245, 28);
		panel_7.add(txt_doctorID);
		
		JLabel lblNewLabel_5_1 = new JLabel("Doctor Name");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(59, 78, 175, 28);
		panel_7.add(lblNewLabel_5_1);
		
		txt_DoctorName = new JTextField();
		txt_DoctorName.setColumns(10);
		txt_DoctorName.setBounds(270, 78, 245, 28);
		panel_7.add(txt_DoctorName);
		
		txt_DoctorFatherName = new JTextField();
		txt_DoctorFatherName.setColumns(10);
		txt_DoctorFatherName.setBounds(270, 125, 245, 28);
		panel_7.add(txt_DoctorFatherName);
		
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
		
		txt_qualification = new JTextField();
		txt_qualification.setColumns(10);
		txt_qualification.setBounds(270, 323, 245, 28);
		panel_7.add(txt_qualification);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1 = new JLabel("Qualification");
		lblNewLabel_5_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1.setBounds(59, 323, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1);
		
		txt_specialization = new JTextField();
		txt_specialization.setColumns(10);
		txt_specialization.setBounds(270, 376, 245, 28);
		panel_7.add(txt_specialization);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1 = new JLabel("Specialization");
		lblNewLabel_5_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1.setBounds(59, 376, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1 = new JLabel("Sex");
		lblNewLabel_5_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1.setBounds(59, 430, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(270, 435, 109, 23);
		panel_7.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(406, 435, 109, 23);
		panel_7.add(rdbtnFemale);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1 = new JLabel("Blood Group");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setBounds(59, 488, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1);
		
		JComboBox cmbox_bloodGroup = new JComboBox();
		cmbox_bloodGroup.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "O", "AB", "A-", "B-", "O-"}));
		cmbox_bloodGroup.setBounds(270, 488, 245, 28);
		panel_7.add(cmbox_bloodGroup);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1366, 34);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
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
		button.setBackground(new Color(192, 192, 192));
		button.setIgnoreRepaint(true);
		button.setForeground(new Color(178, 34, 34));
		button.setFont(new Font("Dialog", Font.PLAIN, 25));
		button.setBounds(1315, 0, 41, 34);
		panel.add(button);
		
		JLabel lblNewLabel_2 = new JLabel("Dhaqtar/Doctor");
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(495, 0, 172, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DoctorForm.class.getResource("/no/Nona/R.jpeg")));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(0, 0, 1366, 768);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
}
