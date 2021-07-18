package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WritingBox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	protected static final String Content_lawyer = "\n ¡¡¡Damn it boss!!! \n\n It seems that this one lawyered up\n The lawyer advised not to\n say another word.\n\n Looks like no one will be talking here.";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WritingBox frame = new WritingBox();
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
	public WritingBox() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 333, 80);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 231, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OfficerJorrisWindow J1 = new OfficerJorrisWindow(1, Content_lawyer);
				J1.setVisible(true);
				WritingBox.this.dispose();
			}
		});
		btnNewButton.setBounds(251, 10, 56, 23);
		contentPane.add(btnNewButton);
	}
}
