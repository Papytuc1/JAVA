package controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gestion.Lexique;
import gestion.ModeleLexique;

public class ControlerAjoutEntree {

	public static void controlerAjout(Lexique lexique,JFrame frame) {	
		if(lexique.getMot().isEmpty()==false &&lexique.getDefinition().isEmpty()==false) {
		boolean success = ModeleLexique.ajoutEntree(lexique);
		if (success==true) {
			JOptionPane.showMessageDialog(frame, "L'entree est  valide", "L'entree est valide", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(frame, "L'entree est deja presente", "L'entree est deja presente", JOptionPane.ERROR_MESSAGE);
		}
		}
		else {
			JOptionPane.showMessageDialog(frame, "L'entree est vide", "L'entree est vide", JOptionPane.ERROR_MESSAGE);
		}		
	}
}
