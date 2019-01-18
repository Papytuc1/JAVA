package semaine5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.SpringLayout;
import java.awt.Dimension;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;

public class Grafic extends JFrame {
	public static JLabel dab() {
		JLabel lblDab = new JLabel("Dab");
		lblDab.setIcon(new ImageIcon("/home/simoccjavmonp06/Bureau/dab.gif"));
		
		contentPane.add(lblDab);
		return lblDab;
	}
	public static JLabel Paradise() {
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/simoccjavmonp06/eclipse-workspaceEE/Java/semaine5/ezgif-5-f21e6dbeef1a.gif"));
		contentPane.add(lblNewLabel);
		return lblNewLabel;
	}
	public static JLabel Hell() {
		JLabel lblHell = new JLabel("Hell");
		lblHell.setIcon(new ImageIcon("/home/simoccjavmonp06/eclipse-workspaceEE/Java/semaine5/Hell.gif"));
		contentPane.add(lblHell);
		return lblHell;
		
	}

	private static JPanel contentPane;
	private String facile ="";
	static String[] tabUser = {"-","-","-","-"};
	static int i = 0;
	static int count = 12;
	
	static String[] tableauFacilitateur = {"-","-","-","-"};
	static String[] tabRandomStrings = new String[4];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GraficFonction.CouleurRandom(tabRandomStrings);
		System.out.println(Arrays.toString(tabRandomStrings));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafic frame = new Grafic();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grafic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 563);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(100, 100));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		JButton btnRouge = new JButton();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRouge, 281, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRouge, 365, SpringLayout.NORTH, contentPane);
		btnRouge.setBackground(Color.RED);
		btnRouge.setVisible(false);
		btnRouge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i !=4 ) {
				tabUser[i]="rouge";
				i++;
				}
			}
		});
		contentPane.add(btnRouge);
		
		JButton btnAffichertest = new JButton("AfficherTest");
		btnAffichertest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Arrays.toString(tabUser));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAffichertest, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAffichertest, 10, SpringLayout.WEST, contentPane);
		contentPane.add(btnAffichertest);
		
		
		
		JButton btnBleu = new JButton();
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRouge, -54, SpringLayout.WEST, btnBleu);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnBleu, -158, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBleu, -471, SpringLayout.EAST, contentPane);
		btnBleu.setBackground(Color.BLUE);
		btnBleu.setVisible(false);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBleu, -571, SpringLayout.EAST, contentPane);
		btnBleu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i !=4 ) {
					tabUser[i]="bleu";
					i++;
					}
			}
		});
		contentPane.add(btnBleu);
		
		JButton btnJaune = new JButton();
		sl_contentPane.putConstraint(SpringLayout.WEST, btnJaune, 62, SpringLayout.EAST, btnBleu);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnJaune, -158, SpringLayout.SOUTH, contentPane);
		btnJaune.setBackground(Color.YELLOW);
		btnJaune.setVisible(false);
		btnJaune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i !=4 ) {
					tabUser[i]="jaune";
					i++;
					}
			}
		});
		contentPane.add(btnJaune);
		
		JButton btnVert = new JButton();
		sl_contentPane.putConstraint(SpringLayout.EAST, btnJaune, -70, SpringLayout.WEST, btnVert);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVert, -158, SpringLayout.SOUTH, contentPane);
		btnVert.setBackground(new Color(0, 128, 0));
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVert, 610, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVert, 695, SpringLayout.WEST, contentPane);
		btnVert.setVisible(false);
		btnVert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i !=4 ) {
					tabUser[i]="vert";
					i++;
					}
			}
		});
		contentPane.add(btnVert);
		
		JTextArea txtrFacile = new JTextArea();
		txtrFacile.setForeground(new Color(0, 0, 0));
		txtrFacile.setBackground(new Color(128, 128, 0));
		txtrFacile.setFont(new Font("Century Schoolbook L", Font.PLAIN, 22));
		txtrFacile.setVisible(false);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtrFacile, 141, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtrFacile, -18, SpringLayout.NORTH, btnRouge);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRouge, 0, SpringLayout.WEST, txtrFacile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnVert, 18, SpringLayout.SOUTH, txtrFacile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnJaune, 18, SpringLayout.SOUTH, txtrFacile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBleu, 18, SpringLayout.SOUTH, txtrFacile);
		txtrFacile.setVisible(false);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtrFacile, 139, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtrFacile, 709, SpringLayout.WEST, contentPane);
		txtrFacile.setText("C'est parti vous avez 12 essais,\n saisissez 4 couleurs (Rouge, Bleu, Vert, Jaune)");
		contentPane.add(txtrFacile);
		
		
		JButton btnValiderLaSasie = new JButton("Valider la Sasie");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnValiderLaSasie, 29, SpringLayout.SOUTH, btnBleu);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnValiderLaSasie, 240, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnValiderLaSasie, 119, SpringLayout.SOUTH, btnBleu);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnValiderLaSasie, 557, SpringLayout.WEST, contentPane);
		btnValiderLaSasie.setVisible(false);
		btnValiderLaSasie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficFonction.count1=0;
				GraficFonction.count2 =0;
				count--;
				GraficFonction.utilisateur(tabUser, tabRandomStrings, tableauFacilitateur);
				//Fonction.affichage(facile,tabUser,tabRandomStrings,tableauFacilitateur);
				txtrFacile.setText(GraficFonction.affichage(facile,tabUser,tabRandomStrings,tableauFacilitateur));
				i =0;
				if(count == 0) {
					btnValiderLaSasie.setEnabled(false);
				}
				else if(tableauFacilitateur[0].equals("2") && tableauFacilitateur[1].equals("2") && tableauFacilitateur[2].equals("2") && tableauFacilitateur[3].equals("2")) {
					JLabel dab = new JLabel();
					contentPane.setBackground(Color.red);
				}
			}
		});
		contentPane.add(btnValiderLaSasie);
		
		JButton btnFacile = new JButton("Facile");
		btnFacile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				facile ="facile";
			}
		});
		contentPane.add(btnFacile);
		
		JButton btnDifficile = new JButton("Difficile");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnDifficile, 405, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFacile, 0, SpringLayout.NORTH, btnDifficile);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnFacile, -16, SpringLayout.WEST, btnDifficile);
		btnDifficile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				facile ="difficile";
			}
		});
		contentPane.add(btnDifficile);
		
		JButton btnNewButton = new JButton("OK");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnDifficile, -6, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 365, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -18, SpringLayout.NORTH, txtrFacile);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(facile.equals("facile")) {
					Paradise();
				}
				else {
					Hell();
				}
				btnRouge.setVisible(true);
				btnBleu.setVisible(true);
				btnJaune.setVisible(true);
				btnVert.setVisible(true);
				txtrFacile.setVisible(true);
				txtrFacile.setVisible(true);
				btnValiderLaSasie.setVisible(true);
				btnFacile.setVisible(false);
				btnDifficile.setVisible(false);
				btnNewButton.setVisible(false);
				
				
			}
		});
		contentPane.add(btnNewButton);
		
	
	}
}