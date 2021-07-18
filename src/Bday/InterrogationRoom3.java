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

public class InterrogationRoom3 extends JFrame {

	private JPanel contentPane;
	private JLabel interrogationChair;
	int Pressure = 0;
	int question = 0;
	private JTextField UnlockTXT;
	private JLabel Dwayne;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterrogationRoom3 frame = new InterrogationRoom3();
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
	public InterrogationRoom3() {
		setBackground(new Color(204, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 887, 536);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//ITEM DECLARATION------------------------------------------------------------------------------------------------
		interrogationChair = new JLabel("");
		Dwayne = new JLabel("");
		JTextPane Qpanel = new JTextPane();
		JTextArea Conversation = new JTextArea();
		UnlockTXT = new JTextField();
		
		//BTN DECLARATION--------------------------------------------------------------------------------------------------
		JButton QuestionBTN = new JButton("Ask about project");
		JButton QuestionBTN_1 = new JButton("Ask about Sandra");
		JButton QuestionBTN_2 = new JButton("Pressure");
		JButton QuestionBTN_3 = new JButton("Ask for his fingerprints");
		JButton QuestionBTN_4 = new JButton("Write your own question");
		JButton QuestionBTN_5 = new JButton("Unlock");		
		

		//SUSPECT FACE-------------------------------------------------------------------------------------------------
		ImageIcon icono2 = new ImageIcon("Extra/SGMgomezSquare.jpg");
		Dwayne.setBounds(200, 60, 130, 130);
		Image imagen2 = icono2.getImage();
		ImageIcon iconoEscalado2 = new ImageIcon (imagen2.getScaledInstance(140,130,Image.SCALE_SMOOTH)); // ancho, alto
		contentPane.setLayout(null);
		Dwayne.setIcon(iconoEscalado2);
		contentPane.add(Dwayne);
		
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
				Conversation.append("\n LT. PLUILAART: What is your relation to the project Sandra was working on?");
				Conversation.append("\n SGM GOMEZ:  I have no idea how you got that information, but that is\n classified, I am affraid I can't talk about it.");
				Conversation.append("\n LT. PLUILAART:  Maybe it was classified, but now it's part of a murder\n investigation. I will find about it one way or another.");
				Conversation.append("\n SGM GOMEZ:  Good luck with that Lieutenant.\n");
			}
		});
		contentPane.add(QuestionBTN);
		
		//QUESTION BTN 1 ----------------------------------------------------------------------------------------------
		QuestionBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_1.setBounds(26, 400, 177, 30);
		QuestionBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  Did you know Sandra? How was your professional\n relationship with her?");
				Conversation.append("\n SGM GOMEZ:  I have no idea what you are talking about Lieutenant,\n as I told you: CLASSIFIED INFORMATION.\n");
				QuestionBTN_2.setVisible(true);
			}
		});
		contentPane.add(QuestionBTN_1);
		
		//QUESTION BTN 2 ----------------------------------------------------------------------------------------------
		QuestionBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_2.setBounds(26, 440, 177, 30);
		QuestionBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(Pressure) {
				case 0:
					Conversation.append("\n LT. PLUILAART:  You are making a mistake, remember you brought me\n into this case, and I am going to get that information, I assure you.");
					Conversation.append("\n SGM GOMEZ:  So are you, remember who you are talking to.\n");
					break;
				case 1:
					Conversation.append("\n LT. PLUILAART:  Maybe not to me, but you will answer to someone,\n there is still people with power over you.");
					Conversation.append("\n SGM GOMEZ:  There is also people with power over you, and as it\n turns out, I am one of them, you should keep that in mind.\n");
					QuestionBTN_2.setVisible(false);
					OfficerJorrisWindow JSGM = new OfficerJorrisWindow(0, "\n\n                          ¡¡WOW!!\n\n  WHAT AN ASS, am I right boss?\n\n\n  Looks like we will have to approach\n  this from another point of view.");
					JSGM.setVisible(true);
					break;
				
				}
			Pressure ++;
			}
		});
		contentPane.add(QuestionBTN_2);
		QuestionBTN_2.setVisible(false);
		
		//QUESTION BTN 3 ----------------------------------------------------------------------------------------------
		QuestionBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_3.setBounds(239, 360, 177, 30);
		QuestionBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  We are going to need your fingerprints.");
				Conversation.append("\n SGM GOMEZ:  I am a military officer, all my data is in the\n agency's database.\n");
				//QuestionBTN_4.setVisible(true);
			}
		});
		contentPane.add(QuestionBTN_3);
		QuestionBTN_3.setVisible(false);

		//QUESTION BTN 4 ----------------------------------------------------------------------------------------------
		QuestionBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_4.setBounds(239, 400, 177, 30);
		QuestionBTN_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WritingBox WB1 = new WritingBox();
				WB1.setVisible(true);
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
				}else if(UnlockTXT.getText().equalsIgnoreCase("question")) {
					
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
		Conversation.append(" LT. PLUILAART:  Hello Sargeant, I am going to ask you a few questions.");
		Conversation.append("\n SGM GOMEZ:  Why am I here Lieutenant?\n Shouldn't you be investigating a murder?\n");
		contentPane.add(Conversation);
		
		
		
		
		
		
	}
}
