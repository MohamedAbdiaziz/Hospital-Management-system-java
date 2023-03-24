package no;
import java.awt.*;
import javax.swing.*;
import java.awt.Window.Type;

public class Progress {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	private final JLabel lblNewLabel_1 = new JLabel("loading resources...");
	Progress(){
		lblNewLabel_1.setBounds(8, 190, 109, 14);
		
		frame.getContentPane().add(lblNewLabel_1);
		bar.setIndeterminate(true);
		bar.setStringPainted(true);
		bar.setBorder(null);
		bar.setForeground(new Color(51, 255, 0));
		bar.setBackground(new Color(255, 255, 255));
		bar.setValue(0);
		bar.setBounds(0, 207, 420, 17);
		
		frame.getContentPane().add(bar);
		frame.getContentPane().setBackground(new Color(240, 230, 140));
		frame.setEnabled(false);
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.setType(Type.UTILITY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(419,223);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Progress.class.getResource("/no/Nona/HospitalInformation.jpeg")));
		lblNewLabel.setBounds(0, -138, 478, 495);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		fill();
	}
	public void fill() {
		// TODO Auto-generated method stub
		int	counter = 0;
		while(counter<=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter+=1;
		}
		frame.setVisible(false);
		DashBoard sh = new DashBoard();
		
	}
}
