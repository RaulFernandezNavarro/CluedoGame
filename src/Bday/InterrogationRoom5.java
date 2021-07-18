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

public class InterrogationRoom5 extends JFrame {

	private JPanel contentPane;
	private JLabel interrogationChair;
	int Pressure = 0;
	private JTextField UnlockTXT;
	private JLabel Dwayne;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterrogationRoom5 frame = new InterrogationRoom5();
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
	public InterrogationRoom5() {
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
		JButton QuestionBTN = new JButton("Ask how she knew Sandra");
		JButton QuestionBTN_1 = new JButton("About Sandra's work");
		JButton QuestionBTN_2 = new JButton("Ask about plane ticket");
		JButton QuestionBTN_3 = new JButton("Ask who was she scared of");
		JButton QuestionBTN_4 = new JButton("Ask about boss");
		JButton QuestionBTN_5 = new JButton("Unlock");		
		

		//SUSPECT FACE-------------------------------------------------------------------------------------------------
		/*ImageIcon icono2 = new ImageIcon("Extra/skype.jpg");
		Dwayne.setBounds(200, 60, 130, 130);
		Image imagen2 = icono2.getImage();
		ImageIcon iconoEscalado2 = new ImageIcon (imagen2.getScaledInstance(130,130,Image.SCALE_SMOOTH)); // ancho, alto
		contentPane.setLayout(null);
		Dwayne.setIcon(iconoEscalado2);
		//contentPane.add(Dwayne);*/
		
		//INTERROGATION CHAIR ----------------------------------------------------------------------------------------------
		ImageIcon icono = new ImageIcon("Extra/skype.jpg");
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
				Conversation.append("\n LT. PLUILAART:  So, how did you know Sandra?");
				Conversation.append("\n HANNAH:  She was a good friend of mine, we met in an exchange program,\n studying abroad in the USA.\n");
			}
		});
		contentPane.add(QuestionBTN);
		
		//QUESTION BTN 1 ----------------------------------------------------------------------------------------------
		QuestionBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_1.setBounds(26, 400, 177, 30);
		QuestionBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  Do you know what Sandra was working on?");
				Conversation.append("\n HANNAH:  She never was very specific, because it was some kind of\n classified operation, but in the last days she was really worried.\n She had found out that what they were actually working on was\n a biological weapon.\n");
			}
		});
		contentPane.add(QuestionBTN_1);
		
		//QUESTION BTN 2 ----------------------------------------------------------------------------------------------
		QuestionBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_2.setBounds(26, 440, 177, 30);
		QuestionBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Conversation.append("\n LT. PLUILAART:  What can you tell me about a plane ticket she had\n bought to London?");
				Conversation.append("\n HANNAH:  She got really scared and she needed somewhere safe to stay.\n");
				QuestionBTN_3.setVisible(true);
			}
		});
		contentPane.add(QuestionBTN_2);
		QuestionBTN_2.setVisible(false);
		
		//QUESTION BTN 3 ----------------------------------------------------------------------------------------------
		QuestionBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_3.setBounds(239, 360, 177, 30);
		QuestionBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  What was she scared of?");
				Conversation.append("\n HANNAH:  I am not sure, she called me in a rush, said that someone\n had approached her about the weapon, he wanted to buy it from her and\n that she was in danger. She didn't mention any names, but she said she\n got offered 5 million euros . . .  5 millions, Lord the things I would do\n with that kind of money...\n");
				
			}
		});
		contentPane.add(QuestionBTN_3);
		QuestionBTN_3.setVisible(false);

		//QUESTION BTN 4 ----------------------------------------------------------------------------------------------
		QuestionBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		QuestionBTN_4.setBounds(239, 400, 177, 30);
		QuestionBTN_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversation.append("\n LT. PLUILAART:  What can you tell me about her boss? ");
				Conversation.append("\n HANNAH:  Oh yes, that military sargeant. I recall her complaining about how\n the man had them constantly in the edge, always talking about a lot of\n pressure.\n");
			}
		});
		contentPane.add(QuestionBTN_4);
		
		
		//UNLOCK  TXT-------------------------------------------------------------------------------------------------
		UnlockTXT.setBounds(239, 440, 95, 30);
		contentPane.add(UnlockTXT);
		UnlockTXT.setColumns(10);
		

		//QUESTION BTN 5 ----------------------------------------------------------------------------------------------
		QuestionBTN_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		QuestionBTN_5.setBounds(341, 440, 75, 30);
		QuestionBTN_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pass = UnlockTXT.getText().toLowerCase();
				switch(Pass) {
					case "plane":
						QuestionBTN_2.setVisible(true);
						break;
					case "plane ticket":
						QuestionBTN_2.setVisible(true);
						break;
					case "ticket":
						QuestionBTN_2.setVisible(true);
						break;
					case "fly ticket":
						QuestionBTN_2.setVisible(true);
						break;
					
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
		Conversation.append(" LT. PLUILAART:  Hello Hannah, thank you for calling with me.");
		Conversation.append("\n HANNAH:  Of course, anything I can do to help Detective.\n");
		contentPane.add(Conversation);
		
		
		
		
		
		
	}
}
