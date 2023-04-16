package no;

import javax.swing.JFrame;
import java.awt.Frame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		btnNewButton_3_1.setBounds(46, 509, 341, 120);
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
				
				int a = JOptionPane.showConfirmDialog(null, "Are you sure to exit", "Confirm", 2);
				if(a == 0) {
					frame.setVisible(false);
					
					
				}
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
		lblNewLabel_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				DrugsForm DFrom = new DrugsForm();
				
			}
		});
		lblNewLabel_3_1_1.setBounds(384, 15, 97, 14);
		panel_3.add(lblNewLabel_3_1_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(329, 0, 45, 45);
		panel_3.add(panel_4_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				DrugsForm DFrom = new DrugsForm();
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Administrator.class.getResource("/no/Nona/add diag.png")));
		lblNewLabel_2_1_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(0, 0, 48, 48);
		panel_4_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Add User");
		lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddUser user = new AddUser();
				frame.setVisible(false);
				
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
		
		JButton btnNewButton_3 = new JButton("Add Nurse/Wardboy");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				NurseAndWardboyForm NandWForm = new NurseAndWardboyForm(); 
			}
		});
		btnNewButton_3.setBounds(164, 364, 223, 120);
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
				frame.setVisible(false);
				PatientForm ptForm = new PatientForm();
				
			}
		});
		btnNewButton_2.setBounds(164, 233, 223, 120);
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
				frame.setVisible(false);
				DoctorForm dcForm = new DoctorForm();
				
				
			}
		});
		btnNewButton.setBounds(164, 102, 223, 120);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
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
