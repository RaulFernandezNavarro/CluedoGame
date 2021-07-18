package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import javax.swing.Action;
import Bday.*;

public class Window3 extends JFrame {

	private JPanel contentPane;
	private JLabel biohazard;
	private JTextField RomkidTITLE;
	private JTextField Password;
	int Lpass = 0;
	//int leila = 0;
	protected static final String Content_added = "\n You got it boss! \n\n I added the information you asked\n me for";
	protected static final String Content_not_found = "\n Sorry boss! \n\n I could not find what you asked\n me for";
	protected static final String Content_not_Leila = "\n ¡¡¡Damn it boss!!! \n\n It seems that the person we are \n looking for is currently missing.\n\n I think we should look into it.";
	protected static final int good = 0;
	protected static final int bad = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window3 frame = new Window3();
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
	public Window3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 40, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
/////////////////////////////////////////////////////////////////	DECLARATIONS		/////////////////////////////////////////////////////////////////
		
		//ITEM DECLARATION ---------------------------------------------------------------------------
		biohazard = new JLabel("");
		RomkidTITLE = new JTextField();
		JTextPane PRtext = new JTextPane();
		JTextPane CStext = new JTextPane();
		CStext.setEditable(false);
		JTextPane Ftext = new JTextPane();
		Ftext.setEditable(false);
		JTextPane Itext = new JTextPane();
		Itext.setEditable(false);
		Password = new JTextField();
		Password.setFont(new Font("Californian FB", Font.ITALIC, 16));
		OfficerJorrisWindow J1 = new OfficerJorrisWindow(good , Content_added);
		OfficerJorrisWindow J2 = new OfficerJorrisWindow(bad , Content_not_found);
		OfficerJorrisWindow JL = new OfficerJorrisWindow(bad , Content_not_Leila);
		JTextPane YourTeam = new JTextPane();

		
		
		//BTN DECLARATION ----------------------------------------------------------------------------
		JButton NextBTN_1 = new JButton("Next\r\n");
		JButton BiohazardBTN = new JButton("Biohazard\r\n");
		JButton PersonalReportBTN = new JButton("SANDRA");
		JButton PersonalReportBTN_1 = new JButton("SGM G\u00D3MEZ");
		JButton PersonalReportBTN_2 = new JButton("STERRE");
		JButton PersonalReportBTN_3 = new JButton("DWAYNE");
		JButton PersonalReportBTN_4 = new JButton("LEILA");
		JButton PersonalReportBTN_5 = new JButton("LT PLUILAART");
		JButton CrimeSceneBTN = new JButton("MURDER SCENE");
		JButton CrimeSceneBTN_1 = new JButton("SANDRA'S");
		JButton CrimeSceneBTN_2 = new JButton("DWAYNE'S");
		JButton CrimeSceneBTN_3 = new JButton("GOMEZ'S");
		JButton CrimeSceneBTN_4 = new JButton("New button");
		JButton CrimeSceneBTN_5 = new JButton("New button");
		JButton ForensicsBTN = new JButton("SCREENS");
		JButton ForensicsBTN_1 = new JButton("OBJECTS");
		JButton ForensicsBTN_2 = new JButton("FINGERPRINTS");
		JButton ForensicsBTN_3 = new JButton("New button");
		JButton ForensicsBTN_4 = new JButton("New button");
		JButton ForensicsBTN_5 = new JButton("New button");
		JButton InterrogationBTN = new JButton("STERRE");
		JButton InterrogationBTN_1 = new JButton("DWAYNE");
		JButton InterrogationBTN_2 = new JButton("SGM GOMEZ");
		JButton InterrogationBTN_3 = new JButton("LEILA");
		JButton InterrogationBTN_4 = new JButton("HANNAH");
		JButton InterrogationBTN_5= new JButton("New button");
		JButton SolveBTN = new JButton("SOLVE CASE");
		JButton KeyBTN = new JButton("\uD83D\uDDDD");
		JButton YTSOPHIE = new JButton("SOPHIE");
		JButton JORIS = new JButton("LT PLUILAART");
		JButton btnNewButton = new JButton("TUTORIAL");
				
		
		//BIOHAZARD ---------------------------------------------------------------------------------
		ImageIcon icono = new ImageIcon("Extra/biohazard.png");
		Image imagen = icono.getImage();
		ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(425,300,Image.SCALE_SMOOTH)); // ancho, alto
		biohazard.setIcon(iconoEscalado);
		biohazard.setBounds(430, 200 , 425, 300);// eje x, eje y, ancho, alto
		contentPane.add(biohazard);
		
		//TITLE -------------------------------------------------------------------------------------------
		JTextPane title = new JTextPane();
		title.setBackground(new Color(255, 255, 0));
		title.setEditable(false);
		title.setText("\t       \tWELCOME TO ROMKID_19");
		title.setFont(new Font("Californian FB", Font.ITALIC, 30));
		title.setBounds(337, 11, 630, 54);
		contentPane.add(title);
		
		//Next BTN ---------------------------------------------------------------------------------------
		NextBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				biohazard.setVisible(false);
				BiohazardBTN.setVisible(false);
				title.setVisible(false);
				RomkidTITLE.setVisible(true);
				PRtext.setVisible(true);
				NextBTN_1.setVisible(false);
				CStext.setVisible(true);
				Ftext.setVisible(true);
				Itext.setVisible(true);
				SolveBTN.setVisible(true);
				KeyBTN.setVisible(true);
				Password.setVisible(true);
				YTSOPHIE.setVisible(true);
				JORIS.setVisible(true);
				YourTeam.setVisible(true);
				btnNewButton.setVisible(false);
				
				
			}
		});
		NextBTN_1.setBounds(1185, 627, 89, 23);
		contentPane.add(NextBTN_1);
		NextBTN_1.setVisible(false);
		
		//biohazard BTN ---------------------------------------------------------------------------------------
		BiohazardBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Video intro -----------------------------------------------------------------------------------
				abrirarchivo("Extra/Intro.mp4");
				try {
					Thread.sleep(5*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				NextBTN_1.setVisible(true);
				btnNewButton.setVisible(true);
				
				
			}
		});
		BiohazardBTN.setBackground(new Color(255, 255, 0));
		BiohazardBTN.setFont(new Font("Californian FB", Font.ITALIC, 18));
		BiohazardBTN.setBounds(544, 559, 191, 45);
		contentPane.add(BiohazardBTN);
		
		//TUTORIAL---------------------------------------------------------------------
		btnNewButton.setBounds(1159, 598, 115, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abrirarchivo("Extra/Tutorial.mp4");
			}
		});
		contentPane.add(btnNewButton);
		btnNewButton.setVisible(false);
		YourTeam.setVisible(false);
		
		//ROMKID TITLE -------------------------------------------------------------------------------------------
		RomkidTITLE.setForeground(new Color(255, 255, 0));
		RomkidTITLE.setText("ROMKID_19");
		RomkidTITLE.setEditable(false);
		RomkidTITLE.setBackground(new Color(0, 0, 51));
		RomkidTITLE.setHorizontalAlignment(SwingConstants.CENTER);
		RomkidTITLE.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 30));
		RomkidTITLE.setBounds(544, 11, 191, 45);
		contentPane.add(RomkidTITLE);
		RomkidTITLE.setColumns(10);
		RomkidTITLE.setVisible(false);
		
		/////////////////////////////////////////////////////////////////	BTN		/////////////////////////////////////////////////////////////////
		
		//LT PLUILAART BTN ---------------------------------------------------------------------------------------
		PersonalReportBTN.setFont(new Font("Californian FB", Font.ITALIC, 14));
		PersonalReportBTN.setBounds(219, 113, 124, 45);
		PersonalReportBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/SandraPF.pdf");
			}
		});
		contentPane.add(PersonalReportBTN);
		PersonalReportBTN.setVisible(false);
		
		//LT PLUILAART BTN ---------------------------------------------------------------------------------------
		PersonalReportBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		PersonalReportBTN_1.setBounds(394, 113, 124, 45);
		PersonalReportBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/SGMGomezPF.pdf");
			}
		});
		contentPane.add(PersonalReportBTN_1);
		PersonalReportBTN_1.setVisible(false);
		
		//LT PLUILAART BTN ---------------------------------------------------------------------------------------
		PersonalReportBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		PersonalReportBTN_2.setBounds(575, 113, 124, 45);
		PersonalReportBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/SterrePF.pdf");
			}
		});
		contentPane.add(PersonalReportBTN_2);
		PersonalReportBTN_2.setVisible(false);
		
		//LT PLUILAART BTN ---------------------------------------------------------------------------------------
		PersonalReportBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		PersonalReportBTN_3.setBounds(731, 113, 124, 45);
		PersonalReportBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/DwaynePF.pdf");
			}
		});
		contentPane.add(PersonalReportBTN_3);
		PersonalReportBTN_3.setVisible(false);
		
		//LT PLUILAART BTN ---------------------------------------------------------------------------------------
		PersonalReportBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		PersonalReportBTN_4.setBounds(894, 113, 124, 45);
		PersonalReportBTN_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/LeilaPF.pdf");
			}
		});
		contentPane.add(PersonalReportBTN_4);
		PersonalReportBTN_4.setVisible(false);
		
		//LT PLUILAART BTN ---------------------------------------------------------------------------------------
		PersonalReportBTN_5.setFont(new Font("Californian FB", Font.ITALIC, 14));
		PersonalReportBTN_5.setBounds(1059, 113, 124, 45);
		PersonalReportBTN_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//abrirarchivo("Extra/LTPluilaartPF.pdf");
			}
		});
		contentPane.add(PersonalReportBTN_5);
		PersonalReportBTN_5.setVisible(false);
		
		// CRIME SCENE BTN 0 ------------------------------------------------------------------------------------
		CrimeSceneBTN.setFont(new Font("Californian FB", Font.ITALIC, 14));
		CrimeSceneBTN.setBounds(221, 209, 124, 45);
		CrimeSceneBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/CrimeScene1.jpg");
				try {
					Thread.sleep(3*1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				WindowCrime1 C1 = new WindowCrime1();
				C1.setVisible(true);
			}
		});
		contentPane.add(CrimeSceneBTN);
		CrimeSceneBTN.setVisible(false);
		
		
		// CRIME SCENE BTN 1 ------------------------------------------------------------------------------------
		CrimeSceneBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		CrimeSceneBTN_1.setBounds(394, 209, 124, 45);
		CrimeSceneBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/Sandras.jpg");
				try {
					Thread.sleep(3*1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				WindowCrime2 WC2 = new WindowCrime2();
				
				WC2.setVisible(true);
			}
		});
		contentPane.add(CrimeSceneBTN_1);
		CrimeSceneBTN_1.setVisible(false);
			
		// CRIME SCENE BTN 2 ------------------------------------------------------------------------------------
		CrimeSceneBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		CrimeSceneBTN_2.setBounds(575, 209, 124, 45);
		CrimeSceneBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/DwaynesDesk.jpg");
				try {
					Thread.sleep(5*1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				WindowCrime3 WC3 = new WindowCrime3();
				WC3.setVisible(true);
			}
		});
		contentPane.add(CrimeSceneBTN_2);
		CrimeSceneBTN_2.setVisible(false);
				
		// CRIME SCENE BTN 3 ------------------------------------------------------------------------------------
		CrimeSceneBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		CrimeSceneBTN_3.setBounds(731, 209, 124, 45);
		contentPane.add(CrimeSceneBTN_3);
		CrimeSceneBTN_3.setVisible(false);
				
		// CRIME SCENE BTN 4 ------------------------------------------------------------------------------------
		CrimeSceneBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		CrimeSceneBTN_4.setBounds(1059, 209, 124, 45);
		contentPane.add(CrimeSceneBTN_4);
		CrimeSceneBTN_4.setVisible(false);
				
		// CRIME SCENE BTN 5 ------------------------------------------------------------------------------------
		CrimeSceneBTN_5.setFont(new Font("Californian FB", Font.ITALIC, 14));
		CrimeSceneBTN_5.setBounds(894, 209, 124, 45);
		contentPane.add(CrimeSceneBTN_5);
		CrimeSceneBTN_5.setVisible(false);
		
		//FORENSICS BTN 0 ---------------------------------------------------------------------------------------
		ForensicsBTN.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ForensicsBTN.setBounds(219, 297, 124, 45);
		ForensicsBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreensWindow SC1 = new ScreensWindow();
				SC1.setVisible(true);
			}
		});
		contentPane.add(ForensicsBTN);
		ForensicsBTN.setVisible(false);
		
		//FORENSICS BTN 1 ---------------------------------------------------------------------------------------
		ForensicsBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ForensicsBTN_1.setBounds(394, 297, 124, 45);
		ForensicsBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ObjectsWindow OW = new ObjectsWindow();
				OW.setVisible(true);
			}
		});
		contentPane.add(ForensicsBTN_1);
		ForensicsBTN_1.setVisible(false);
		
		//FORENSICS BTN 2 ---------------------------------------------------------------------------------------
		ForensicsBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ForensicsBTN_2.setBounds(575, 297, 124, 45);
		ForensicsBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FingerprintsWindow FW = new FingerprintsWindow();
				FW.setVisible(true);
			}
		});
		contentPane.add(ForensicsBTN_2);
		ForensicsBTN_2.setVisible(false);
		
		//FORENSICS BTN 3 ---------------------------------------------------------------------------------------
		ForensicsBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ForensicsBTN_3.setBounds(731, 297, 124, 45);
		contentPane.add(ForensicsBTN_3);
		ForensicsBTN_3.setVisible(false);
		
		//FORENSICS BTN 4 ---------------------------------------------------------------------------------------
		ForensicsBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ForensicsBTN_4.setBounds(894, 297, 124, 45);
		contentPane.add(ForensicsBTN_4);
		ForensicsBTN_4.setVisible(false);
		
		//FORENSICS BTN 5 ---------------------------------------------------------------------------------------
		ForensicsBTN_5.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ForensicsBTN_5.setBounds(1059, 297, 124, 45);
		contentPane.add(ForensicsBTN_5);
		ForensicsBTN_5.setVisible(false);
		
		//INTERROGATION BTN 0 -----------------------------------------------------------------------------------
		InterrogationBTN.setFont(new Font("Californian FB", Font.ITALIC, 14));
		InterrogationBTN.setBounds(219, 388, 124, 45);
		InterrogationBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterrogationRoom1 I1 = new InterrogationRoom1();
				I1.setVisible(true);
			}
		});
		contentPane.add(InterrogationBTN);
		InterrogationBTN.setVisible(false);
		
		//INTERROGATION BTN 1 -----------------------------------------------------------------------------------
		InterrogationBTN_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		InterrogationBTN_1.setBounds(394, 388, 124, 45);
		InterrogationBTN_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterrogationRoom2 I2 = new InterrogationRoom2();
				I2.setVisible(true);
				Lpass++;
			}
		});
		contentPane.add(InterrogationBTN_1);
		InterrogationBTN_1.setVisible(false);
		
		//INTERROGATION BTN 2 -----------------------------------------------------------------------------------
		InterrogationBTN_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		InterrogationBTN_2.setBounds(575, 388, 124, 45);
		InterrogationBTN_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterrogationRoom3 I3 = new InterrogationRoom3();
				I3.setVisible(true);
			}
		});
		contentPane.add(InterrogationBTN_2);
		InterrogationBTN_2.setVisible(false);
		
		//INTERROGATION BTN 3 -----------------------------------------------------------------------------------
		InterrogationBTN_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		InterrogationBTN_3.setBounds(731, 388, 124, 45);
		InterrogationBTN_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterrogationRoom4 I4 = new InterrogationRoom4();
				I4.setVisible(true);
			}
		});
		contentPane.add(InterrogationBTN_3);
		InterrogationBTN_3.setVisible(false);
		
		//INTERROGATION BTN 4 -----------------------------------------------------------------------------------
		InterrogationBTN_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		InterrogationBTN_4.setBounds(894, 388, 124, 45);
		InterrogationBTN_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterrogationRoom5 I5 = new InterrogationRoom5();
				I5.setVisible(true);
				Lpass++;
			}
		});
		contentPane.add(InterrogationBTN_4);
		InterrogationBTN_4.setVisible(false);
		
		//INTERROGATION BTN 5 -----------------------------------------------------------------------------------
		InterrogationBTN_5.setFont(new Font("Californian FB", Font.ITALIC, 14));
		InterrogationBTN_5.setBounds(1059, 388, 124, 45);
		contentPane.add(InterrogationBTN_5);
		InterrogationBTN_5.setVisible(false);
		
		//KEY BTN ----------------------------------------------------------------------------------------------
		KeyBTN.setBounds(1221, 11, 53, 37);
		
		KeyBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String PassText = Password.getText().toLowerCase();
				switch(PassText) {
					case "romke":
						PersonalReportBTN.setVisible(true);
						//PersonalReportBTN_5.setVisible(true);
						CrimeSceneBTN.setVisible(true);
						PersonalReportBTN_1.setVisible(true);
						CrimeSceneBTN_1.setVisible(true);
						J1.setVisible(true);
						break;
					case "sterre":
						InterrogationBTN.setVisible(true);
						PersonalReportBTN_2.setVisible(true);
						J1.setVisible(true);
						break;
					case "dwayne":
						InterrogationBTN_1.setVisible(true);
						PersonalReportBTN_3.setVisible(true);
						CrimeSceneBTN_2.setVisible(true);
						J1.setVisible(true);
						break;
					case "leila":
						PersonalReportBTN_4.setVisible(true);
						if(Lpass < 4) {
							JL.setVisible(true);
						}else{
							InterrogationBTN_3.setVisible(true);
							J1.setVisible(true);
						}
						break;
					case "sophie":
						ForensicsBTN.setVisible(true);
						ForensicsBTN_1.setVisible(true);
						ForensicsBTN_2.setVisible(true);
						J1.setVisible(true);
						break;
					case "sgm gomez":
						InterrogationBTN_2.setVisible(true);
						PersonalReportBTN_1.setVisible(true);
						J1.setVisible(true);
						break;
					case "gomez":
						InterrogationBTN_2.setVisible(true);
						PersonalReportBTN_1.setVisible(true);
						J1.setVisible(true);
						break;
					case "hannah":
						InterrogationBTN_4.setVisible(true);
						J1.setVisible(true);
						break;
					case "screens":
						ForensicsBTN.setVisible(true);
						J1.setVisible(true);
						break;
					case "objects":
						ForensicsBTN_1.setVisible(true);
						J1.setVisible(true);
						break;
					case "fingerprints":
						ForensicsBTN_2.setVisible(true);
						J1.setVisible(true);
						Lpass++;
						break;
					case "trump":
						PersonalReportBTN.setVisible(true);
						PersonalReportBTN_1.setVisible(true);
						PersonalReportBTN_2.setVisible(true);
						PersonalReportBTN_3.setVisible(true);
						PersonalReportBTN_4.setVisible(true);
						PersonalReportBTN_5.setVisible(true);
						ForensicsBTN.setVisible(true);
						ForensicsBTN_1.setVisible(true);
						ForensicsBTN_2.setVisible(true);
						ForensicsBTN_3.setVisible(true);
						ForensicsBTN_4.setVisible(true);
						ForensicsBTN_5.setVisible(true);
						CrimeSceneBTN.setVisible(true);
						CrimeSceneBTN_1.setVisible(true);
						CrimeSceneBTN_2.setVisible(true);
						CrimeSceneBTN_3.setVisible(true);
						CrimeSceneBTN_4.setVisible(true);
						CrimeSceneBTN_5.setVisible(true);
						InterrogationBTN.setVisible(true);
						InterrogationBTN_1.setVisible(true);
						InterrogationBTN_2.setVisible(true);
						InterrogationBTN_3.setVisible(true);
						InterrogationBTN_4.setVisible(true);
						InterrogationBTN_5.setVisible(true);
						break;
					default:
						J2.setVisible(true);
						break;
				
				
				}
				
				
			}
		});
		contentPane.add(KeyBTN);
		KeyBTN.setVisible(false);
		
		//SOLVE BTN -------------------------------------------------------------------------------------------
		SolveBTN.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 20));
		SolveBTN.setBounds(544, 559, 191, 45);
		SolveBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolveWindow SOLVER = new SolveWindow();
				SOLVER.setVisible(true);
			}
		});
		contentPane.add(SolveBTN);
		SolveBTN.setVisible(false);
		
		//YOUR TEAM ---------------------------------------------------------------------------------------------
		YTSOPHIE.setFont(new Font("Californian FB", Font.ITALIC, 14));
		YTSOPHIE.setBounds(1126, 531, 124, 45);
		YTSOPHIE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/SophiePF.pdf");
			}
		});
		contentPane.add(YTSOPHIE);
		YTSOPHIE.setVisible(false);
		
		
		JORIS.setFont(new Font("Californian FB", Font.ITALIC, 14));
		JORIS.setBounds(1126, 587, 124, 45);
		JORIS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/RomkePF.pdf");
			}
		});
		contentPane.add(JORIS);
		JORIS.setVisible(false);
		
						
/////////////////////////////////////////////////////////////////	TEXT PNL		/////////////////////////////////////////////////////////////////
		
		//PERSONAL REPORTS --------------------------------------------------------------------------------------
		PRtext.setEditable(false);
		PRtext.setFont(new Font("Californian FB", Font.ITALIC, 20));
		PRtext.setText("PERSONAL FILES");
		PRtext.setBackground(new Color(255, 255, 0));
		PRtext.setBounds(10, 109, 1264, 54);
		contentPane.add(PRtext);
		PRtext.setVisible(false);
								
		// CRIME SCENE ---------------------------------------------------------------------------------------------
		CStext.setText("CRIME SCENES");
		CStext.setFont(new Font("Californian FB", Font.ITALIC, 20));
		CStext.setBackground(new Color(255, 255, 0));
		CStext.setBounds(10, 204, 1264, 54);
		contentPane.add(CStext);
		CStext.setVisible(false);
		
		//FORENSICS -------------------------------------------------------------------------------------------------
		Ftext.setText("FORENSICS");
		Ftext.setFont(new Font("Californian FB", Font.ITALIC, 20));
		Ftext.setBackground(new Color(255, 255, 0));
		Ftext.setBounds(10, 293, 1264, 54);
		contentPane.add(Ftext);
		Ftext.setVisible(false);
		
		//INTERROGATION -----------------------------------------------------------------------------------------
		Itext.setText("INTERROGATION");
		Itext.setFont(new Font("Californian FB", Font.ITALIC, 20));
		Itext.setBackground(new Color(255, 255, 0));
		Itext.setBounds(10, 384, 1264, 54);
		contentPane.add(Itext);
		Itext.setVisible(false);
		
		// PASWORD TEXT BOX --------------------------------------------------------------------------------------
		Password.setBounds(1044, 11, 165, 37);
		contentPane.add(Password);
		Password.setColumns(10);
		Password.setVisible(false);
		
		// YOUR TEAM -------------------------------------------------------------------------------------------------
		YourTeam.setText("YOUR TEAM :");
		YourTeam.setFont(new Font("Californian FB", Font.ITALIC, 20));
		YourTeam.setBackground(new Color(255, 255, 0));
		YourTeam.setEditable(false);
		YourTeam.setBounds(894, 500, 380, 150);
		contentPane.add(YourTeam);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	//ABRIR ARCHIVOS
		public void abrirarchivo(String archivo){

		     try {

		            File objetofile = new File (archivo);
		            Desktop.getDesktop().open(objetofile);

		     }catch (IOException ex) {

		            System.out.println(ex);

		     }

		}    
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
