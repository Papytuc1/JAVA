package vueBDD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controler.ControlerAjoutEntree;
import controler.ControlerDelete;
import controler.ControlerRead;
import controler.ControlerUpdate;
import gestion.Lexique;
import gestion.Modele;
import gestion.ModeleLexique;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class VueGlossaire {

	private JFrame frame;
	private JTextField textField;
	private JTextPane textPane_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextPane textPane_4;
	private JTextField textField_5;
	private JTable table;
	Lexique lexique =new Lexique();
	DefaultTableModel modelTable;
	private JTextField textField_1;
	JTextPane textPane;
	String mot="";
	String definition ="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueGlossaire window = new VueGlossaire();
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
	public VueGlossaire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 600, 600);
		panel.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Create", null, panel_1, null);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {200, 200, 0};
		gbl_panel_1.rowHeights = new int[]{21, 21, 19, 21, 87, 25, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		JButton btnAjoutDuMot = new JButton("Ajout du mot");
		btnAjoutDuMot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lexique.setMot(textField.getText());
				lexique.setDefinition(textPane_1.getText());
				ControlerAjoutEntree.controlerAjout(lexique, frame);
				remplirDef();
			}
		});

		JTextPane txtpnSignIn = new JTextPane();
		txtpnSignIn.setEditable(false);
		txtpnSignIn.setText("Lexique");
		GridBagConstraints gbc_txtpnSignIn = new GridBagConstraints();
		gbc_txtpnSignIn.anchor = GridBagConstraints.NORTH;
		gbc_txtpnSignIn.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnSignIn.gridx = 1;
		gbc_txtpnSignIn.gridy = 0;
		panel_1.add(txtpnSignIn, gbc_txtpnSignIn);

		JTextPane txtpnPseudo = new JTextPane();
		txtpnPseudo.setEditable(false);
		txtpnPseudo.setText("Mot");
		GridBagConstraints gbc_txtpnPseudo = new GridBagConstraints();
		gbc_txtpnPseudo.anchor = GridBagConstraints.NORTH;
		gbc_txtpnPseudo.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnPseudo.gridx = 1;
		gbc_txtpnPseudo.gridy = 1;
		panel_1.add(txtpnPseudo, gbc_txtpnPseudo);

		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		panel_1.add(textField, gbc_textField);

		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setText("Definition");
		GridBagConstraints gbc_txtpnPassword = new GridBagConstraints();
		gbc_txtpnPassword.anchor = GridBagConstraints.NORTH;
		gbc_txtpnPassword.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnPassword.gridx = 1;
		gbc_txtpnPassword.gridy = 3;
		panel_1.add(txtpnPassword, gbc_txtpnPassword);

		textPane_1 = new JTextPane();
		JScrollPane scroll2 = new JScrollPane(textPane_1);
		GridBagConstraints gbc_textPane_1 = new GridBagConstraints();
		gbc_textPane_1.fill = GridBagConstraints.BOTH;
		gbc_textPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_textPane_1.gridx = 1;
		gbc_textPane_1.gridy = 4;
		panel_1.add(scroll2, gbc_textPane_1);
		GridBagConstraints gbc_btnAjoutDuMot = new GridBagConstraints();
		gbc_btnAjoutDuMot.anchor = GridBagConstraints.NORTH;
		gbc_btnAjoutDuMot.gridx = 1;
		gbc_btnAjoutDuMot.gridy = 5;
		panel_1.add(btnAjoutDuMot, gbc_btnAjoutDuMot);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Read", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{116, 90, 124, 53, 0};
		gbl_panel_2.rowHeights = new int[]{41, 25, 31, 21, 76, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);

		JTextPane txtpnRecherche = new JTextPane();
		txtpnRecherche.setEditable(false);
		txtpnRecherche.setText("Recherche");
		GridBagConstraints gbc_txtpnRecherche = new GridBagConstraints();
		gbc_txtpnRecherche.anchor = GridBagConstraints.SOUTH;
		gbc_txtpnRecherche.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtpnRecherche.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnRecherche.gridx = 1;
		gbc_txtpnRecherche.gridy = 1;
		panel_2.add(txtpnRecherche, gbc_txtpnRecherche);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.WEST;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 1;
		panel_2.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lexique.setMot(textField_2.getText());
				ControlerRead.controlerRead(lexique, frame);
				textPane.setText(lexique.getDefinition());
			}
		});
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnOk.insets = new Insets(0, 0, 5, 0);
		gbc_btnOk.gridx = 3;
		gbc_btnOk.gridy = 1;
		panel_2.add(btnOk, gbc_btnOk);

		JTextPane txtpnResultatDeLa = new JTextPane();
		txtpnResultatDeLa.setText("Resultat de la recherche");
		GridBagConstraints gbc_txtpnResultatDeLa = new GridBagConstraints();
		gbc_txtpnResultatDeLa.anchor = GridBagConstraints.NORTHEAST;
		gbc_txtpnResultatDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnResultatDeLa.gridwidth = 2;
		gbc_txtpnResultatDeLa.gridx = 1;
		gbc_txtpnResultatDeLa.gridy = 3;
		panel_2.add(txtpnResultatDeLa, gbc_txtpnResultatDeLa);

		textPane = new JTextPane();
		JScrollPane scroll3 = new JScrollPane(textPane);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridwidth = 3;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 4;
		panel_2.add(scroll3, gbc_textPane);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Update", null, panel_3, null);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {200, 200, 0};
		gbl_panel_3.rowHeights = new int[] {100, 21, 19, 25, 21, 19, 153, 25, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);

		JTextPane txtpnMotModifier = new JTextPane();
		txtpnMotModifier.setEditable(false);
		txtpnMotModifier.setText("Mot à modifier");
		GridBagConstraints gbc_txtpnMotModifier = new GridBagConstraints();
		gbc_txtpnMotModifier.anchor = GridBagConstraints.NORTH;
		gbc_txtpnMotModifier.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnMotModifier.gridx = 1;
		gbc_txtpnMotModifier.gridy = 1;
		panel_3.add(txtpnMotModifier, gbc_txtpnMotModifier);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 2;
		panel_3.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);

		JButton btnOk_1 = new JButton("Rechercher");
		btnOk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lexique.setMot(textField_3.getText());
				ControlerRead.controlerRead(lexique, frame);
				textPane_4.setText(lexique.getDefinition());
				textField_1.setText(textField_3.getText());
			}
		});
		GridBagConstraints gbc_btnOk_1 = new GridBagConstraints();
		gbc_btnOk_1.anchor = GridBagConstraints.NORTH;
		gbc_btnOk_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnOk_1.gridx = 1;
		gbc_btnOk_1.gridy = 3;
		panel_3.add(btnOk_1, gbc_btnOk_1);

		JTextPane txtpnModification = new JTextPane();
		txtpnModification.setText("Modification :");
		GridBagConstraints gbc_txtpnModification = new GridBagConstraints();
		gbc_txtpnModification.anchor = GridBagConstraints.NORTH;
		gbc_txtpnModification.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnModification.gridx = 1;
		gbc_txtpnModification.gridy = 4;
		panel_3.add(txtpnModification, gbc_txtpnModification);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 5;
		panel_3.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JTextPane txtpnDefinition = new JTextPane();
		txtpnDefinition.setText("Definition: ");
		GridBagConstraints gbc_txtpnDefinition = new GridBagConstraints();
		gbc_txtpnDefinition.anchor = GridBagConstraints.EAST;
		gbc_txtpnDefinition.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnDefinition.gridx = 0;
		gbc_txtpnDefinition.gridy = 6;
		panel_3.add(txtpnDefinition, gbc_txtpnDefinition);

		textPane_4 = new JTextPane();
		JScrollPane scroll = new JScrollPane(textPane_4);
		GridBagConstraints gbc_scroll = new GridBagConstraints();
		gbc_scroll.fill = GridBagConstraints.BOTH;
		gbc_scroll.insets = new Insets(0, 0, 5, 0);
		gbc_scroll.gridx = 1;
		gbc_scroll.gridy = 6;
		panel_3.add(scroll, gbc_scroll);

		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lexique.setMot(textField_3.getText());
				String motModifier = textField_1.getText();
				lexique.setDefinition(textPane_4.getText());
				ControlerUpdate.controlerUpdate(lexique, frame, motModifier);
				remplirDef();
				textField_3.setText("");
				textField_1.setText("");
				textPane_4.setText("");
			}
		});
		GridBagConstraints gbc_btnValider = new GridBagConstraints();
		gbc_btnValider.anchor = GridBagConstraints.NORTH;
		gbc_btnValider.gridx = 1;
		gbc_btnValider.gridy = 7;
		panel_3.add(btnValider, gbc_btnValider);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Delete", null, panel_4, null);
		panel_4.setLayout(null);

		JTextPane txtpnMotSupprimer = new JTextPane();
		txtpnMotSupprimer.setEditable(false);
		txtpnMotSupprimer.setText("Mot à supprimer");
		txtpnMotSupprimer.setBounds(124, 191, 114, 21);
		panel_4.add(txtpnMotSupprimer);

		textField_5 = new JTextField();
		textField_5.setBounds(240, 193, 124, 19);
		panel_4.add(textField_5);
		textField_5.setColumns(10);

		JButton btnOk_2 = new JButton("OK");
		btnOk_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lexique.setMot(textField_5.getText());
				ControlerDelete.controlerDelete(lexique, frame);
				remplirDef();
			}
		});
		btnOk_2.setBounds(376, 190, 74, 25);
		panel_4.add(btnOk_2);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		String[] entetes = {"id", "Mot", "Definition"};
		Object[][] donnees = {{1, "sd", "dd"}};
		table = new JTable(donnees,entetes);
		table.setAutoCreateColumnsFromModel(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setRowHeight(40);
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(350);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{new Integer(1), "sd", "dd"},
				},
				new String[] {
						"id", "mot", "desc"
				}
				));
		modelTable = (DefaultTableModel) table.getModel();
		this.remplirDef();
		panel_5.add(table.getTableHeader());
		FlowLayout fl_panel_5 = new FlowLayout(FlowLayout.CENTER, 1000, 5);
		panel_5.setLayout(fl_panel_5);
		panel_5.add(table);

	}

	public void remplirDef() {
		ArrayList<Lexique> lexiques = ModeleLexique.affichageLexique();
		modelTable.setRowCount(0);
		for(Lexique lexique : lexiques) {
			modelTable.addRow(lexique.toArray());
		}
	}
}
