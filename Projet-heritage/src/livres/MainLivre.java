package livres;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainLivre {
	static Scanner scanner = new Scanner(System.in);
	public static Livre unLivre() {
		String auteur ;
		String titre ;
		int prix;
		System.out.println("Auteur du livre n°"+Livre.getId()+"?");
		auteur= scanner.nextLine();
		System.out.println("Titre du livre "+Livre.getId()+"?");
		titre = scanner.nextLine();
		System.out.println("Prix du livre "+Livre.getId()+"?");
		prix= scanner.nextInt();		
		scanner.nextLine();
		Livre livre = new Livre(auteur, titre, prix);
		return livre;
	}

	public static void main(String[] args) {	
		ArrayList<Livre> etagere =new ArrayList<>();		
		System.out.println("Voulez vous ajouter un livre ?");
		String reponse =scanner.nextLine();
		while(reponse.equals("oui")) {
			etagere.add(unLivre());	
			System.out.println("Voulez vous ajouter un autre livre ?");
			reponse = scanner.nextLine();
		}
		for (Iterator iterator = etagere.iterator(); iterator.hasNext();) {
			Livre livre = (Livre) iterator.next();
			System.out.println(livre);
		}
	}

}
