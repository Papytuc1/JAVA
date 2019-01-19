package semaine5;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
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
import javax.swing.JDialog;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Cursor;

public class Grafic extends JFrame {
	public static JDialog lose() {
		JDialog dialog = new JDialog();
		dialog.setUndecorated(true);
		String image = new File("5m5h.gif").getAbsolutePath();
		JLabel lose = new JLabel( new ImageIcon(image) );
		dialog.getContentPane().add( lose );
		dialog.pack();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
		System.out.println(dialog);
		return dialog;
	}
	public static JDialog winner() {
		JDialog dialog = new JDialog();
		dialog.setUndecorated(true);
		String image = new File("dab.gif").getAbsolutePath();
		JLabel dab = new JLabel( new ImageIcon(image) );
		dialog.getContentPane().add( dab );
		dialog.pack();
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
		return dialog;
	}
	public static JLabel Paradise() {
		JLabel lblNewLabel = new JLabel("New label");
		String image = new File("ezgif-5-f21e6dbeef1a.gif").getAbsolutePath();
		lblNewLabel.setIcon(new ImageIcon(image));
		contentPane.add(lblNewLabel);
		return lblNewLabel;
	}
	public static JLabel Hell() {
		JLabel lblHell = new JLabel("Hell");
		String image = new File("Hell.gif").getAbsolutePath();
		lblHell.setIcon(new ImageIcon(image));
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
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		JButton btnRouge = new JButton();
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRouge, 159, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRouge, -115, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRouge, -615, SpringLayout.EAST, contentPane);
		btnRouge.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		
		
		JButton btnBleu = new JButton();
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBleu, 71, SpringLayout.EAST, btnRouge);
		btnBleu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBleu.setBackground(Color.BLUE);
		btnBleu.setVisible(false);
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
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBleu, -71, SpringLayout.WEST, btnJaune);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnJaune, 444, SpringLayout.WEST, contentPane);
		btnJaune.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVert, 65, SpringLayout.EAST, btnJaune);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnVert, -115, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVert, -191, SpringLayout.EAST, contentPane);
		btnVert.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVert.setBackground(new Color(0, 128, 0));
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnVert, 16, SpringLayout.SOUTH, txtrFacile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnJaune, 16, SpringLayout.SOUTH, txtrFacile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBleu, 16, SpringLayout.SOUTH, txtrFacile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRouge, 21, SpringLayout.SOUTH, txtrFacile);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtrFacile, 158, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtrFacile, -221, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtrFacile, 0, SpringLayout.EAST, btnVert);
		txtrFacile.setForeground(new Color(0, 0, 0));
		txtrFacile.setBackground(new Color(250, 250, 210));
		txtrFacile.setFont(new Font("MV Boli", Font.PLAIN, 20));
		txtrFacile.setVisible(false);
		txtrFacile.setVisible(false);
		txtrFacile.setText("C'est parti vous avez 12 essais,\n saisissez 4 couleurs (Rouge, Bleu, Vert, Jaune)");
		contentPane.add(txtrFacile);
		
		
		
		
		JButton btnFacile = new JButton("Facile");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFacile, 30, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnFacile, -500, SpringLayout.EAST, contentPane);
		btnFacile.setFont(new Font("MV Boli", Font.PLAIN, 20));
		btnFacile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFacile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				facile ="facile";
			}
		});
		contentPane.add(btnFacile);
		
		JButton btnDifficile = new JButton("Difficile");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnDifficile, -330, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnJaune, 0, SpringLayout.EAST, btnDifficile);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnDifficile, 30, SpringLayout.NORTH, contentPane);
		btnDifficile.setFont(new Font("MV Boli", Font.PLAIN, 20));
		btnDifficile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDifficile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				facile ="difficile";
			}
		});
		contentPane.add(btnDifficile);
		
		JButton btnValiderLaSasie = new JButton("Valider la Sasie");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnJaune, -5, SpringLayout.NORTH, btnValiderLaSasie);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnBleu, -5, SpringLayout.NORTH, btnValiderLaSasie);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnValiderLaSasie, 404, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnValiderLaSasie, 239, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnValiderLaSasie, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnValiderLaSasie, 556, SpringLayout.WEST, contentPane);
		btnValiderLaSasie.setFont(new Font("MV Boli", Font.PLAIN, 34));
		btnValiderLaSasie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnValiderLaSasie.setVisible(false);
		btnValiderLaSasie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficFonction.count1=0;
				GraficFonction.count2 =0;
				count--;
				GraficFonction.utilisateur(tabUser, tabRandomStrings, tableauFacilitateur);
				//Fonction.affichage(facile,tabUser,tabRandomStrings,tableauFacilitateur);
				txtrFacile.setText(GraficFonction.affichage(facile,tabUser,tabRandomStrings,tableauFacilitateur));
				i = 0 ;
				if(count == 0) {
					lose();
					btnRouge.setVisible(false);
					btnBleu.setVisible(false);
					btnJaune.setVisible(false);
					btnVert.setVisible(false);
					txtrFacile.setVisible(false);
					btnValiderLaSasie.setEnabled(false);
				}
				else if(tableauFacilitateur[0].equals("2") && tableauFacilitateur[1].equals("2") && tableauFacilitateur[2].equals("2") && tableauFacilitateur[3].equals("2")) {
					winner();
					btnRouge.setVisible(false);
					btnBleu.setVisible(false);
					btnJaune.setVisible(false);
					btnVert.setVisible(false);
					txtrFacile.setVisible(false);
					btnValiderLaSasie.setVisible(false);
					
				}
			}
		});
		contentPane.add(btnValiderLaSasie);
		
		JButton btnNewButton = new JButton("OK");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtrFacile, 16, SpringLayout.SOUTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -406, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -6, SpringLayout.WEST, btnDifficile);
		btnNewButton.setFont(new Font("MV Boli", Font.PLAIN, 18));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
				btnValiderLaSasie.setVisible(true);
				btnFacile.setVisible(false);
				btnDifficile.setVisible(false);
				btnNewButton.setVisible(false);
				
				
			}
		});
		contentPane.add(btnNewButton);
		
		
	
	}
}