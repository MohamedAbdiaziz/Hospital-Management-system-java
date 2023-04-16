package no;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Panel;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

public class AddUser {

	private JFrame frame = new JFrame();
	private JTextField txtUsername;
	private JTextField txtUserFullname;
	private JTextField txtEmail;
	private JTextField txt_Password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	
	/**
	 * Create the application.
	 */
	public AddUser() {
		
		
		frame.setUndecorated(true);
		frame.setType(Type.POPUP);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDetails = new JButton("Details");
		btnDetails.setForeground(new Color(139, 0, 0));
		btnDetails.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnDetails.setBounds(1028, 375, 201, 47);
		frame.getContentPane().add(btnDetails);
		
		JButton btnAdd = new JButton("Add User");
		btnAdd.setForeground(new Color(50, 205, 50));
		btnAdd.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnAdd.setBounds(1028, 310, 201, 47);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(AddUser.class.getResource("/no/Nona/About.jpg")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(142, 315, 140, 164);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_7.setBackground(new Color(100, 149, 237));
		panel_7.setBounds(410, 223, 559, 309);
		frame.getContentPane().add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5.setBounds(59, 31, 175, 28);
		panel_7.add(lblNewLabel_5);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(270, 31, 245, 28);
		panel_7.add(txtUsername);
		
		JLabel lblNewLabel_5_1 = new JLabel("User Name");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1.setBounds(59, 78, 175, 28);
		panel_7.add(lblNewLabel_5_1);
		
		txtUserFullname = new JTextField();
		txtUserFullname.setColumns(10);
		txtUserFullname.setBounds(270, 78, 245, 28);
		panel_7.add(txtUserFullname);
		
		JLabel lblNewLabel_5_1_1_1_1_1 = new JLabel("Email ID");
		lblNewLabel_5_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1.setBounds(59, 126, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(270, 126, 245, 28);
		panel_7.add(txtEmail);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1 = new JLabel("Sex");
		lblNewLabel_5_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1.setBounds(59, 173, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setBounds(270, 178, 109, 23);
		panel_7.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setBounds(406, 178, 109, 23);
		panel_7.add(rdbtnFemale);
		
		JLabel lblNewLabel_5_1_1_1_1_1_1_1_1_1_1 = new JLabel("Password");
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		lblNewLabel_5_1_1_1_1_1_1_1_1_1_1.setBounds(59, 228, 175, 28);
		panel_7.add(lblNewLabel_5_1_1_1_1_1_1_1_1_1_1);
		
		txt_Password = new JTextField();
		txt_Password.setText("1234!@#$");
		txt_Password.setEditable(false);
		txt_Password.setColumns(10);
		txt_Password.setBounds(270, 230, 245, 28);
		panel_7.add(txt_Password);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(0, 0, 1366, 34);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("User Form");
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(583, 0, 172, 34);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(AddUser.class.getResource("/no/Nona/R.jpeg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(0, 0, 1410, 744);
		frame.getContentPane().add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBounds(0, 741, 1366, 27);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Developed By Mohamed Abdiaziz");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_1);
		
		frame.setVisible(true);
	}
}
