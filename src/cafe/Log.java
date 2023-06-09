package cafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Log extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	Connection con;
	Statement stmt;
	ResultSet rs;
	private JPasswordField txtPass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Log() {
		
		con = DataBase.connection();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OK CAFE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel.setBounds(335, 42, 304, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(263, 242, 134, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(263, 311, 134, 29);
		contentPane.add(lblNewLabel_1_1);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtUser.setBounds(426, 242, 243, 29);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String userName = txtUser.getText();
					String password = txtPass.getText();
					
					stmt = con.createStatement();
					String query = "SELECT * FROM login WHERE user_name=? AND password=?";
					
					PreparedStatement pst = con.prepareStatement(query);
					
					pst.setString(1,userName);
					pst.setString(2,password);
					
					ResultSet rs = pst.executeQuery();
					
					
					
					if(userName.equals("") || password.equals("")) {
						
						JOptionPane.showMessageDialog(null,"Every field is required");
						
					}else {
						
						if(rs.next()) {
							
							//JOptionPane.showMessageDialog(null,"Login Successful");
							setVisible(false);
							new Menu().setVisible(true);
							
						}else {
							
							JOptionPane.showMessageDialog(null,"Login Fail");
							
						}
						
						
							
							
						
					}
						
						
					
					
					
					
				}
				catch(Exception r) {
					
					System.out.println(r);
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(311, 386, 103, 29);
		contentPane.add(btnNewButton);
		
		JButton btnCansel = new JButton("Cansel");
		btnCansel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUser.setText("");
				txtPass.setText("");
				
			}
		});
		btnCansel.setBackground(new Color(255, 255, 255));
		btnCansel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCansel.setBounds(513, 386, 103, 29);
		contentPane.add(btnCansel);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2.setBounds(411, 163, 109, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\java\\cafe system\\bigstock-Young-Women-Friends-Placing-An-113532035.jpg"));
		lblNewLabel_3.setBounds(0, 0, 886, 579);
		contentPane.add(lblNewLabel_3);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPass.setBackground(new Color(255, 255, 255));
		txtPass.setBounds(426, 311, 243, 29);
		contentPane.add(txtPass);
		
		JCheckBox checkBox = new JCheckBox("view password");
		checkBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkBox.isSelected()) {
					
					txtPass.setEchoChar((char)0);
					
				}
				else {
					
					txtPass.setEchoChar('*');
				}
			}
		});
		checkBox.setBounds(547, 360, 122, 21);
		contentPane.add(checkBox);
	}
}
