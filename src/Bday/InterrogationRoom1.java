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

public class InterrogationRoom1 extends JFrame {

	private JPanel contentPane;
	private JLabel interrogationChair;
	int Pressure = 0;
	private JTextField UnlockTXT;
	private JLabel sterre;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterrogationRoom1 frame = new InterrogationRoom1();
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
	public InterrogationRoom1() {
		setBackground(new Color(204, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 887, 536);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//ITEM DECLARATION------------------------------------------------------------------------------------------------
		interrogationChair = new JLabel("");
		sterre = new JLabel("");
		JTextPane Qpanel = new JTextPane();
		JTextArea Conversation = new JTextArea();
		UnlockTXT = new JTextField();
		
		//BTN DECLARATION--------------------------------------------------------------------------------------------------
		JButton QuestionBTN = new JButton("Ask about body");
		JButton QuestionBTN_1 = new JButton("Ask how they knew each other");
		JButton QuestionBTN_2 = new JButton("Ask who about Leila");
		JButton QuestionBTN_3 = new JButton("Ask for her fingerprints");
		JButton QuestionBTN_4 = new JButton("Pressure her");
		JButton QuestionBTN_5 = new JButton("Unlock");		
		

		//SUSPECT FACE-------------------------------------------------------------------------------------------------
		ImageIcon icono2 = new ImageIcon("Extra/SterreSquared.jpg");
		sterre.setBounds(200, 60, 130, 130);
		Image imagen2 = icono2.getImage();
		ImageIcon iconoEscalado2 = new ImageIcon (imagen2.getScaledInstance(130,130,Image.SCALE_SMOOTH)); // ancho, alto
		contentPane.setLayout(null);
		sterre.setIcon(iconoEscalado2);
		contentPane.add(sterre);
		
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
				Conversation.append("\n LT. PLUILAART:  I have been told that you found the body.");
				Conversation.append("\n STERRE:  That's right, yes. I found it this morning when I came to work.\n It's so sad, I can't believe she's gone, she was so sweet and nice, she\n was such a good person.\n");
			}
		});
		contentPane.add(QuestionBTN);
		
		//QUESTION BTN 1 ----------------------------------------------------------------------------------------------
		QuestionBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_1.setBounds(26, 400, 177, 30);
		QuestionBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  How well did you knew Sandra?");
				Conversation.append("\n STERRE:  We met at the lab when she first came a couple of months ago,\n we got along really well, even went for beers a couple of times with Leila.\n");
				QuestionBTN_2.setVisible(true);
			}
		});
		contentPane.add(QuestionBTN_1);
		
		//QUESTION BTN 2 ----------------------------------------------------------------------------------------------
		QuestionBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_2.setBounds(26, 440, 177, 30);
		QuestionBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Conversation.append("\n LT. PLUILAART:  Who is this Leila?");
				Conversation.append("\n STERRE:  Oh, Leila is the other Doctor that works in the lab with us.");
				Conversation.append("\n LT. PLUILAART:  Did she had any problems with Sandra?");
				Conversation.append("\n STERRE:  Oh God, no. We were all very close here, even Leila\n and her husband Dwayne, we were all like a family\n");
				CodeWindow CW1 = new CodeWindow("Looks like you have learned a couple of new names, try entering them in the main screen.");
				CW1.setVisible(true);

			}
		});
		contentPane.add(QuestionBTN_2);
		QuestionBTN_2.setVisible(false);
		
		//QUESTION BTN 3 ----------------------------------------------------------------------------------------------
		QuestionBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_3.setBounds(239, 360, 177, 30);
		QuestionBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  We are collecting all the evidence from the Lab to close up\n the case already, so once we get your fingerprints you will be all set to go.");
				Conversation.append("\n STERRE:  I would rather not do that, I'd prefer not having a criminal record.\n");
				QuestionBTN_4.setVisible(true);
			}
		});
		contentPane.add(QuestionBTN_3);
		QuestionBTN_3.setVisible(false);

		//QUESTION BTN 4 ----------------------------------------------------------------------------------------------
		QuestionBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_4.setBounds(239, 400, 177, 30);
		QuestionBTN_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(Pressure) {
					case 0:
						Conversation.append("\n LT. PLUILAART:  Oh don't worry! We just need your fingerprints, you will not\n have a criminal record.");
						Conversation.append("\n STERRE:  I am sorry, but I am really paranoid about my personal data.\n");
						break;
					case 1:
						Conversation.append("\n LT. PLUILAART:  Well, I can also get a warrant, it will take more time, \n but in the end I will have what I need sterre.");
						Conversation.append("\n STERRE:  . . . .\n");
						break;
					case 2:
						Conversation.append("\n LT. PLUILAART:  I mean, after all, you don't have anything to hide, do you?");
						Conversation.append("\n STERRE:  No! You are right, here you have.\n");
						QuestionBTN_4.setVisible(false);
						break;
						
				}
				Pressure ++;
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
				if (UnlockTXT.getText().equalsIgnoreCase("fingerprints") || UnlockTXT.getText().equalsIgnoreCase("sophie")) {
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
		Conversation.append(" LT. PLUILAART:  Hello Sterre, I am going to ask you a few questions.");
		Conversation.append("\n STERRE:  Sure, anything I can do to help.\n");
		contentPane.add(Conversation);
		
		
		
		
		
		
	}
}
