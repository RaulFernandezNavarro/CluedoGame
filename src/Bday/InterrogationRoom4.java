package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class InterrogationRoom4 extends JFrame {

	private JPanel contentPane;
	private JLabel interrogationChair;
	int Pressure = 0;
	private JTextField UnlockTXT;
	private JLabel Leila;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterrogationRoom4 frame = new InterrogationRoom4();
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
	public InterrogationRoom4() {
		setBackground(new Color(204, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 887, 536);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//ITEM DECLARATION------------------------------------------------------------------------------------------------
		interrogationChair = new JLabel("");
		Leila = new JLabel("");
		JTextPane Qpanel = new JTextPane();
		JTextArea Conversation = new JTextArea();
		UnlockTXT = new JTextField();
		
		//BTN DECLARATION--------------------------------------------------------------------------------------------------
		JButton QuestionBTN = new JButton("Ask why she was hidding");
		JButton QuestionBTN_1 = new JButton("Ask how she knew about it");
		JButton QuestionBTN_2 = new JButton("Ask about the murderer");
		JButton QuestionBTN_3 = new JButton("Ask for her fingerprints");
		JButton QuestionBTN_4 = new JButton("Pressure her");
		JButton QuestionBTN_5 = new JButton("Unlock");		
		

		//SUSPECT FACE-------------------------------------------------------------------------------------------------
		ImageIcon icono2 = new ImageIcon("Extra/Leila.jpg");
		Leila.setBounds(200, 60, 130, 130);
		Image imagen2 = icono2.getImage();
		ImageIcon iconoEscalado2 = new ImageIcon (imagen2.getScaledInstance(130,150,Image.SCALE_SMOOTH)); // ancho, alto
		contentPane.setLayout(null);
		Leila.setIcon(iconoEscalado2);
		contentPane.add(Leila);
		
		//INTERROGATION CHAIR ----------------------------------------------------------------------------------------------
		ImageIcon icono = new ImageIcon("Extra/interrogation.png");
		interrogationChair.setBounds(10, 10, 425, 300);
		Image imagen = icono.getImage();
		ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(425,300,Image.SCALE_SMOOTH)); // ancho, alto
		contentPane.setLayout(null);
		interrogationChair.setIcon(iconoEscalado);
		contentPane.add(interrogationChair);
		
		//QUESTION BTN 0 ----------------------------------------------------------------------------------------------
		QuestionBTN.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN.setBounds(25, 360, 177, 30);
		QuestionBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  Why were you hidding?");
				Conversation.append("\n LEILA:  I was scared, I saw what happened to Sandra.\n");
				QuestionBTN_1.setVisible(true);
			}
		});
		contentPane.add(QuestionBTN);
		
		//QUESTION BTN 1 ----------------------------------------------------------------------------------------------
		QuestionBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_1.setBounds(26, 400, 177, 30);
		QuestionBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  How is it possible that you saw what happened to her?");
				Conversation.append("\n LEILA:  She called me and told me she had discovered something and that\n she needed my help. She wanted me to drive her somewhere, wouldn't say\n where. When I arrived and went into the lab I saw her, but also heard some\n noises, so I ran. While I was driving home I felt like a car was following me,\n I decided not to go home I was scared they would find out where I lived and\n hurt Dwayne. So I drove pass the house, I lost them shortly after and went to\n a motel place. I stayed there until the police found me today.\n");
				QuestionBTN_2.setVisible(true);
			}
		});
		contentPane.add(QuestionBTN_1);
		QuestionBTN_1.setVisible(false);
		
		//QUESTION BTN 2 ----------------------------------------------------------------------------------------------
		QuestionBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_2.setBounds(26, 440, 177, 30);
		QuestionBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Conversation.append("\n LT. PLUILAART:  Did you see this person at any moment?");
				Conversation.append("\n LEILA:  No, as soon as I heard the noises I ran out as quick as I could.");
				Conversation.append("\n LT. PLUILAART:  Can you describe the car that followed you?\n Did you see the license plate?");
				Conversation.append("\n LEILA:  I'm sorry but I was really scared, I was only focusing on escaping.\n I didn't see anything, no.\n");
			}
		});
		contentPane.add(QuestionBTN_2);
		QuestionBTN_2.setVisible(false);
		
		//QUESTION BTN 3 ----------------------------------------------------------------------------------------------
		QuestionBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_3.setBounds(239, 360, 177, 30);
		QuestionBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  We are going to take you fingerprints before you go.");
				Conversation.append("\n SOPHIE:  Yes . . . I guess . . . no problem.\n");
				
			}
		});
		contentPane.add(QuestionBTN_3);
		QuestionBTN_3.setVisible(false);

		//QUESTION BTN 4 ----------------------------------------------------------------------------------------------
		QuestionBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_4.setBounds(239, 400, 177, 30);
		QuestionBTN_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		contentPane.add(QuestionBTN_4);
		QuestionBTN_4.setVisible(false);
		
		//UNLOCK  TXT-------------------------------------------------------------------------------------------------
		UnlockTXT.setBounds(239, 440, 95, 30);
		contentPane.add(UnlockTXT);
		UnlockTXT.setColumns(10);
		

		//QUESTION BTN 5 ----------------------------------------------------------------------------------------------
		QuestionBTN_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		QuestionBTN_5.setBounds(341, 440, 75, 30);
		QuestionBTN_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (UnlockTXT.getText().equalsIgnoreCase("sophie") || UnlockTXT.getText().equalsIgnoreCase("fingerprints")) {
					QuestionBTN_3.setVisible(true);
				}
			}
		});
		contentPane.add(QuestionBTN_5);
		

		//QUESTION PANEL-------------------------------------------------------------------------------------------------
		Qpanel.setEditable(false);
		Qpanel.setText("\t                QUESTIONING PANEL");
		Qpanel.setFont(new Font("Californian FB", Font.ITALIC, 20));
		Qpanel.setBackground(new Color(204, 204, 204));
		Qpanel.setBounds(10, 323, 425, 163);
		contentPane.add(Qpanel);
		

		//CONVERSATION AREA-----------------------------------------------------------------------------------------------
		Conversation.setBackground(new Color(204, 204, 153));
		Conversation.setEditable(false);
		Conversation.setBounds(445, 10, 416, 476);
		Conversation.append(" LT. PLUILAART:  Hello Leila, you were hard to find. We are going to ask you\n some questions.\n");
		contentPane.add(Conversation);
		
		
		
		
		
		
	}
}
