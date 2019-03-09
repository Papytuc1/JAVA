package controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gestion.Lexique;
import gestion.ModeleLexique;

public class ControlerRead {
	public static void controlerRead(Lexique lexique,JFrame frame) {	
		if(lexique.getMot().isEmpty()==false) {
			boolean success =ModeleLexique.readEntree(lexique);
			if(success==false) {
				JOptionPane.showMessageDialog(frame, "Le mot n'est pas present", "Le mot n'est pas present", JOptionPane.ERROR_MESSAGE);
			}
		}		
		else {
			JOptionPane.showMessageDialog(frame, "Le champ est vide", "Le champ est vide", JOptionPane.ERROR_MESSAGE);
		}		
	}

}
