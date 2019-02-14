package warrior;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VueJeu {
	Avatar avatar;
	JTextPane textPane = new JTextPane();
	String nom ="";
	JButton btnVoleur = new JButton("Voleur");
	JButton btnGuerrier = new JButton("Guerrier");
	JButton btnMage = new JButton("Mage");
	JButton btnContinuer = new JButton("Continuer");
	public ImageIcon image(String image) {
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("/ressources/"+image+".gif"));
		return imageIcon;
	}
	private JFrame frame;
	private JTextField txtPseudo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueJeu window = new VueJeu();
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
	public VueJeu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 640, 640);
		frame.getContentPane().setBounds(0, 0, 640, 640);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane panel = new JLayeredPane();
		panel.setOpaque(false);
		panel.setBounds(101, 472, 406, 80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		btnGuerrier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Avatar guerrier = new Guerrier("Gromok");
				textPane.setText("Choisir un pseudo");
				txtPseudo.setVisible(true);
				btnGuerrier.setVisible(false);
				btnMage.setVisible(false);
				btnVoleur.setVisible(false);
				btnContinuer.setVisible(true);
			}
		});
		btnGuerrier.setBorder(new LineBorder(new Color(255, 0, 0), 5, true));
		btnGuerrier.setBounds(12, 28, 114, 25);
		panel.add(btnGuerrier);
		
		
		btnMage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avatar magicien = new Magicien("Ruben");
				textPane.setText("Choisir un pseudo");
				txtPseudo.setVisible(true);
				btnGuerrier.setVisible(false);
				btnMage.setVisible(false);
				btnVoleur.setVisible(false);
				btnContinuer.setVisible(true);
			}
		});
		btnMage.setBorder(new LineBorder(new Color(128, 0, 128), 5));
		btnMage.setBounds(138, 28, 114, 25);
		panel.add(btnMage);
		
		
		btnVoleur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avatar voleur = new Voleur("Justine");
				textPane.setText("Choisir un pseudo");
				txtPseudo.setVisible(true);
				System.out.println(nom);
				btnGuerrier.setVisible(false);
				btnMage.setVisible(false);
				btnVoleur.setVisible(false);
				btnContinuer.setVisible(true);
			}
		});
		btnVoleur.setBorder(new LineBorder(new Color(0, 128, 0), 5));
		btnVoleur.setBounds(264, 28, 114, 25);
		panel.add(btnVoleur);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(101, 199, 406, 111);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		textPane.setFont(new Font("DialogInput", Font.PLAIN, 20));
		textPane.setEditable(false);
		textPane.setText("Bonjour et bienvenue dans Guerriers quelle classe voulez vous ?");
		textPane.setBounds(12, 12, 382, 87);
		panel_1.add(textPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(191, 322, 177, 34);
		frame.getContentPane().add(layeredPane);
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(12, 12, 124, 19);
		txtPseudo.setVisible(false);
		layeredPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBounds(191, 384, 136, 39);
		frame.getContentPane().add(panel_2);
		btnContinuer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nom = txtPseudo.getText();
				avatar.setNom(nom);
				txtPseudo.setVisible(false);
				textPane.setText("Bienvenue "+avatar.getNom());
			}
		});
		
		
		btnContinuer.setVisible(false);
		panel_2.add(btnContinuer);
		
		JLabel lblVillage = new JLabel("Village");
		lblVillage.setIcon(new ImageIcon(VueJeu.class.getResource("/ressources/village.gif")));
		lblVillage.setBounds(0, 0, 640, 610);
		frame.getContentPane().add(lblVillage);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
