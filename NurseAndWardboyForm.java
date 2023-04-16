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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NurseAndWardboyForm {

	private JFrame frame = new JFrame();
	private JTextField txtID;
	private JTextField txtAddress;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtQualification;
	private JTextField txtName;


	/**
	 * Create the application.
	 */
	NurseAndWardboyForm() {
		frame.setUndecorated(true);
		frame.setType(Type.POPUP);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add User");
		btnAdd.setForeground(new Color(50, 205, 50));
		btnAdd.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnAdd.setBounds(1087, 357, 201, 47);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.setForeground(new Color(139, 0, 0));
		btnDetails.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnDetails.setBounds(1087, 422, 201, 47);
		frame.getContentPane().add(btnDetails);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(NurseAndWardboyForm.class.getResource("/no/Nona/R2.png")));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(10, 147, 398, 473);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_7.setBackground(new Color(0, 0, 0));
		panel_7.setBounds(456, 169, 559, 451);
		frame.getContentPane().add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("ID");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5.setBounds(59, 31, 175, 28);
		panel_7.add(lblNewLabel_5);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(270, 31, 245, 28);
		panel_7.add(txtID);
		
		JLabel lblNewLabel_5_1 = new JLabel("Name");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(59, 78, 175, 28);
		panel_7.add(lblNewLabel_5_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(270, 78, 245, 28);
		panel_7.add(txtName);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Category");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1.setBounds(59, 125, 175, 28);
		panel_7.add(lblNewLabel_5_1_1);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(270, 174, 245, 28);
		panel_7.add(txtAddress);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Address");
		lblNewLabel_5_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1.setBounds(59, 174, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(270, 225, 245, 28);
		panel_7.add(txtPhone);
		
		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Contact Number");
		lblNewLabel_5_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1.setBounds(59, 225, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1 = new JLabel("Email ID");
		lblNewLabel_5_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1.setBounds(59, 273, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(270, 273, 245, 28);
		panel_7.add(txtEmail);
		
		txtQualification = new JTextField();
		txtQualification.setColumns(10);
		txtQualification.setBounds(270, 323, 245, 28);
		panel_7.add(txtQualification);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1 = new JLabel("Qualification");
		lblNewLabel_5_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1.setBounds(59, 323, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1 = new JLabel("Blood Group");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setBounds(59, 376, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1);
		
		JComboBox cmBox_BloodGroup = new JComboBox();
		cmBox_BloodGroup.setBounds(270, 376, 245, 28);
		panel_7.add(cmBox_BloodGroup);
		
		JComboBox cmBox_Category = new JComboBox();
		cmBox_Category.setModel(new DefaultComboBoxModel(new String[] {"Nurse", "Wardboy"}));
		cmBox_Category.setBounds(270, 130, 245, 28);
		panel_7.add(cmBox_Category);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Nurse And Wardboy");
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
		lblNewLabel_1.setIcon(new ImageIcon(NurseAndWardboyForm.class.getResource("/no/Nona/R.jpeg")));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(0, 0, 1410, 744);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		frame.setVisible(true);
		
	}
}
