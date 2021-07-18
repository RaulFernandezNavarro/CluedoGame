package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;

public class OfficerJorrisWindow extends JFrame {

	protected static final String Comment = null;
	protected static final int S = 5;
	private JPanel contentPane;
	private JLabel FaceJorris;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfficerJorrisWindow frame = new OfficerJorrisWindow(S ,Comment);
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
	public OfficerJorrisWindow(int s, String comment) {
		setDefaultCloseOperation(OfficerJorrisWindow.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 306);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//PIC CHOOSE ---------------------------------------------------------------------------------------
		FaceJorris = new JLabel("");
		FaceJorris.setBounds(10, 10, 200, 250);
		ImageIcon icono = null;
		if(s==0) {
			icono = new ImageIcon("Extra/OfficerRight.jpg");
			Image imagen = icono.getImage();
			ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(200,250,Image.SCALE_SMOOTH)); // ancho, alto
			contentPane.setLayout(null);
			contentPane.setLayout(null);
			FaceJorris.setIcon(iconoEscalado);
			contentPane.add(FaceJorris);
		}else if(s == 1) {
			icono = new ImageIcon("Extra/OfficerWrong2.jpg");
			Image imagen = icono.getImage();
			ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(220,215,Image.SCALE_SMOOTH)); // ancho, alto
			contentPane.setLayout(null);
			contentPane.setLayout(null);
			FaceJorris.setIcon(iconoEscalado);
			contentPane.add(FaceJorris);
		}
	
		JTextArea txtrOfficerDeMuck = new JTextArea();
		txtrOfficerDeMuck.setText(" OFFICER DE MUNCK:\n");
		txtrOfficerDeMuck.setBackground(new Color(255, 255, 0));
		txtrOfficerDeMuck.setEditable(false);
		txtrOfficerDeMuck.setBounds(220, 10, 205, 246);
		txtrOfficerDeMuck.append(comment);
		contentPane.add(txtrOfficerDeMuck);
	}
}
