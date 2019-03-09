package controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gestion.Lexique;
import gestion.ModeleLexique;

public class ControlerDelete {
	public static void controlerDelete(Lexique lexique,JFrame frame) {
		if(lexique.getMot().isEmpty()==false) {
			boolean success = ModeleLexique.deleteEntree(lexique);
			if(success==true) {
				JOptionPane.showMessageDialog(null, "L'entree est supprimer", "L'entree est supprimer", JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "L'entree n'est pas valide", "L'entree n'est pas valide", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
