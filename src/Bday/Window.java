package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private JPanel FirstScreen;
	private JTextField namebox;
	private JButton ReadyBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 462);
		
		//PRIMERA PANTALLA ---------------------------------------------------------------
		
		FirstScreen = new JPanel();
		FirstScreen.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FirstScreen);
		FirstScreen.setLayout(null);
		
		JTextPane txtpnWelcomeToYour = new JTextPane();
		txtpnWelcomeToYour.setEditable(false);
		txtpnWelcomeToYour.setBackground(new Color(220, 220, 220));
		txtpnWelcomeToYour.setText("WELCOME TO YOUR CRAZY BIRTHDAY\r\n\r\n\r\nPlease enter your name:\r\n");
		txtpnWelcomeToYour.setFont(new Font("Californian FB", Font.ITALIC, 20));
		txtpnWelcomeToYour.setBounds(21, 21, 536, 299);
		FirstScreen.add(txtpnWelcomeToYour);
		
		namebox = new JTextField();
		namebox.setBounds(176, 342, 254, 34);
		FirstScreen.add(namebox);
		namebox.setColumns(10);
		
		JButton FabulizeBtn = new JButton("Fabulize!");
		FabulizeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Window2 W2 = new Window2();
				W2.setVisible(true);
				Window.this.dispose();
				
			}
		});
		FabulizeBtn.setBounds(491, 389, 89, 23);
		FirstScreen.add(FabulizeBtn);
		FabulizeBtn.setVisible(false);
		
		ReadyBtn = new JButton("Ready!");
		ReadyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				txtpnWelcomeToYour.setText("Well . . . . to be honest I don't really care \n.\n.\n.\n.\n I will call you BABYS \r\n\r\n\r\n Now, shall we make this a bit prettier?");
				FirstScreen.add(txtpnWelcomeToYour);
				FabulizeBtn.setVisible(true);
				ReadyBtn.setVisible(false);
				namebox.setVisible(false);
				
				
			}
		});
		ReadyBtn.setBounds(491, 389, 89, 23);
		FirstScreen.add(ReadyBtn);
	}
}
