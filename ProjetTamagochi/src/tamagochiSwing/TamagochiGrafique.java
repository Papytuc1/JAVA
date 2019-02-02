package tamagochiSwing;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TamagochiGrafique {
	TamagochiV3 tamagochiV3 = new TamagochiV3();
	private JFrame frame;
	int i =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TamagochiGrafique window = new TamagochiGrafique();
					window.frame.setVisible(true);
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
		JButton continuer1 = new JButton("Continuer");
		continuer1.setFont(new Font("MV Boli", Font.PLAIN, 18));
		JButton continuer2 = new JButton("Continuer");
		continuer2.setFont(new Font("MV Boli", Font.PLAIN, 18));
		JButton continuer3 = new JButton("Continuer");
		continuer3.setFont(new Font("MV Boli", Font.PLAIN, 18));
		JButton btnCaresse = new JButton("Caresse");
		btnCaresse.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JButton btnTele = new JButton("Tele");
		btnTele.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JButton btnLaver = new JButton("Laver");
		btnLaver.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JButton btnJeu = new JButton("Jeu");
		btnJeu.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JButton btnPeche = new JButton("Peche");
		btnPeche.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JButton btnSport = new JButton("Sport");
		btnSport.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JButton btnManger = new JButton("Manger");
		btnManger.setFont(new Font("MV Boli", Font.PLAIN, 14));
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(127, 80, 332, 362);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setForeground(new Color(0, 0, 255));
		txtpnTest.setOpaque(false);
		txtpnTest.setFont(new Font("MV Boli", Font.BOLD, 14));
		txtpnTest.setText("Bonjour et bienvenue dans LE tamagotchi");
		txtpnTest.setBounds(20, 11, 291, 143);
		panel.add(txtpnTest);

		JButton btnNewButton = new JButton("Let's play");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("MV Boli", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnTest.setText("Hello... ... ... oh votre tamagochi va eclore");
				btnNewButton.setVisible(false);
				continuer1.setVisible(true);
			}
		});
		btnNewButton.setBounds(76, 165, 169, 62);
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(76, 164, 169, 63);
		panel.add(panel_1);
		panel_1.setLayout(null);		
		continuer1.setBounds(0, 0, 169, 63);
		continuer1.setVisible(false);
		panel_1.add(continuer1);	
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBounds(0, 0, 169, 63);
		panel_1.add(panel_2);
		panel_2.setLayout(null);		
		continuer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tamagochiV3.eclosion();
				txtpnTest.setText("Votre tamagochi est "+tamagochiV3.getSexe()+" c'est cool non ?\nMaintenant continuons notre aventure ;)");
				continuer1.setVisible(false);
				continuer2.setVisible(true);
			}
		});
		continuer2.setBounds(0, 0, 169, 63);
		continuer2.setVisible(false);
		panel_2.add(continuer2);

		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(false);
		panel_6.setBounds(0, 0, 169, 63);
		panel_2.add(panel_6);
		panel_6.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		panel_5.setBounds(10, 36, 312, 199);
		panel.add(panel_5);
		panel_5.setLayout(null);
		JTextPane txtpnTextesuite = new JTextPane();
		txtpnTextesuite.setForeground(new Color(0, 0, 205));
		txtpnTextesuite.setFont(new Font("MV Boli", Font.PLAIN, 14));
		txtpnTextesuite.setBounds(10, 11, 292, 127);
		panel_5.add(txtpnTextesuite);
		txtpnTextesuite.setVisible(false);
		continuer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnTest.setText("Votre tamagotchi s'appel "+tamagochiV3.getNom()+" C'est super  l'aventure peut commencer\n"+tamagochiV3.getNom()+" Peux faire 3 activitees par jour.\nAttention a ce qu'il n'en meurt pas. Maintenant regardons son status\"");		

				continuer2.setVisible(false);
				continuer3.setVisible(true);
			}
		});
		continuer3.setBounds(0, 0, 169, 63);
		panel_6.add(continuer3);
		JButton btnStatus = new JButton("Status");
		btnStatus.setFont(new Font("MV Boli", Font.BOLD, 14));
		btnStatus.setVisible(false);
		btnStatus.setBounds(48, 40, 89, 23);
		panel_6.add(btnStatus);
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpnTextesuite.setText(tamagochiV3.checkStatus());
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
		btnPeche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if(i<3) {
					tamagochiV3.peche();
					txtpnTextesuite.setText(tamagochiV3.phrasePeche());
					tamagochiV3.checkMort();
					i++;				
				}
				else {
					txtpnTextesuite.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
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
		btnPeche.setBounds(56, 303, 89, 23);
		panel.add(btnPeche);

		btnManger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(i<3) {
					tamagochiV3.nourir();
					txtpnTextesuite.setText(tamagochiV3.phraseManger());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					txtpnTextesuite.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
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
		btnManger.setBounds(56, 269, 89, 23);
		panel.add(btnManger);

		btnSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(i<3) {
					tamagochiV3.faireSport();
					txtpnTextesuite.setText(tamagochiV3.phraseSport());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					txtpnTextesuite.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
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
		btnSport.setBounds(196, 269, 89, 23);
		panel.add(btnSport);		
		btnJeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<3) {
					tamagochiV3.jeu();
					txtpnTextesuite.setText(tamagochiV3.phraseJeu());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					txtpnTextesuite.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
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
		btnJeu.setBounds(196, 303, 89, 23);
		panel.add(btnJeu);

		btnLaver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(i<3) {
					tamagochiV3.laver();
					txtpnTextesuite.setText(tamagochiV3.phraseLaver());
					tamagochiV3.checkMort();
					i++;
				}
				else {
					txtpnTextesuite.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
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
		btnLaver.setBounds(56, 235, 89, 23);
		panel.add(btnLaver);

		btnTele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(i<3) {
					tamagochiV3.tele();
					tamagochiV3.checkMort();
					txtpnTextesuite.setText(tamagochiV3.phraseTele());
					i++;
				}
				else {
					txtpnTextesuite.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
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
		btnTele.setBounds(196, 238, 89, 23);
		panel.add(btnTele);


		btnCaresse.setVisible(false);
		btnCaresse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i<3) {
					tamagochiV3.caresse();
					tamagochiV3.checkMort();
					txtpnTextesuite.setText(tamagochiV3.phraseCaresse());
					i++;
				}
				else {
					txtpnTextesuite.setText("il ce fait tard pour "+tamagochiV3.getNom()+". Profitons en pour regarder son status");
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
		btnCaresse.setBounds(127, 337, 89, 23);
		panel.add(btnCaresse);
		//C:\\Users\\kevin\\git\\Java\\ProjetTamagochi\\src\\tamagochiSwing\\G6J2.gif
		JLabel lblNewLabel = new JLabel("New label");
		String image = new File("src\\G6J2.gif").getAbsolutePath();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 581, 442);
		frame.getContentPane().add(lblNewLabel);
		btnTele.setVisible(false);


		btnLaver.setVisible(false);


		btnJeu.setVisible(false);


		btnSport.setVisible(false);


		btnManger.setVisible(false);


		btnPeche.setVisible(false);
		continuer3.setVisible(false);
		continuer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				continuer3.setVisible(false);
				txtpnTest.setVisible(false);
				txtpnTextesuite.setVisible(true);
				txtpnTextesuite.setText(tamagochiV3.checkStatus());
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
