import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Frame;

public class Progra {

	private JFrame frame;
	JProgressBar pgs = new JProgressBar();
	
	Progra() {		
		frame = new JFrame();
		frame.setLocationByPlatform(true);
		
		frame.setEnabled(true);
		frame.setUndecorated(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\testing\\Desktop\\Icons\\DefaultAccountTile.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(frame);
		frame.setBounds(100, 100, 450, 183);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\testing\\Desktop\\logo-1.png"));
		lblNewLabel.setBounds(134, 46, 165, 94);
		frame.getContentPane().add(lblNewLabel);
		pgs.setStringPainted(true);
		pgs.setBorder(null);
		pgs.setForeground(Color.GREEN);		
		pgs.setBounds(0, 167, 457, 17);		
		frame.getContentPane().add(pgs);
		fill();
		
	}


	public void fill() {
		// TODO Auto-generated method stub
		int counter = 0;
		while(counter<=100) {
			pgs.setValue(10);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=10;
		}
		
	}
}
