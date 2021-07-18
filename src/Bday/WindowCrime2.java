package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class WindowCrime2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel incorrect;
	private JLabel correct;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowCrime2 frame = new WindowCrime2();
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
	public WindowCrime2() {
		setBackground(new Color(102, 51, 51));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 213);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ITEM DECLARATION -------------------------------------------------------------------------
		incorrect = new JLabel("");
		correct = new JLabel("");
		JTextPane Title = new JTextPane();
		textField = new JTextField();
		JTextPane QuestionPNL = new JTextPane();		
		
		//BTN DECLARATION --------------------------------------------------------------------------
		JButton CheckBTN = new JButton("\u2713");
		
		//TITLE -------------------------------------------------------------------------------------
		Title.setEditable(false);
		Title.setText("                CRIME SCENE");
		Title.setFont(new Font("Californian FB", Font.ITALIC, 21));
		Title.setBackground(new Color(255, 204, 102));
		Title.setBounds(114, 11, 206, 39);
		contentPane.add(Title);
		
		// ANSWER TEXT FIELD --------------------------------------------------------------------------
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(150, 128, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//SIGNS DEFINED-----------------------------------------------------------------------------------
		//INCORRECT
		ImageIcon icono = new ImageIcon("Extra/incorrect.png");
		Image imagen = icono.getImage();
		ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(60,60,Image.SCALE_SMOOTH)); // ancho, alto
		incorrect.setIcon(iconoEscalado);
		incorrect.setBounds(350, 15 , 60, 60);// eje x, eje y, ancho, alto
		contentPane.add(incorrect);
		incorrect.setVisible(false);
		//CORRECT
		ImageIcon icono2 = new ImageIcon("Extra/correct.png");
		Image imagen2 = icono2.getImage();
		ImageIcon iconoEscalado2 = new ImageIcon (imagen2.getScaledInstance(60,60,Image.SCALE_SMOOTH)); // ancho, alto
		correct.setIcon(iconoEscalado2);
		correct.setBounds(350, 15 , 60, 60);// eje x, eje y, ancho, alto
		contentPane.add(correct);
		correct.setVisible(false);

		//CHECK BTN   -------------------------------------------------------------------------------------
		CheckBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Clean everything
				incorrect.setVisible(false);
				correct.setVisible(false);
				CodeWindow CWP = new CodeWindow(" Looks like you found a plane ticket, you should try asking some people about it.");
				
				//Get text
				String txt = textField.getText().toLowerCase();
				switch(txt) {
					case "laptop":
						correct.setVisible(true);
						abrirarchivo("Extra/Laptop_home.png");
						break;
					case "computer":
						correct.setVisible(true);
						abrirarchivo("Extra/Laptop_home.png");
						break;
					case "screen":
						correct.setVisible(true);
						abrirarchivo("Extra/Laptop_home.png");
						break;
					case "pc":
						correct.setVisible(true);
						abrirarchivo("Extra/Laptop_home.png");
						break;
					case "computer screen":
						correct.setVisible(true);
						abrirarchivo("Extra/Laptop_home.png");
						break;
					case "laptop screen":
						correct.setVisible(true);
						abrirarchivo("Extra/Laptop_home.png");
						break;
					case "post it":
						correct.setVisible(true);
						abrirarchivo("Extra/post_it.jpg");
						break;
					case "post-it":
						correct.setVisible(true);
						abrirarchivo("Extra/post_it.jpg");
						break;
					case "postit":
						correct.setVisible(true);
						abrirarchivo("Extra/post_it.jpg");
						break;
					case "plate":
						correct.setVisible(true);
						abrirarchivo("Extra/cheesecake.jpg");
						break;
					case "dish":
						correct.setVisible(true);
						abrirarchivo("Extra/cheesecake.jpg");
						break;
					case "dishes":
						correct.setVisible(true);
						abrirarchivo("Extra/cheesecake.jpg");
						break;
					case "agenda":
						correct.setVisible(true);
						abrirarchivo("Extra/agenda.jpg");
						break;
					case "diary":
						correct.setVisible(true);
						abrirarchivo("Extra/agenda.jpg");
						break;
					case "planner":
						correct.setVisible(true);
						abrirarchivo("Extra/agenda.jpg");
						break;
					case "iberia":
						correct.setVisible(true);
						abrirarchivo("Extra/PlaneTicket.png");
						CWP.setVisible(true);
						break;
					case "ticket":
						correct.setVisible(true);
						abrirarchivo("Extra/PlaneTicket.png");
						CWP.setVisible(true);
						break;
					case "plane ticket":
						correct.setVisible(true);
						abrirarchivo("Extra/PlaneTicket.png");
						CWP.setVisible(true);
						break;
					case "fly ticket":
						correct.setVisible(true);
						abrirarchivo("Extra/PlaneTicket.png");
						CWP.setVisible(true);
						break;
					case "boarding pass":
						correct.setVisible(true);
						abrirarchivo("Extra/PlaneTicket.png");
						CWP.setVisible(true);
						break;
					default:
						incorrect.setVisible(true);
						break;
						
				}
			}
		});
		CheckBTN.setBounds(300, 127, 56, 20);
		contentPane.add(CheckBTN);
		
		//QUESTION PNL -------------------------------------------------------------------------------------
		QuestionPNL.setEditable(false);
		QuestionPNL.setFont(new Font("Californian FB", Font.ITALIC, 19));
		QuestionPNL.setText("                Which item would you like to examine?");
		QuestionPNL.setBackground(new Color(255, 204, 102));
		QuestionPNL.setBounds(44, 93, 349, 66);
		contentPane.add(QuestionPNL);
		
		
		
		
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
