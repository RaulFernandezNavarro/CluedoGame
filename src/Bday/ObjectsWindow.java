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

public class ObjectsWindow extends JFrame {

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
					ObjectsWindow frame = new ObjectsWindow();
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
	public ObjectsWindow() {
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
		JButton ScreenBtn = new JButton("ROMKID-19 VIAL");
		ScreenBtn_1 = new JButton("POST-IT");
		ScreenBtn_2 = new JButton("AGENDA");
		ScreenBtn_3 = new JButton("DWAYNE'S POST-IT");
		ScreenBtn_4 = new JButton("New button");
		ScreenBtn_5 = new JButton("OK");
		
		
		//SCREEN BTN 0 ----------------------------------------------------------------------------
		ScreenBtn.setBounds(23, 60, 165, 38);
		ScreenBtn.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/vial.jpg");
			}
		});
		ScreenBtn.setBackground(new Color(192, 192, 192));
		contentPane.add(ScreenBtn);
		
		//SCREEN BTN 1 ----------------------------------------------------------------------------
		ScreenBtn_1.setBounds(207, 60, 165, 38);
		ScreenBtn_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn_1.setBackground(new Color(192, 192, 192));
		ScreenBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirarchivo("Extra/post_it.jpg");
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
				abrirarchivo("Extra/agenda.jpg");
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
				abrirarchivo("Extra/DwaynesPostit.jpg");
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
		ScreenBtn_5.setBounds(318, 158, 54, 38);
		ScreenBtn_5.setFont(new Font("Californian FB", Font.ITALIC, 14));
		ScreenBtn_5.setBackground(new Color(192, 192, 192));
		ScreenBtn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Password = textField.getText().toLowerCase();
				switch(Password) {
				case "vial" :
					ScreenBtn.setVisible(true);
					break;
				case "post it" :
					ScreenBtn_1.setVisible(true);
					break;
				case "postit" :
					ScreenBtn_1.setVisible(true);
					break;
				case "post-it" :
					ScreenBtn_1.setVisible(true);
					break;
				case "agenda" :
					ScreenBtn_2.setVisible(true);
					break;
				case "planner":
					ScreenBtn_2.setVisible(true);
					break;
				case "calendar":
					ScreenBtn_2.setVisible(true);
					break;
				case "dwaynes postit":
					ScreenBtn_3.setVisible(true);
					break;
				case "dwaynes":
					ScreenBtn_3.setVisible(true);
					break;
				case "dwayne":
					ScreenBtn_3.setVisible(true);
					break;
				case "dwaynes post it":
					ScreenBtn_3.setVisible(true);
					break;
				case "dwaynes post-it":
					ScreenBtn_3.setVisible(true);
					break;
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
		Title.setText("\t         OBJECTS");
		Title.setFont(new Font("Californian FB", Font.ITALIC, 25));
		Title.setEditable(false);
		Title.setBounds(35, 11, 321, 38);
		contentPane.add(Title);
		
		//WALLPAPER-------------------------------------------------------------------------------
		ImageIcon icono = new ImageIcon("Extra/objects.png");
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
