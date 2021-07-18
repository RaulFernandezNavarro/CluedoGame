package Bday;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.naming.PartialResultException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;;

public class Window2 extends JFrame {

	private JPanel contentPane;
	private JPanel FirstScreen;
	private JButton MehBtn;
	private JLabel dedoLBL;
	private JLabel R_hat;
	private JLabel cara_picara;
	private JButton GameOverBtn;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window2 frame = new Window2();
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
	public Window2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 462);
		
		//PRIMERA PANTALLA ---------------------------------------------------------------
		
		FirstScreen = new JPanel();
		FirstScreen.setBackground(new Color(176, 224, 230));
		FirstScreen.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FirstScreen);
		FirstScreen.setLayout(null);
		
		JTextPane TextPnl = new JTextPane();
		TextPnl.setEditable(false);
		TextPnl.setBackground(new Color(176, 224, 230, 0)); // el 0 hace el fondo transparente
		TextPnl.setText("This looks better, don't you think?");
		TextPnl.setFont(new Font("Californian FB", Font.ITALIC, 26));
		TextPnl.setBounds(10, 24, 570, 333);
		FirstScreen.add(TextPnl);
		
		//ITEM DECLARATION -------------------------------------------------------------------------------------------
		R_hat = new JLabel("");
		cara_picara = new JLabel("");
		dedoLBL = new JLabel("");
		//BTN DECLARATION --------------------------------------------------------------------------------------------
		JButton NextBtn = new JButton("Next!\r\n");
		JButton PartyBTN = new JButton("PARTY TIME!");
		JButton DefinitelyBtn = new JButton("Definitely!");
		MehBtn = new JButton("Meh\r\n");
		GameOverBtn = new JButton("GAME OVER");
		//Next BTN ----------------------------------------------------------------------------------------------------
		
		NextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextPnl.setText("Now, since very unfortunate events have happened, \nthis year you will not be able to celebrate a normal birthday. \n BUT we will not let that ruin this day!! \n \n So, are you up for a challenge?");
				FirstScreen.add(TextPnl);
				R_hat.setVisible(false);
				NextBtn.setVisible(false);
				PartyBTN.setVisible(true);
				ImageIcon icono = new ImageIcon("Extra/cara_picara.png");
				Image imagen = icono.getImage();
				ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(250,185,Image.SCALE_SMOOTH)); // ancho, alto
				cara_picara.setIcon(iconoEscalado);
				cara_picara.setBounds(125, 215, 250, 185);// eje x, eje y, ancho, alto
				FirstScreen.add(cara_picara);
			}
		});
		NextBtn.setBounds(491, 389, 89, 23);
		FirstScreen.add(NextBtn);
		NextBtn.setVisible(false);
				
		//Party BTN ----------------------------------------------------------------------------------------------------
		
		PartyBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				//abrirarchivo("DETECTIVE_101.pptx"); Video introduccion + ventana 3
				Window3 W3 = new Window3();
				W3.setVisible(true);
				Window2.this.dispose();
						 
			}
		});
		PartyBTN.setBounds(458, 340, 122, 72);
		FirstScreen.add(PartyBTN);
		PartyBTN.setVisible(false);
		
		//DEFINITELY BUTTON ----------------------------------------------------------------------------------------------------
		
		DefinitelyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TextPnl.setText("Agreed! I have a magnificent taste \n \nBut let us begin this Birthday WHOOOOOOO");
				FirstScreen.add(TextPnl);
				DefinitelyBtn.setVisible(false);
				MehBtn.setVisible(false);
				ImageIcon icono = new ImageIcon("Extra/Romke_con_gorrito.png");
				Image imagen = icono.getImage();
				ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(300,400,Image.SCALE_SMOOTH)); // ancho, alto
				R_hat.setIcon(iconoEscalado);
				R_hat.setBounds(215, 150, 200, 300);// eje x, eje y, ancho, alto
				FirstScreen.add(R_hat);
				NextBtn.setVisible(true);
				
				
			}
		});
		DefinitelyBtn.setBounds(491, 389, 89, 23);
		FirstScreen.add(DefinitelyBtn);
		
		//MEH BUTTON ----------------------------------------------------------------------------------------------------
		
		MehBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//MIDDLEFINGER
				ImageIcon icono = new ImageIcon("Extra/dedo.png");
				Image imagen = icono.getImage();
				ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(500,400,Image.SCALE_SMOOTH));
				dedoLBL.setIcon(iconoEscalado);
				dedoLBL.setBounds(30, 20, 500, 400);
				FirstScreen.add(dedoLBL);
				TextPnl.setVisible(false);
				MehBtn.setVisible(false);
				DefinitelyBtn.setVisible(false);
				GameOverBtn.setVisible(true);
			}
		});
		MehBtn.setBounds(10, 389, 89, 23);
		FirstScreen.add(MehBtn);
		
		//GAME OVER BUTTON ----------------------------------------------------------------------------------------------------
		
		GameOverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Window2.this.dispose();
				
			}
		});
		GameOverBtn.setBounds(246, 389, 103, 23);
		FirstScreen.add(GameOverBtn);
		GameOverBtn.setVisible(false);
		
		
		
		
		
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
}
