package no;
import java.awt.*;
import javax.swing.*;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DashBoard {
	JFrame frame = new JFrame();
	private JTextField textField;
	private JPasswordField passwordField;
	
	DashBoard(){
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		ImageIcon imgIcon =new ImageIcon(DashBoard.class.getResource("/no/Nona/OIP.jpeg"));
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/Close Button 4.bmp")));
		btnClose.setFont(new Font("Microsoft Uighur", Font.BOLD, 22));
		btnClose.setBounds(903, 507, 127, 44);
		frame.getContentPane().add(btnClose);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				Administrator ad = new Administrator();
			}
		});
		btnNewButton.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/login.png")));
		btnNewButton.setFont(new Font("Microsoft Uighur", Font.BOLD, 22));
		btnNewButton.setBounds(749, 507, 127, 44);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administration", "User"}));
		comboBox.setBounds(848, 445, 243, 30);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Role");
		lblNewLabel_4_1_1.setFont(new Font("Microsoft Uighur", Font.BOLD, 30));
		lblNewLabel_4_1_1.setBounds(741, 445, 97, 30);
		frame.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/add-user.png")));
		lblNewLabel_7.setBounds(694, 445, 37, 30);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/Reset Pass.png")));
		lblNewLabel_6_1.setBounds(694, 386, 37, 37);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/userr.png")));
		lblNewLabel_6.setBounds(684, 330, 48, 37);
		frame.getContentPane().add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(848, 389, 243, 30);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(846, 333, 243, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Login");
		lblNewLabel_5.setFont(new Font("Letter Gothic Std", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_5.setBounds(836, 265, 89, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setFont(new Font("Microsoft Uighur", Font.BOLD, 30));
		lblNewLabel_4_1.setBounds(741, 389, 97, 30);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setFont(new Font("Microsoft Uighur", Font.BOLD, 30));
		lblNewLabel_4.setBounds(735, 333, 99, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/Lock.png")));
		lblNewLabel_3.setBounds(237, 254, 297, 302);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/add new patient background.jpg")));
		lblNewLabel_2.setBounds(591, 230, 585, 351);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1366, 30);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Hospital Management System");
		lblNewLabel.setBounds(526, 5, 314, 23);
		lblNewLabel.setFont(new Font("Harlow Solid Italic", lblNewLabel.getFont().getStyle() | Font.ITALIC, lblNewLabel.getFont().getSize() + 7));
		panel.add(lblNewLabel);
		
		
		lblNewLabel_1.setIcon(new ImageIcon(DashBoard.class.getResource("/no/Nona/R.jpeg")));
		lblNewLabel_1.setBounds(0, 0, 1366, 768);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setUndecorated(true);
		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setState(Frame.ICONIFIED);
		frame.setType(Type.POPUP);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setAlwaysOnTop(true);
		frame.setSize(1366, 768);
		frame.setVisible(true);
		
	}
}
