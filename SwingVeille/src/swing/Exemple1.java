package swing;
import javax.swing.*;
import java.awt.*;
public class Exemple1 {
	

	public static void main(String[] args) {
	       // on crée une fenêtre dont le titre est "Hello World!"
	       JFrame frame = new JFrame("Hello World!");
	       frame.setSize(300,300);
	       // la fenêtre doit se fermer quand on clique sur la croix rouge
	       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	       
	       // on ajoute le texte "Hello, World!" dans la fenêtre
	       frame.getContentPane().add(new JLabel("Hello, World!"));
	       JButton b =new JButton("Mon bouton");
	       frame.getContentPane().add(b);
	       
	       // on demande d'attribuer une taille minimale à la fenêtre
	       //  (juste assez pour voir tous les composants)
	       //frame.pack();
	       // on centre la fenêtre
	       frame.setLocationRelativeTo(null);
	       // on rend la fenêtre visible
	       frame.setVisible(true);
	    }
	}


