package semaine5;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;
//je crée un classe que je fais hérité de Jframe
public class Fenetre extends JFrame {
	
	public JPanel bouton() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton bouton = new JButton("Facile");
		panel.add(bouton);
		panel.setBackground(Color.BLUE);
		JButton bouton2 = new JButton("Difficile");
		panel.add(bouton2);
		return panel;
	}
	public Fenetre() {
		//this fait référence a fenetre qui hérite de Jframe
		this.setTitle("Bienvenue au Master Mind !!!");
		this.setSize(400,400);// ici j'attribut une taille a ma fenetre (400 px de large 100 de haut)
		this.setLocationRelativeTo(null);// je met la fenetre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// quand je ferme la fentre je stop le processus
		this.setVisible(true);// rend la fenetre visible	
		this.setContentPane(bouton());// me permet d'invoquer ma methode

	}

}
