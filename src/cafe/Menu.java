package cafe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_4_1;
	JLabel lblNewLabel_4_2;
	JLabel lblNewLabel_4_3;
	JLabel lblNewLabel_4_4;
	JLabel lblNewLabel_4_5;
	JLabel lblNewLabel_4_6;
	JLabel lblNewLabel_4_7;
	JLabel lblNewLabel_4_8;
	JLabel lblNewLabel_4_9;
	JLabel lblNewLabel_4_10;
	JLabel lblNewLabel_4_11;
	
	JSpinner spinner;
	JTextArea textArea;
	JCheckBox chckbxNewCheckBox;
	
	int intPrice = 0;
	int intTot = 0;
	int lastTotal = 0;
	int intTax=0;
	String hours;
	private final JLabel label = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		
		
	}
	
	public void setText() {
		
		int purchaseId = 1520 + (int)(Math.random()*2040);
		textArea.setText("************OK CAFE************\n"+"Time 12:00PM Date 5/13/2023\n"+"Purchase Id  "+purchaseId+"\n"+"*********************************************************"+"\n"+"ITEM"+"\t\t\t"+"PRICE"+"\n");
		//textArea.setText("Time 12:00PM Date 5/13/2023");
		//textArea.setText("*****************************************************");
		
	}
	
	public void qtyZero() {
		
		
			
			JOptionPane.showMessageDialog(null,"Please Increase The Value");
			//chckbxNewCheckBox.setSelected(false); 

		
	}
	
	public void tax() {
		
		if(lastTotal>=1000) {
			
			intTax = 50;
		}else if(lastTotal >= 800) {
			
			intTax = 40;
		}else if(lastTotal >= 600) {
			
			intTax = 30;
		}else if(lastTotal >= 400) {
			
			intTax = 20;
		}else if(lastTotal >= 200) {
			
			intTax = 10;
		}else {
			
			intTax = 0;
		}
		
	}
	
	Thread t = new Thread();
	public void setTime() {
		
       new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			while(true) {
				
				try {
					
					Thread.sleep(1000);
					
				}catch(Exception e) {
					
					System.out.println(e);
				}
				Date date = new Date();
				SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
				String time = timeFormat.format(date);
				label.setText("time");
			}
			
		}
    	   
    	   
       });t.start();
	}

	/**
	 * Create the frame.
	 * 
	 * 
	 * 
	 */
	
	
	/*public void setImage(){
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/image/fish.jpg"));
		Image img = icon.getImage().getScaledInstance(lblNewLabel_4.getWidth(),lblNewLabel_4.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4.setIcon(new ImageIcon(img));
		
	}*/
	
	public Menu() {
		setTitle("OK CAFE");
		
		//ImageIcon icon = new ImageIcon(getClass().getResource("/image/fish.jpg"));
		//Image img = icon.getImage().getScaledInstance(lblNewLabel_4.getWidth(),lblNewLabel_4.getHeight(),Image.SCALE_SMOOTH);
		//lblNewLabel_4.setIcon(new ImageIcon(img));
		
		//setTime();
		
       
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1332, 963);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 1014, 779);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MENU ITEM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(415, 10, 141, 27);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 39, 200, 208);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 115, 45, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantity");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(10, 146, 61, 21);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Parchas");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(10, 177, 61, 21);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("R.80");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(96, 119, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner.setBounds(96, 146, 45, 20);
		panel_1.add(spinner);
		
		 
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int intQty = Integer.parseInt(spinner.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox.setSelected(false); 
				}else if(chckbxNewCheckBox.isSelected()){
					
					intTot = 80*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Fish Bun"+"\t\t"+intTot);
					
				}
				
				
				
				
			}
		});
		chckbxNewCheckBox.setBounds(96, 177, 93, 21);
		panel_1.add(chckbxNewCheckBox);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(10, 10, 180, 95);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(258, 39, 200, 208);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Price");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(10, 115, 45, 21);
		panel_1_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Quantity");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(10, 146, 61, 21);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Parchas");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(10, 177, 61, 21);
		panel_1_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("R.80");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(96, 119, 45, 13);
		panel_1_1.add(lblNewLabel_3_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1.setBounds(96, 146, 45, 20);
		panel_1_1.add(spinner_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1.setSelected(false); 
				}else if(chckbxNewCheckBox_1.isSelected()){
					
					intTot = 80*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Vegitable Roti"+"\t\t"+intTot);
					
				}
				
				
			}
		});
		chckbxNewCheckBox_1.setBounds(96, 177, 93, 21);
		panel_1_1.add(chckbxNewCheckBox_1);
		
		lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setBounds(9, 10, 180, 95);
		panel_1_1.add(lblNewLabel_4_1);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/image/fish.jpg"));
		Image img = icon.getImage().getScaledInstance(lblNewLabel_4.getWidth(),lblNewLabel_4.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_2_3 = new JLabel("Fish Bun");
		lblNewLabel_2_3.setBounds(80, 246, 73, 21);
		panel.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_1.setBounds(517, 39, 200, 208);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Price");
		lblNewLabel_2_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_1.setBounds(10, 115, 45, 21);
		panel_1_1_1.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Quantity");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(10, 146, 61, 21);
		panel_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Parchas");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_1.setBounds(10, 177, 61, 21);
		panel_1_1_1.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("R.100");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(96, 119, 45, 13);
		panel_1_1_1.add(lblNewLabel_3_1_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_1.setBounds(96, 146, 45, 20);
		panel_1_1_1.add(spinner_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("");
		chckbxNewCheckBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_1.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_1.setSelected(false); 
				}else if(chckbxNewCheckBox_1_1.isSelected()){
					
					intTot = 100*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Egg Bun"+"\t\t\t"+intTot);
					
				}
				
			
			}
		});
		chckbxNewCheckBox_1_1.setBounds(96, 177, 93, 21);
		panel_1_1_1.add(chckbxNewCheckBox_1_1);
		
		lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setBounds(10, 10, 180, 95);
		panel_1_1_1.add(lblNewLabel_4_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_2.setBounds(775, 39, 200, 208);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("Price");
		lblNewLabel_2_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_2.setBounds(10, 115, 45, 21);
		panel_1_1_2.add(lblNewLabel_2_4_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Quantity");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_2.setBounds(10, 146, 61, 21);
		panel_1_1_2.add(lblNewLabel_2_1_1_2);
		
		//setTime();
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Parchas");
		lblNewLabel_2_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_2.setBounds(10, 177, 61, 21);
		panel_1_1_2.add(lblNewLabel_2_2_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("R.60");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_2.setBounds(96, 119, 45, 13);
		panel_1_1_2.add(lblNewLabel_3_1_2);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_2.setBounds(96, 146, 45, 20);
		panel_1_1_2.add(spinner_1_2);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("");
		chckbxNewCheckBox_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_2.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_2.setSelected(false); 
				}else if(chckbxNewCheckBox_1_2.isSelected()){
					
					intTot = 60*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Coffe"+"\t\t\t"+intTot);
					
				}
			}
		});
		chckbxNewCheckBox_1_2.setBounds(96, 177, 93, 21);
		panel_1_1_2.add(chckbxNewCheckBox_1_2);
		
		lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setBounds(10, 10, 180, 95);
		panel_1_1_2.add(lblNewLabel_4_3);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3.setBounds(10, 277, 200, 208);
		panel.add(panel_1_1_3);
		
		JLabel lblNewLabel_2_4_3 = new JLabel("Price");
		lblNewLabel_2_4_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3.setBounds(10, 115, 45, 21);
		panel_1_1_3.add(lblNewLabel_2_4_3);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3.setBounds(10, 146, 61, 21);
		panel_1_1_3.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_2_1_3 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3.setBounds(10, 177, 61, 21);
		panel_1_1_3.add(lblNewLabel_2_2_1_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("R.100");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3.setBounds(96, 119, 45, 13);
		panel_1_1_3.add(lblNewLabel_3_1_3);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3.setBounds(96, 146, 45, 20);
		panel_1_1_3.add(spinner_1_3);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("");
		chckbxNewCheckBox_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_3.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3.isSelected()){
					
					intTot = 100*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Omelette Bun"+"\t\t"+ intTot);
					
				}
			}
		});
		chckbxNewCheckBox_1_3.setBounds(96, 177, 93, 21);
		panel_1_1_3.add(chckbxNewCheckBox_1_3);
		
		lblNewLabel_4_7 = new JLabel("");
		lblNewLabel_4_7.setBounds(10, 10, 180, 95);
		panel_1_1_3.add(lblNewLabel_4_7);
		
		JPanel panel_1_1_3_1 = new JPanel();
		panel_1_1_3_1.setLayout(null);
		panel_1_1_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3_1.setBounds(10, 525, 200, 208);
		panel.add(panel_1_1_3_1);
		
		JLabel lblNewLabel_2_4_3_1 = new JLabel("Price");
		lblNewLabel_2_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3_1.setBounds(10, 115, 45, 21);
		panel_1_1_3_1.add(lblNewLabel_2_4_3_1);
		
		JLabel lblNewLabel_2_1_1_3_1 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3_1.setBounds(10, 146, 61, 21);
		panel_1_1_3_1.add(lblNewLabel_2_1_1_3_1);
		
		JLabel lblNewLabel_2_2_1_3_1 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3_1.setBounds(10, 177, 61, 21);
		panel_1_1_3_1.add(lblNewLabel_2_2_1_3_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel("R.100");
		lblNewLabel_3_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3_1.setBounds(96, 119, 45, 13);
		panel_1_1_3_1.add(lblNewLabel_3_1_3_1);
		
		JSpinner spinner_1_3_1 = new JSpinner();
		spinner_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3_1.setBounds(96, 146, 45, 20);
		panel_1_1_3_1.add(spinner_1_3_1);
		
		JCheckBox chckbxNewCheckBox_1_3_1 = new JCheckBox("");
		chckbxNewCheckBox_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_3_1.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3_1.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3_1.isSelected()){
					
					intTot = 80*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Egg Roti"+"\t\t"+intTot);
					
				}
			}
		});
		chckbxNewCheckBox_1_3_1.setBounds(96, 177, 93, 21);
		panel_1_1_3_1.add(chckbxNewCheckBox_1_3_1);
		
		lblNewLabel_4_8 = new JLabel("");
		lblNewLabel_4_8.setBounds(10, 10, 180, 95);
		panel_1_1_3_1.add(lblNewLabel_4_8);
		
		JPanel panel_1_1_3_2 = new JPanel();
		panel_1_1_3_2.setLayout(null);
		panel_1_1_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3_2.setBounds(258, 277, 200, 208);
		panel.add(panel_1_1_3_2);
		
		JLabel lblNewLabel_2_4_3_2 = new JLabel("Price");
		lblNewLabel_2_4_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3_2.setBounds(10, 115, 45, 21);
		panel_1_1_3_2.add(lblNewLabel_2_4_3_2);
		
		JLabel lblNewLabel_2_1_1_3_2 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3_2.setBounds(10, 146, 61, 21);
		panel_1_1_3_2.add(lblNewLabel_2_1_1_3_2);
		
		JLabel lblNewLabel_2_2_1_3_2 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3_2.setBounds(10, 177, 61, 21);
		panel_1_1_3_2.add(lblNewLabel_2_2_1_3_2);
		
		JLabel lblNewLabel_3_1_3_2 = new JLabel("R.80");
		lblNewLabel_3_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3_2.setBounds(96, 119, 45, 13);
		panel_1_1_3_2.add(lblNewLabel_3_1_3_2);
		
		JSpinner spinner_1_3_2 = new JSpinner();
		spinner_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3_2.setBounds(96, 146, 45, 20);
		panel_1_1_3_2.add(spinner_1_3_2);
		
		JCheckBox chckbxNewCheckBox_1_3_2 = new JCheckBox("");
		chckbxNewCheckBox_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_3_2.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3_2.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3_2.isSelected()){
					
					intTot = 80*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Pettis"+"\t\t\t"+intTot);
					
				}
			}
		});
		chckbxNewCheckBox_1_3_2.setBounds(96, 177, 93, 21);
		panel_1_1_3_2.add(chckbxNewCheckBox_1_3_2);
		
		lblNewLabel_4_6 = new JLabel("");
		lblNewLabel_4_6.setBounds(10, 10, 180, 95);
		panel_1_1_3_2.add(lblNewLabel_4_6);
		
		JPanel panel_1_1_3_3 = new JPanel();
		panel_1_1_3_3.setLayout(null);
		panel_1_1_3_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3_3.setBounds(517, 277, 200, 208);
		panel.add(panel_1_1_3_3);
		
		JLabel lblNewLabel_2_4_3_3 = new JLabel("Price");
		lblNewLabel_2_4_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3_3.setBounds(10, 115, 45, 21);
		panel_1_1_3_3.add(lblNewLabel_2_4_3_3);
		
		JLabel lblNewLabel_2_1_1_3_3 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3_3.setBounds(10, 146, 61, 21);
		panel_1_1_3_3.add(lblNewLabel_2_1_1_3_3);
		
		JLabel lblNewLabel_2_2_1_3_3 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3_3.setBounds(10, 177, 61, 21);
		panel_1_1_3_3.add(lblNewLabel_2_2_1_3_3);
		
		JLabel lblNewLabel_3_1_3_3 = new JLabel("R.80");
		lblNewLabel_3_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3_3.setBounds(96, 119, 45, 13);
		panel_1_1_3_3.add(lblNewLabel_3_1_3_3);
		
		JSpinner spinner_1_3_3 = new JSpinner();
		spinner_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3_3.setBounds(96, 146, 45, 20);
		panel_1_1_3_3.add(spinner_1_3_3);
		
		JCheckBox chckbxNewCheckBox_1_3_3 = new JCheckBox("");
		chckbxNewCheckBox_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_3_3.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3_3.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3_3.isSelected()){
					
					intTot = 100*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Rols"+"\t\t\t"+intTot);
					
				}
			}
		});
		chckbxNewCheckBox_1_3_3.setBounds(96, 177, 93, 21);
		panel_1_1_3_3.add(chckbxNewCheckBox_1_3_3);
		
		lblNewLabel_4_5 = new JLabel("");
		lblNewLabel_4_5.setBounds(10, 10, 180, 95);
		panel_1_1_3_3.add(lblNewLabel_4_5);
		
		JPanel panel_1_1_3_4 = new JPanel();
		panel_1_1_3_4.setLayout(null);
		panel_1_1_3_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3_4.setBounds(775, 277, 200, 208);
		panel.add(panel_1_1_3_4);
		
		JLabel lblNewLabel_2_4_3_4 = new JLabel("Price");
		lblNewLabel_2_4_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3_4.setBounds(10, 115, 45, 21);
		panel_1_1_3_4.add(lblNewLabel_2_4_3_4);
		
		JLabel lblNewLabel_2_1_1_3_4 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3_4.setBounds(10, 146, 61, 21);
		panel_1_1_3_4.add(lblNewLabel_2_1_1_3_4);
		
		JLabel lblNewLabel_2_2_1_3_4 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3_4.setBounds(10, 177, 61, 21);
		panel_1_1_3_4.add(lblNewLabel_2_2_1_3_4);
		
		JLabel lblNewLabel_3_1_3_4 = new JLabel("R.80");
		lblNewLabel_3_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3_4.setBounds(96, 119, 45, 13);
		panel_1_1_3_4.add(lblNewLabel_3_1_3_4);
		
		JSpinner spinner_1_3_4 = new JSpinner();
		spinner_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3_4.setBounds(96, 146, 45, 20);
		panel_1_1_3_4.add(spinner_1_3_4);
		
		JCheckBox chckbxNewCheckBox_1_3_4 = new JCheckBox("");
		chckbxNewCheckBox_1_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_3_4.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3_4.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3_4.isSelected()){
					
					intTot = 80*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Tea"+"\t\t\t"+intTot);
					
				}
			}
		});
		chckbxNewCheckBox_1_3_4.setBounds(96, 177, 93, 21);
		panel_1_1_3_4.add(chckbxNewCheckBox_1_3_4);
		
		JLabel lblNewLabel_4_4 = new JLabel("");
		lblNewLabel_4_4.setBounds(10, 10, 180, 95);
		panel_1_1_3_4.add(lblNewLabel_4_4);
		
		JPanel panel_1_1_3_5 = new JPanel();
		panel_1_1_3_5.setLayout(null);
		panel_1_1_3_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3_5.setBounds(258, 525, 200, 208);
		panel.add(panel_1_1_3_5);
		
		JLabel lblNewLabel_2_4_3_5 = new JLabel("Price");
		lblNewLabel_2_4_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3_5.setBounds(10, 115, 45, 21);
		panel_1_1_3_5.add(lblNewLabel_2_4_3_5);
		
		JLabel lblNewLabel_2_1_1_3_5 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3_5.setBounds(10, 146, 61, 21);
		panel_1_1_3_5.add(lblNewLabel_2_1_1_3_5);
		
		JLabel lblNewLabel_2_2_1_3_5 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3_5.setBounds(10, 177, 61, 21);
		panel_1_1_3_5.add(lblNewLabel_2_2_1_3_5);
		
		JLabel lblNewLabel_3_1_3_5 = new JLabel("R.60");
		lblNewLabel_3_1_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3_5.setBounds(96, 119, 45, 13);
		panel_1_1_3_5.add(lblNewLabel_3_1_3_5);
		
		JSpinner spinner_1_3_5 = new JSpinner();
		spinner_1_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3_5.setBounds(96, 146, 45, 20);
		panel_1_1_3_5.add(spinner_1_3_5);
		
		JCheckBox chckbxNewCheckBox_1_3_5 = new JCheckBox("");
		chckbxNewCheckBox_1_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_3_5.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3_5.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3_5.isSelected()){
					
					intTot = 60*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Cuttlet"+"\t\t\t"+intTot);
					
				}
			}
		});
		chckbxNewCheckBox_1_3_5.setBounds(96, 177, 93, 21);
		panel_1_1_3_5.add(chckbxNewCheckBox_1_3_5);
		
	    lblNewLabel_4_9 = new JLabel("");
		lblNewLabel_4_9.setBounds(10, 10, 180, 95);
		panel_1_1_3_5.add(lblNewLabel_4_9);
		
		JPanel panel_1_1_3_6 = new JPanel();
		panel_1_1_3_6.setLayout(null);
		panel_1_1_3_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3_6.setBounds(517, 525, 200, 208);
		panel.add(panel_1_1_3_6);
		
		JLabel lblNewLabel_2_4_3_6 = new JLabel("Price");
		lblNewLabel_2_4_3_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3_6.setBounds(10, 115, 45, 21);
		panel_1_1_3_6.add(lblNewLabel_2_4_3_6);
		
		JLabel lblNewLabel_2_1_1_3_6 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3_6.setBounds(10, 146, 61, 21);
		panel_1_1_3_6.add(lblNewLabel_2_1_1_3_6);
		
		JLabel lblNewLabel_2_2_1_3_6 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3_6.setBounds(10, 177, 61, 21);
		panel_1_1_3_6.add(lblNewLabel_2_2_1_3_6);
		
		JLabel lblNewLabel_3_1_3_6 = new JLabel("R.80");
		lblNewLabel_3_1_3_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3_6.setBounds(96, 119, 45, 13);
		panel_1_1_3_6.add(lblNewLabel_3_1_3_6);
		
		JSpinner spinner_1_3_6 = new JSpinner();
		spinner_1_3_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3_6.setBounds(96, 146, 45, 20);
		panel_1_1_3_6.add(spinner_1_3_6);
		
		JCheckBox chckbxNewCheckBox_1_3_6 = new JCheckBox("");
		chckbxNewCheckBox_1_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                int intQty = Integer.parseInt(spinner_1_3_6.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3_6.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3_6.isSelected()){
					
					intTot = 80*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"sosejas bun"+"\t\t"+intTot);
					
				}
				
				
			}
		});
		chckbxNewCheckBox_1_3_6.setBounds(96, 177, 93, 21);
		panel_1_1_3_6.add(chckbxNewCheckBox_1_3_6);
		
		lblNewLabel_4_10 = new JLabel("");
		lblNewLabel_4_10.setBounds(10, 10, 180, 95);
		panel_1_1_3_6.add(lblNewLabel_4_10);
		
		JPanel panel_1_1_3_7 = new JPanel();
		panel_1_1_3_7.setLayout(null);
		panel_1_1_3_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_3_7.setBounds(775, 525, 200, 208);
		panel.add(panel_1_1_3_7);
		
		JLabel lblNewLabel_2_4_3_7 = new JLabel("Price");
		lblNewLabel_2_4_3_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4_3_7.setBounds(10, 115, 45, 21);
		panel_1_1_3_7.add(lblNewLabel_2_4_3_7);
		
		JLabel lblNewLabel_2_1_1_3_7 = new JLabel("Quantity");
		lblNewLabel_2_1_1_3_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_3_7.setBounds(10, 146, 61, 21);
		panel_1_1_3_7.add(lblNewLabel_2_1_1_3_7);
		
		JLabel lblNewLabel_2_2_1_3_7 = new JLabel("Parchas");
		lblNewLabel_2_2_1_3_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1_3_7.setBounds(10, 177, 61, 21);
		panel_1_1_3_7.add(lblNewLabel_2_2_1_3_7);
		
		JLabel lblNewLabel_3_1_3_7 = new JLabel("R.40");
		lblNewLabel_3_1_3_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1_3_7.setBounds(96, 119, 45, 13);
		panel_1_1_3_7.add(lblNewLabel_3_1_3_7);
		
		JSpinner spinner_1_3_7 = new JSpinner();
		spinner_1_3_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner_1_3_7.setBounds(96, 146, 45, 20);
		panel_1_1_3_7.add(spinner_1_3_7);
		
		JCheckBox chckbxNewCheckBox_1_3_7 = new JCheckBox("");
		chckbxNewCheckBox_1_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

                int intQty = Integer.parseInt(spinner_1_3_7.getValue().toString());
				
				if(intQty==0) {
					
					qtyZero();
					chckbxNewCheckBox_1_3_7.setSelected(false); 
				}else if(chckbxNewCheckBox_1_3_7.isSelected()){
					
					intTot = 40*intQty;
					lastTotal += intTot;
					textArea.setText(textArea.getText()+"\n"+"Red Tea"+"\t\t\t"+intTot);
					
				}
				
				
			}
		});
		chckbxNewCheckBox_1_3_7.setBounds(96, 177, 93, 21);
		panel_1_1_3_7.add(chckbxNewCheckBox_1_3_7);
		
		lblNewLabel_4_11 = new JLabel("");
		lblNewLabel_4_11.setBounds(10, 10, 180, 95);
		panel_1_1_3_7.add(lblNewLabel_4_11);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Vegi Roti");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_1.setBounds(323, 246, 73, 21);
		panel.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("Egg Bun");
		lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_2.setBounds(592, 246, 73, 21);
		panel.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Coffe");
		lblNewLabel_2_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_3.setBounds(844, 246, 73, 21);
		panel.add(lblNewLabel_2_3_3);
		
		JLabel lblNewLabel_2_3_4 = new JLabel("Omelette Bun");
		lblNewLabel_2_3_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_4.setBounds(60, 483, 109, 21);
		panel.add(lblNewLabel_2_3_4);
		
		JLabel lblNewLabel_2_3_5 = new JLabel("Pettis ");
		lblNewLabel_2_3_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_5.setBounds(323, 483, 73, 21);
		panel.add(lblNewLabel_2_3_5);
		
		JLabel lblNewLabel_2_3_6 = new JLabel("Rols");
		lblNewLabel_2_3_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_6.setBounds(592, 483, 73, 21);
		panel.add(lblNewLabel_2_3_6);
		
		JLabel lblNewLabel_2_3_7 = new JLabel("Tea");
		lblNewLabel_2_3_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_7.setBounds(844, 483, 73, 21);
		panel.add(lblNewLabel_2_3_7);
		
		JLabel lblNewLabel_2_3_8 = new JLabel("Red Tea");
		lblNewLabel_2_3_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_8.setBounds(844, 730, 73, 21);
		panel.add(lblNewLabel_2_3_8);
		
		JLabel lblNewLabel_2_3_6_1 = new JLabel("Sosejas Bun");
		lblNewLabel_2_3_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_6_1.setBounds(570, 730, 95, 21);
		panel.add(lblNewLabel_2_3_6_1);
		
		JLabel lblNewLabel_2_3_6_1_1 = new JLabel("Cuttlet");
		lblNewLabel_2_3_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_6_1_1.setBounds(323, 730, 73, 21);
		panel.add(lblNewLabel_2_3_6_1_1);
		
		JLabel lblNewLabel_2_3_6_1_2 = new JLabel("Egg Roti");
		lblNewLabel_2_3_6_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_3_6_1_2.setBounds(80, 730, 73, 21);
		panel.add(lblNewLabel_2_3_6_1_2);
		
		ImageIcon icon_1 = new ImageIcon(getClass().getResource("/image/vegi.jpg"));
		Image img_1 = icon_1.getImage().getScaledInstance(lblNewLabel_4_1.getWidth(),lblNewLabel_4_1.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_1.setIcon(new ImageIcon(img_1));
		
		ImageIcon icon_2 = new ImageIcon(getClass().getResource("/image/egg.jpg"));
		Image img_2 = icon_2.getImage().getScaledInstance(lblNewLabel_4_2.getWidth(),lblNewLabel_4_2.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_2.setIcon(new ImageIcon(img_2));
		
		ImageIcon icon_3 = new ImageIcon(getClass().getResource("/image/ome.jpg"));
		Image img_3 = icon_3.getImage().getScaledInstance(lblNewLabel_4_7.getWidth(),lblNewLabel_4_7.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_7.setIcon(new ImageIcon(img_3));
		
		ImageIcon icon_4 = new ImageIcon(getClass().getResource("/image/patis.jpg"));
		Image img_4 = icon_4.getImage().getScaledInstance(lblNewLabel_4_6.getWidth(),lblNewLabel_4_6.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_6.setIcon(new ImageIcon(img_4));
		
		ImageIcon icon_5 = new ImageIcon(getClass().getResource("/image/roll.jpg"));
		Image img_5 = icon_5.getImage().getScaledInstance(lblNewLabel_4_5.getWidth(),lblNewLabel_4_5.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_5.setIcon(new ImageIcon(img_5));
		
		ImageIcon icon_6 = new ImageIcon(getClass().getResource("/image/roti.jpg"));
		Image img_6 = icon_6.getImage().getScaledInstance(lblNewLabel_4_8.getWidth(),lblNewLabel_4_8.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_8.setIcon(new ImageIcon(img_6));
		
		ImageIcon icon_7 = new ImageIcon(getClass().getResource("/image/cut.jfif"));
		Image img_7 = icon_7.getImage().getScaledInstance(lblNewLabel_4_9.getWidth(),lblNewLabel_4_9.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_9.setIcon(new ImageIcon(img_7));
		
		ImageIcon icon_8 = new ImageIcon(getClass().getResource("/image/sos.jpg"));
		Image img_8 = icon_8.getImage().getScaledInstance(lblNewLabel_4_10.getWidth(),lblNewLabel_4_10.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_10.setIcon(new ImageIcon(img_8));
		
		ImageIcon icon_9 = new ImageIcon(getClass().getResource("/image/coffe.jpg"));
		Image img_9 = icon_9.getImage().getScaledInstance(lblNewLabel_4_3.getWidth(),lblNewLabel_4_3.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_3.setIcon(new ImageIcon(img_9));
		
		ImageIcon icon_10 = new ImageIcon(getClass().getResource("/image/tea.jpg"));
		Image img_10 = icon_10.getImage().getScaledInstance(lblNewLabel_4_4.getWidth(),lblNewLabel_4_4.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_4.setIcon(new ImageIcon(img_10));
		
		ImageIcon icon_11 = new ImageIcon(getClass().getResource("/image/red.jpg"));
		Image img_11 = icon_11.getImage().getScaledInstance(lblNewLabel_4_11.getWidth(),lblNewLabel_4_11.getHeight(),Image.SCALE_SMOOTH);
		lblNewLabel_4_11.setIcon(new ImageIcon(img_11));
		label.setBounds(844, 1, 126, 36);
		panel.add(label);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setForeground(new Color(64, 0, 64));
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(1034, 10, 274, 525);
		contentPane.add(textArea);
		
		setText();
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(1034, 538, 274, 251);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
	
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Paragraph p1 = new Paragraph();
				
				
				if(lastTotal==0) {
					
					JOptionPane.showMessageDialog(null,"You Haven't Select Any Item");
					
				}else {
					
					tax();
				    textArea.setText(textArea.getText()+"\n\n"+"*******************************"+"\n"+"TAX"+"\t\t\t"+intTax+"\n"+"SUB TOTAL"+"\t\t"+ lastTotal+"\n"+"TOTAL"+"\t\t\t"+(lastTotal+intTax)+"\n"+"*******************************"+"\n"+"           THANK YOU           ");
					btnNewButton.setEnabled(false);
					//JOptionPane.showMessageDialog(null,intTax);
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(84, 25, 106, 32);
		panel_2.add(btnNewButton);
		
		
		
		JButton btnRe = new JButton("Receipt");
		btnRe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(lastTotal !=0) {
					
					if(!btnNewButton.isEnabled()) {
						
						try {
							textArea.print();
						} catch (PrinterException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}else {
						
						JOptionPane.showMessageDialog(null,"First You Should Cal To Total");
						
						
					}
					
					
				}else {
					
					JOptionPane.showMessageDialog(null,"You Don't Select Any Product");
				}
				
				/*String path = "D:\\";
				com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
				
				try {
					PdfWriter.getInstance(doc, new FileOutputStream(path+""+"receipt"+".pdf"));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				doc.open();
				
				Paragraph p1 = new Paragraph(textArea.getText()+"\n\n"+"*******************************"+"\n"+"TAX"+"\t\t\t"+intTax+"\n"+"SUB TOTAL"+"\t\t"+ lastTotal+"\n"+"TOTAL"+"\t\t\t"+(lastTotal+intTax)+"\n"+"*******************************"+"\n"+"           THANK YOU           ");

				try {
					doc.add(p1);
				} catch (DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				doc.close();
				
                try {
					
					if(new File("D:\\"+"receipt"+".pdf").exists()) {
						
						Process p = Runtime
								.getRuntime()
								.exec("rundll32 url.dll,FileProtocolHandler D:\\"+"receipt"+".pdf");
						
						
					}else {
						
						System.out.println("file is not exists");
					}
					
					
				}catch(Exception r) {
					
					System.out.println(r);
				}*/
			}
			
			
		});
		btnRe.setBackground(new Color(0, 255, 255));
		btnRe.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRe.setBounds(84, 79, 106, 32);
		panel_2.add(btnRe);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Menu().setVisible(true);
			}
		});
		btnReset.setBackground(new Color(0, 255, 128));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(84, 133, 106, 32);
		panel_2.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 128, 64));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(84, 189, 106, 32);
		panel_2.add(btnExit);
		
		
		
	}
}
