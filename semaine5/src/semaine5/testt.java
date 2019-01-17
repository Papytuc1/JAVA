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
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import java.awt.Dimension;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;

public class testt extends JFrame {

	private JPanel contentPane;
	private String[] tableau = {"-","-","-","-"}; 
	private String facile = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testt frame = new testt();
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
	public testt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 869, 563);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(100, 100));
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Facile");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficMasterMind.traitement("facile", tableau);
				setEnabled(false);
			}
		});
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 92, SpringLayout.WEST, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Difficile");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 485, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -66, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -68, SpringLayout.WEST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 117, SpringLayout.NORTH, contentPane);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficMasterMind.traitement("Difficile", tableau);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnRouge = new JButton("Orange");
		btnRouge.setBackground(Color.WHITE);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRouge, 139, SpringLayout.SOUTH, btnNewButton);
		btnRouge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tableau[0]="rouge";				
			}
		});
		contentPane.add(btnRouge);
		
		JButton btnAffichertest = new JButton("AfficherTest");
		btnAffichertest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Arrays.toString(tableau));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAffichertest, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAffichertest, 10, SpringLayout.WEST, contentPane);
		contentPane.add(btnAffichertest);
		
		JButton btnValiderLaSasie = new JButton("Valider la Sasie");
		btnValiderLaSasie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficMasterMind.traitement("",tableau);
				setEnabled(false) ;
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnValiderLaSasie, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnValiderLaSasie, -10, SpringLayout.EAST, contentPane);
		contentPane.add(btnValiderLaSasie);
		
		JButton btnBleu = new JButton("Bleu");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRouge, -87, SpringLayout.WEST, btnBleu);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnBleu, -571, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnBleu, -494, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnBleu, 139, SpringLayout.SOUTH, btnNewButton);
		btnBleu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tableau[1]="bleu";
			}
		});
		contentPane.add(btnBleu);
		
		JButton btnJaune = new JButton("Jaune");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnJaune, 0, SpringLayout.NORTH, btnRouge);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnJaune, 108, SpringLayout.EAST, btnBleu);
		btnJaune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tableau[2]="jaune";
			}
		});
		contentPane.add(btnJaune);
		
		JButton btnVert = new JButton("Violet");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnVert, 0, SpringLayout.NORTH, btnRouge);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVert, 75, SpringLayout.EAST, btnJaune);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVert, -143, SpringLayout.EAST, contentPane);
		btnVert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tableau[3] = "vert";
			}
		});
		contentPane.add(btnVert);
		
		JButton btnNewButton_2 = new JButton("      ");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_2, 185, SpringLayout.WEST, contentPane);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_2.setBackground(Color.green);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 20, SpringLayout.SOUTH, btnRouge);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, 101, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("          ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button.setBackground(Color.green);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, button, 25, SpringLayout.SOUTH, btnBleu);
		sl_contentPane.putConstraint(SpringLayout.WEST, button, 93, SpringLayout.EAST, btnNewButton_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, button, 189, SpringLayout.EAST, btnNewButton_2);
		contentPane.add(button);
		
		JButton button_1 = new JButton("          ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_1.setBackground(Color.green);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_1, 0, SpringLayout.NORTH, button);
		sl_contentPane.putConstraint(SpringLayout.WEST, button_1, 0, SpringLayout.WEST, btnJaune);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("            ");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_2.setBackground(Color.green);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_2, 0, SpringLayout.NORTH, btnNewButton_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, button_2, 0, SpringLayout.WEST, btnVert);
		sl_contentPane.putConstraint(SpringLayout.EAST, button_2, -5, SpringLayout.EAST, btnVert);
		contentPane.add(button_2);
	}
}
