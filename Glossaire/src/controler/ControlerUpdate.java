package controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gestion.Lexique;
import gestion.ModeleLexique;

public class ControlerUpdate {
	
	public static void controlerUpdate(Lexique lexique,JFrame frame,String motModifier) {	
		if(lexique.getMot().isEmpty()==false && lexique.getDefinition().isEmpty()==false) {
			ModeleLexique.updateEntree(lexique, motModifier);
			JOptionPane.showMessageDialog(frame, "Mot mis a jour", "Mot mis a jour", JOptionPane.INFORMATION_MESSAGE);
		}		
		else {
			JOptionPane.showMessageDialog(frame, "Le champ est vide", "Le champ est vide", JOptionPane.ERROR_MESSAGE);
		}		
	}

}
