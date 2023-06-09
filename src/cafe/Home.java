package cafe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import sch.Log;
//import sch.schM;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

public class Home extends JFrame {

	private JPanel contentPane;
	JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Home frame = new Home();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Home home = new Home();
		home.setVisible(true);
		
        try {
			
			for(int i=0;i<100;i++)
			{
				Thread.sleep(50);
				home.progressBar.setValue(i);
				
				
			}
			home.setVisible(false);
			Log log = new Log();
			log.setVisible(true);
			
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		
		setUndecorated(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OK CAFE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel.setBounds(377, 36, 304, 66);
		contentPane.add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setForeground(new Color(255, 0, 0));
		progressBar.setBackground(new Color(255, 255, 255));
		progressBar.setBounds(226, 483, 504, 22);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("Loading...");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(430, 502, 167, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\java\\cafe system\\bigstock-Young-Women-Friends-Placing-An-113532035.jpg"));
		lblNewLabel_2.setBounds(0, 0, 900, 616);
		contentPane.add(lblNewLabel_2);
	}
}
