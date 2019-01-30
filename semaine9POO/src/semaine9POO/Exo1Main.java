package semaine9POO;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Exo1Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exo1 voiture1 = new Exo1();
		String sCouleur;
		String sMarque;
		int sPorte;
		String stock ="";
		ArrayList<String> voitures = new ArrayList<String>();
		System.out.println("De quelle marque est votre voiture ?");
		sMarque = scanner.nextLine();
		voiture1.setMarque(sMarque);
		System.out.println("De quelle couleur est votre voiture ?");
		sCouleur = scanner.nextLine();
		voiture1.setCouleur(sCouleur);
		System.out.println("Combien de portiere à votre voiture (3 ou 5)?");
		sPorte = scanner.nextInt();
		voiture1.setPortiere(sPorte);
		voitures.add(voiture1.affichage());
		//stock += "Premiere voiture: \n"+voiture1.affichage();
		scanner.nextLine();
		
		Exo1 voiture2 = new Exo1();
		System.out.println("De quelle marque est votre voiture ?");
		sMarque = scanner.nextLine();
		voiture2.setMarque(sMarque);
		System.out.println("De quelle couleur est votre voitre ?");
		sCouleur = scanner.nextLine();
		voiture2.setCouleur(sCouleur);
		System.out.println("Combien de portiere à votre voiture (3 ou 5)?");
		sPorte = scanner.nextInt();
		voiture2.setPortiere(sPorte);
		//stock+= "Seconde voiture: \n"+voiture2.affichage();
		voitures.add(voiture2.affichage());
		System.out.println(voitures);
	}

}
