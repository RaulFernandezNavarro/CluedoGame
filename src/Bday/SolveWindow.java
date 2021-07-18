package Bday;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SolveWindow extends JFrame {

	private JPanel contentPane;
	int dwayne = 0;
	int leila = 0;
	int sterre = 0;
	int sgm = 0;
	int money = 0;
	int power = 0;
	int passion = 0;
	int inconvenience = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolveWindow frame = new SolveWindow();
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
	public SolveWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 547, 339);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSolver = new JTextPane();
		txtpnSolver.setEditable(false);
		txtpnSolver.setBackground(new Color(255, 204, 0));
		txtpnSolver.setText("\t    SOLVER");
		txtpnSolver.setFont(new Font("Californian FB", Font.ITALIC, 20));
		txtpnSolver.setBounds(149, 11, 231, 36);
		contentPane.add(txtpnSolver);
		
		JTextPane txtpnKiller = new JTextPane();
		
		
		JTextPane txtpnKiller_1 = new JTextPane();
			
		JButton btnNewButton_1 = new JButton("LEILA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leila++;
			}
		});
		btnNewButton_1.setBounds(149, 94, 114, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("STERRE");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sterre++;
			}
		});
		btnNewButton_1_1.setBounds(272, 94, 114, 36);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("SGM GOMEZ");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sgm++;
			}
		});
		btnNewButton_1_2.setBounds(396, 94, 114, 36);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("DWAYNE");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dwayne ++;
			}
		});
		btnNewButton_1_3.setBounds(25, 94, 114, 36);
		contentPane.add(btnNewButton_1_3);
		
		txtpnKiller.setBackground(new Color(255, 204, 0));
		txtpnKiller.setEditable(false);
		txtpnKiller.setText("KILLER :");
		txtpnKiller.setFont(new Font("Californian FB", Font.ITALIC, 14));
		txtpnKiller.setBounds(10, 59, 511, 85);
		contentPane.add(txtpnKiller);
		
		JButton btnNewButton_2 = new JButton("MONEY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money++;
			}
		});
		btnNewButton_2.setBounds(25, 183, 114, 36);
		contentPane.add(btnNewButton_2);
		
				
		JButton btnNewButton_2_1 = new JButton("POWER");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				power++;
			}
		});
		btnNewButton_2_1.setBounds(149, 181, 114, 36);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("WITNESS");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inconvenience++;
			}
		});
		btnNewButton_2_2.setBounds(272, 181, 114, 36);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("PASSION");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passion++;
			}
		});
		btnNewButton_2_3.setBounds(396, 181, 114, 36);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton = new JButton("SOLVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dwayne >0) {
					if(money>0) {
						abrirarchivo("Extra/RightAnswer.mp4");
					}else {
						CodeWindow CWA = new CodeWindow("YOU GOT THE KILLER!!      you didn't get the right motive tho . . . TRY AGAIN!");
						CWA.setVisible(true);
					}
				}else {
					abrirarchivo("Extra/WrongAnswer.mp4");
				}
				SolveWindow.this.dispose();
				
			}
		});
		btnNewButton.setBounds(229, 266, 89, 23);
		contentPane.add(btnNewButton);
		
		txtpnKiller_1.setText("MOTIVE:");
		txtpnKiller_1.setFont(new Font("Californian FB", Font.ITALIC, 14));
		txtpnKiller_1.setEditable(false);
		txtpnKiller_1.setBackground(new Color(255, 204, 0));
		txtpnKiller_1.setBounds(10, 155, 511, 85);
		contentPane.add(txtpnKiller_1);
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
