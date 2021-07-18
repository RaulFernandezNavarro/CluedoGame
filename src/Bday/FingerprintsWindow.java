package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class FingerprintsWindow extends JFrame {

	private JPanel contentPane;
	private JLabel Fondo;
	private JButton ScreenBtn_1;
	private JButton ScreenBtn_2;
	private JButton ScreenBtn_3;
	private JButton ScreenBtn_4;
	private JButton ScreenBtn_5;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FingerprintsWindow frame = new FingerprintsWindow();
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
	public FingerprintsWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 412, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//ITEM DECLARATION ----------------------------------------------------------------------
		Fondo = new JLabel("");
		JTextPane Title = new JTextPane();
		Title.setForeground(new Color(255, 255, 255));

		
		//BTN DECLARATION -----------------------------------------------------------------------
		JButton ScreenBtn = new JButton("STERRE");
		ScreenBtn_1 = new JButton("SGM GOMEZ");
		ScreenBtn_2 = new JButton("LEILA");
		ScreenBtn_3 = new JButton("DWAYNE");
		ScreenBtn_4 = new JButton("");
		ScreenBtn_5 = new JButton("New button");
		
		
		//SCREEN BTN 0 ----------------------------------------------------------------------------
		ScreenBtn.setBounds(23, 60, 165, 38);
		ScreenBtn.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn.setBackground(new Color(192, 192, 192));
		ScreenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/SterreFP.jpg");
			}
		});
		contentPane.add(ScreenBtn);
		ScreenBtn.setVisible(false);
		
		//SCREEN BTN 1 ----------------------------------------------------------------------------
		ScreenBtn_1.setBounds(207, 60, 165, 38);
		ScreenBtn_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn_1.setBackground(new Color(192, 192, 192));
		ScreenBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/SGMFP.jpg");
			}
		});
		contentPane.add(ScreenBtn_1);
		ScreenBtn_1.setVisible(false);
		
		//SCREEN BTN 2 ----------------------------------------------------------------------------
		ScreenBtn_2.setBounds(23, 109, 165, 38);
		ScreenBtn_2.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn_2.setBackground(new Color(192, 192, 192));
		ScreenBtn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/LeilaFP.jpg");
			}
		});
		contentPane.add(ScreenBtn_2);
		ScreenBtn_2.setVisible(false);
		
		//SCREEN BTN 3 ----------------------------------------------------------------------------
		ScreenBtn_3.setBounds(207, 109, 165, 38);
		ScreenBtn_3.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn_3.setBackground(new Color(192, 192, 192));
		ScreenBtn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/DwayneFP.jpg");
			}
		});
		contentPane.add(ScreenBtn_3);
		ScreenBtn_3.setVisible(false);
		
		//SCREEN BTN 4 ----------------------------------------------------------------------------
		ScreenBtn_4.setBounds(23, 158, 165, 38);
		ScreenBtn_4.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn_4.setBackground(new Color(192, 192, 192));
		contentPane.add(ScreenBtn_4);
		ScreenBtn_4.setVisible(false);
		
		//key BTN  ----------------------------------------------------------------------------
		ScreenBtn_5.setBounds(329, 158, 41, 38);
		ScreenBtn_5.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn_5.setBackground(new Color(192, 192, 192));
		ScreenBtn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Password = textField.getText().toLowerCase();
				switch(Password) {
				case "sterre" :
					ScreenBtn.setVisible(true);
					break;
				case "sgm gomez" :
					ScreenBtn_1.setVisible(true);
					break;
				case "leila" :
					ScreenBtn_2.setVisible(true);
					break;
				case "dwayne" :
					ScreenBtn_3.setVisible(true);
					break;
				/*case "boarding pass" :
					ScreenBtn_1.setVisible(true);
					break;
				case "phone":
					ScreenBtn_2.setVisible(true);
					break;
				case "cs1":
					ScreenBtn_1.setVisible(true);
					ScreenBtn_2.setVisible(true);
					break;*/
				case "trump":
					ScreenBtn.setVisible(true);
					ScreenBtn_1.setVisible(true);
					ScreenBtn_2.setVisible(true);
					ScreenBtn_3.setVisible(true);
					ScreenBtn_4.setVisible(true);
					ScreenBtn_5.setVisible(true);
					break;					
					
				}
				
			}
		});
		contentPane.add(ScreenBtn_5);
		
		//Code field ----------------------------------------------------------------------------
		textField = new JTextField();
		textField.setFont(new Font("Californian FB", Font.ITALIC, 14));
		textField.setBounds(207, 158, 112, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//TITLE ---------------------------------------------------------------------------------
		Title.setBackground(new Color(0, 0, 0));
		Title.setText("\t    FINGERPRINTS");
		Title.setFont(new Font("Californian FB", Font.ITALIC, 25));
		Title.setEditable(false);
		Title.setBounds(35, 11, 321, 38);
		contentPane.add(Title);
		
		//WALLPAPER-------------------------------------------------------------------------------
		ImageIcon icono = new ImageIcon("Extra/fingerprint.jpeg");
		Image imagen = icono.getImage();
		ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(450,300,Image.SCALE_SMOOTH)); // ancho, alto
		contentPane.setLayout(null);
		Fondo.setBounds(0, 0, 450, 305);
		Fondo.setIcon(iconoEscalado);
		contentPane.add(Fondo);
		
		
		
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
