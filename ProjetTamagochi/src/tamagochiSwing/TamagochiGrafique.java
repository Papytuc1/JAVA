package tamagochiSwing;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import java.awt.Color;

public class TamagochiGrafique {
	TamagochiV3 tamagochiV3 = new TamagochiV3();
	private JFrame frame;
	int i =0;
	public ImageIcon image(String name) {
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/ressource/"+name+".gif"));
		return imageIcon;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TamagochiGrafique window = new TamagochiGrafique();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TamagochiGrafique() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("MV Boli", Font.PLAIN, 11));
		frame.setBounds(100, 100, 607, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(213, 276, 169, 63);
		frame.getContentPane().add(panel_1);
		panel_1.setOpaque(false);
		panel_1.setLayout(null);
		JButton continuer3 = new JButton("Continuer");
		continuer3.setBounds(0, 0, 169, 63);
		panel_1.add(continuer3);
		continuer3.setFont(new Font("MV Boli", Font.PLAIN, 18));
		JButton continuer2 = new JButton("Continuer");
		continuer2.setBounds(0, 0, 169, 63);
		panel_1.add(continuer2);
		continuer2.setFont(new Font("MV Boli", Font.PLAIN, 18));
		JButton continuer1 = new JButton("Continuer");
		continuer1.setBounds(0, 0, 169, 63);
		panel_1.add(continuer1);
		continuer1.setFont(new Font("MV Boli", Font.PLAIN, 18));
		JButton btnNewButton = new JButton("Let's play");
		btnNewButton.setBounds(0, 0, 169, 62);
		panel_1.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("MV Boli", Font.PLAIN, 18));
		JButton btnStatus = new JButton("Status");
		btnStatus.setBounds(43, 40, 89, 23);
		panel_1.add(btnStatus);
		btnStatus.setFont(new Font("MV Boli", Font.BOLD, 14));
		Panel panel_2 = new Panel();
		panel_2.setBounds(139, 345, 312, 98);
		frame.getContentPane().add(panel_2);
		JButton btnJeu = new JButton("Jeu");
		panel_2.add(btnJeu);
		btnJeu.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JButton btnPeche = new JButton("Peche");
		JButton btnManger = new JButton("Manger");
		JButton btnLaver = new JButton("Laver");
		JButton btnCaresse = new JButton("Caresse");
		JButton btnTele = new JButton("Tele");
		JButton btnSport = new JButton("Sport");
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setEditable(false);
		panel_2.add(btnPeche);
		btnPeche.setFont(new Font("MV Boli", Font.PLAIN, 14));
		btnPeche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(i<3) {
					lblNewLabel.setIcon((image("peche")));
					tamagochiV3.peche();
					txtpnTest.setText(tamagochiV3.phrasePeche());
					tamagochiV3.checkMort();
					i++;			
				}
				else {
					lblNewLabel.setIcon((image("attente")));
					txtpnTest.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
					btnStatus.setVisible(true);
					btnLaver.setVisible(false);
					btnManger.setVisible(false);
					btnPeche.setVisible(false);
					btnSport.setVisible(false);
					btnTele.setVisible(false);
					btnJeu.setVisible(false);
					btnCaresse.setVisible(false);
				}

			}
		});
		btnPeche.setVisible(false);
		panel_2.add(btnManger);
		btnManger.setFont(new Font("MV Boli", Font.PLAIN, 14));

		btnManger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(i<3) {
					lblNewLabel.setIcon((image("manger2")));
					tamagochiV3.nourir();
					txtpnTest.setText(tamagochiV3.phraseManger());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					lblNewLabel.setIcon((image("attente")));
					txtpnTest.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
					btnStatus.setVisible(true);
					btnLaver.setVisible(false);
					btnManger.setVisible(false);
					btnPeche.setVisible(false);
					btnSport.setVisible(false);
					btnTele.setVisible(false);
					btnJeu.setVisible(false);
					btnCaresse.setVisible(false);
				}
			}
		});


		btnManger.setVisible(false);

		panel_2.add(btnLaver);
		btnLaver.setFont(new Font("MV Boli", Font.PLAIN, 14));

		btnLaver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(i<3) {
					lblNewLabel.setIcon((image("douche")));
					tamagochiV3.laver();
					txtpnTest.setText(tamagochiV3.phraseLaver());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					lblNewLabel.setIcon((image("attente")));
					txtpnTest.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
					btnStatus.setVisible(true);
					btnLaver.setVisible(false);
					btnManger.setVisible(false);
					btnPeche.setVisible(false);
					btnSport.setVisible(false);
					btnTele.setVisible(false);
					btnJeu.setVisible(false);
					btnCaresse.setVisible(false);
				}

			}
		});


		btnLaver.setVisible(false);

		panel_2.add(btnCaresse);
		btnCaresse.setFont(new Font("MV Boli", Font.PLAIN, 14));


		btnCaresse.setVisible(false);
		btnCaresse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<3) {
					tamagochiV3.caresse();
					tamagochiV3.checkMort();
					txtpnTest.setText(tamagochiV3.phraseCaresse());
					i++;
				}
				else {
					lblNewLabel.setIcon((image("attente")));
					txtpnTest.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
					btnStatus.setVisible(true);
					btnLaver.setVisible(false);
					btnManger.setVisible(false);
					btnPeche.setVisible(false);
					btnSport.setVisible(false);
					btnTele.setVisible(false);
					btnJeu.setVisible(false);
					btnCaresse.setVisible(false);
				}
			}
		});

		panel_2.add(btnTele);
		btnTele.setFont(new Font("MV Boli", Font.PLAIN, 14));

		btnTele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(i<3) {
					tamagochiV3.tele();
					tamagochiV3.checkMort();
					txtpnTest.setText(tamagochiV3.phraseTele());
					i++;
				}
				else {
					lblNewLabel.setIcon((image("attente")));
					txtpnTest.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
					btnStatus.setVisible(true);
					btnLaver.setVisible(false);
					btnManger.setVisible(false);
					btnPeche.setVisible(false);
					btnSport.setVisible(false);
					btnTele.setVisible(false);
					btnJeu.setVisible(false);
					btnCaresse.setVisible(false);
				}
			}
		});
		//lblNewLabel.setIcon(new ImageIcon(getClass().getResource("ressource/G6J2.gif")));
		btnTele.setVisible(false);

		panel_2.add(btnSport);
		btnSport.setFont(new Font("MV Boli", Font.PLAIN, 14));


		txtpnTest.setBounds(0, 0, 518, 96);
		frame.getContentPane().add(txtpnTest);
		txtpnTest.setForeground(new Color(0, 0, 255));
		txtpnTest.setOpaque(false);
		txtpnTest.setFont(new Font("MV Boli", Font.BOLD, 14));
		txtpnTest.setText("Bonjour et bienvenue dans LE tamagotchi");

		lblNewLabel.setBounds(140, 55, 298, 267);
		frame.getContentPane().add(lblNewLabel);

		btnSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(i<3) {
					tamagochiV3.faireSport();
					txtpnTest.setText(tamagochiV3.phraseSport());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					lblNewLabel.setIcon((image("attente")));
					txtpnTest.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
					btnStatus.setVisible(true);
					btnLaver.setVisible(false);
					btnManger.setVisible(false);
					btnPeche.setVisible(false);
					btnSport.setVisible(false);
					btnTele.setVisible(false);
					btnJeu.setVisible(false);
					btnCaresse.setVisible(false);
				}
			}
		});


		btnSport.setVisible(false);
		btnJeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<3) {
					tamagochiV3.jeu();
					txtpnTest.setText(tamagochiV3.phraseJeu());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					lblNewLabel.setIcon((image("attente")));
					txtpnTest.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
					btnStatus.setVisible(true);
					btnLaver.setVisible(false);
					btnManger.setVisible(false);
					btnPeche.setVisible(false);
					btnSport.setVisible(false);
					btnTele.setVisible(false);
					btnJeu.setVisible(false);
					btnCaresse.setVisible(false);
				}
			}
		});


		btnJeu.setVisible(false);
		btnStatus.setVisible(false);
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnTest.setText(tamagochiV3.checkStatus());
				i=0;
				btnStatus.setVisible(false);
				btnLaver.setVisible(true);
				btnManger.setVisible(true);
				btnPeche.setVisible(true);
				btnSport.setVisible(true);
				btnTele.setVisible(true);
				btnJeu.setVisible(true);
				btnCaresse.setVisible(true);
			}
		});

		btnStatus.setVisible(false);	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnTest.setText("Hello... ... ... oh votre tamagochi va eclore");
				lblNewLabel.setIcon((image("eclosion")));
				btnNewButton.setVisible(false);
				continuer1.setVisible(true);
			}
		});
		continuer1.setVisible(false);
		continuer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon((image("main")));
				tamagochiV3.eclosion();
				txtpnTest.setText("Votre tamagochi est "+tamagochiV3.getSexe()+" c'est cool non ?\nMaintenant continuons notre aventure ;)");
				continuer1.setVisible(false);
				continuer2.setVisible(true);
			}
		});
		continuer2.setVisible(false);
		continuer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon((image("saut")));
				txtpnTest.setText("Votre tamagotchi s'appel "+tamagochiV3.getNom()+" C'est super  l'aventure peut commencer\n"+tamagochiV3.getNom()+" Peux faire 3 activitees par jour.\nAttention a ce qu'il n'en meurt pas. Maintenant regardons son status\"");		

				continuer2.setVisible(false);
				continuer3.setVisible(true);
			}
		});
		continuer3.setVisible(false);
		continuer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon((image("attente")));
				continuer3.setVisible(false);
				txtpnTest.setVisible(false);
				txtpnTest.setVisible(true);
				txtpnTest.setText(tamagochiV3.checkStatus());
				btnLaver.setVisible(true);
				btnManger.setVisible(true);
				btnPeche.setVisible(true);
				btnSport.setVisible(true);
				btnTele.setVisible(true);
				btnJeu.setVisible(true);
				btnCaresse.setVisible(true);
			}
		});
	}
}
