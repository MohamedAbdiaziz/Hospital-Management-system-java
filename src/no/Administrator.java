package no;

import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class Administrator {

	JFrame frame = new JFrame();
	private JTextField txtDoctorID;
	private JTextField txtDoctorName;
	private JTextField txtFatherName;
	private JTextField txtDoctorAddress;
	private JTextField txtContactNo;
	private JTextField txtEmail;
	private JTextField txtQualification;
	private JTextField txtSpecialization;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;

	/**
	 * Create the application.
	 */
	Administrator() {
		frame.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frame.setUndecorated(true);
		frame.setResizable(false);
		
		
		frame.setType(Type.POPUP);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton_3_1 = new JButton("Loguot");
		btnNewButton_3_1.setBounds(46, 509, 261, 120);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				DashBoard sh = new DashBoard();
			}
		});
		frame.getContentPane().setLayout(null);
	
		
		JLabel lblNewLabel_4 = new JLabel("Developed by Mohamed Abdiaziz");
		lblNewLabel_4.setBounds(560, 746, 261, 22);
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		frame.getContentPane().add(lblNewLabel_4);
		btnNewButton_3_1.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/back.png")));
		btnNewButton_3_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton_3_1);
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(0, 0, 1366, 45);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1314, 0, 52, 45);
		panel_3.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("About us");
		lblNewLabel_3_1_1_1.setBounds(546, 15, 97, 14);
		panel_3.add(lblNewLabel_3_1_1_1);
		
		JPanel panel_4_1_1_1 = new JPanel();
		panel_4_1_1_1.setLayout(null);
		panel_4_1_1_1.setBounds(491, 0, 45, 45);
		panel_3.add(panel_4_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/rsz_update_details.png")));
		lblNewLabel_2_1_1_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(0, 0, 48, 48);
		panel_4_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Add Drugs");
		lblNewLabel_3_1_1.setBounds(384, 15, 97, 14);
		panel_3.add(lblNewLabel_3_1_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(329, 0, 45, 45);
		panel_3.add(panel_4_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/add diag.png")));
		lblNewLabel_2_1_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(0, 0, 48, 48);
		panel_4_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Add User");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		lblNewLabel_3_1.setBounds(222, 15, 97, 14);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Administrator");
		lblNewLabel_3.setBounds(60, 15, 97, 14);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_4_1.setLayout(null);
		panel_4_1.setBounds(167, 0, 45, 45);
		panel_3.add(panel_4_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddUser user = new AddUser();
				frame.setVisible(false);
				
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/save.png")));
		lblNewLabel_2_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(0, 0, 48, 48);
		panel_4_1.add(lblNewLabel_2_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(5, 0, 45, 45);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 48, 48);
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/userr.png")));
		
		JButton btnNewButton_3 = new JButton("Add Nurse");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(317, 24, 1039, 720);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_7.setBackground(new Color(100, 149, 237));
		panel_7.setBounds(55, 28, 559, 602);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Doctor ID");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5.setBounds(59, 31, 175, 28);
		panel_7.add(lblNewLabel_5);
		
		txtDoctorID = new JTextField();
		txtDoctorID.setBounds(270, 31, 245, 28);
		panel_7.add(txtDoctorID);
		txtDoctorID.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Doctor Name");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(59, 78, 175, 28);
		panel_7.add(lblNewLabel_5_1);
		
		txtDoctorName = new JTextField();
		txtDoctorName.setColumns(10);
		txtDoctorName.setBounds(270, 78, 245, 28);
		panel_7.add(txtDoctorName);
		
		txtFatherName = new JTextField();
		txtFatherName.setColumns(10);
		txtFatherName.setBounds(270, 125, 245, 28);
		panel_7.add(txtFatherName);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Father's Name");
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1.setBounds(59, 125, 175, 28);
		panel_7.add(lblNewLabel_5_1_1);
		
		txtDoctorAddress = new JTextField();
		txtDoctorAddress.setColumns(10);
		txtDoctorAddress.setBounds(270, 174, 245, 28);
		panel_7.add(txtDoctorAddress);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Address");
		lblNewLabel_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1.setBounds(59, 174, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1);
		
		txtContactNo = new JTextField();
		txtContactNo.setColumns(10);
		txtContactNo.setBounds(270, 225, 245, 28);
		panel_7.add(txtContactNo);
		
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
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(270, 273, 245, 28);
		panel_7.add(txtEmail);
		
		txtQualification = new JTextField();
		txtQualification.setColumns(10);
		txtQualification.setBounds(270, 323, 245, 28);
		panel_7.add(txtQualification);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1 = new JLabel("Qualification");
		lblNewLabel_5_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1.setBounds(59, 323, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1);
		
		txtSpecialization = new JTextField();
		txtSpecialization.setColumns(10);
		txtSpecialization.setBounds(270, 376, 245, 28);
		panel_7.add(txtSpecialization);
		
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(270, 435, 109, 23);
		panel_7.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(406, 435, 109, 23);
		panel_7.add(rdbtnFemale);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1 = new JLabel("Blood Group");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1.setBounds(59, 488, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "B+", "O+", "A-", "B-", "O-"}));
		comboBox.setBounds(270, 488, 245, 28);
		panel_7.add(comboBox);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1_1 = new JLabel("Joined Date");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setBounds(59, 542, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(270, 544, 245, 28);
		panel_7.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("dd/mm/yyyy");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Traditional Arabic", Font.PLAIN, 15));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1_1.setBounds(475, 583, 84, 19);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1_1_1);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_8, null);
		btnNewButton_3.setBounds(164, 364, 143, 120);
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(46, 364, 120, 120);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/nurse.png")));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(46, 233, 120, 120);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/patient_icon.jpg")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("Add Patients");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_2.setBounds(164, 233, 143, 120);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 102, 120, 120);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setLocation(-4, 51);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/doctor.png")));
		
		JButton btnNewButton = new JButton("Add Doctor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton.setBounds(164, 102, 143, 120);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(null);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1410, 744);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/R.jpeg")));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 40, 313, 704);
		frame.getContentPane().add(panel_6);
		frame.setVisible(true);
	}
}
