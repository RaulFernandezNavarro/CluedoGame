package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class CodeWindow extends JFrame {

	protected static final String Comment = "";
	private JPanel contentPane;
//SENDS A POP UP WITH THE DESIRED MESSAGE	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeWindow frame = new CodeWindow(Comment);
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
	public CodeWindow(String comment) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 126);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCongratulations = new JTextPane();
		txtpnCongratulations.setBackground(new Color(51, 153, 51));
		txtpnCongratulations.setText("\t\t                         CONGRATULATIONS!\r\n" + comment);
		txtpnCongratulations.setEditable(false);
		txtpnCongratulations.setFont(new Font("Californian FB", Font.ITALIC, 20));
		txtpnCongratulations.setBounds(10, 11, 628, 66);
		contentPane.add(txtpnCongratulations);
	}
}
