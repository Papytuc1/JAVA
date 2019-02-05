package Exo1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


import Exo1.Voiture.Constructeur;

public class Exo1Main {
	public static Constructeur saisie() {
		Scanner scanner = new Scanner(System.in);
		Constructeur reponse = null;
		String saisie = scanner.nextLine().toUpperCase();
		for(Constructeur marque : Constructeur.values()) {
			if(saisie.equals(marque.toString())) {
				reponse = marque;
				break;
			}
			else {
				reponse = Constructeur.PROTOTYPE;
			}
		}
//		switch(saisie) {
//		case "honda" :
//			reponse = type.HONDA;
//			break;
//		case "renault" :
//			reponse = type.RENAULT;
//			break;
//		case "toyota":
//			reponse = type.TOYOTA;
//			break;
//		default : System.err.println("err recomencer");
//		break;
//		}
		return reponse;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Voiture voiture1 = new Voiture();
		Parking parking = new Parking();
		User user = new User();
		String sCouleur;
		String sMarque="";
		int sPorte;
		System.out.println("Bonjour quel est votre nom?");
		user.setNom(scanner.nextLine());
		System.out.println("Votre age");
		user.setAge(scanner.nextLine());
		System.out.println("De quelle marque est votre voiture ?");
		voiture1.setMarque(saisie());
		System.out.println("De quelle couleur est votre voiture ?");
		sCouleur = scanner.nextLine();
		voiture1.setCouleur(sCouleur);
		System.out.println("Combien de portiere à votre voiture (3 ou 5)?");
		sPorte = scanner.nextInt();
		voiture1.setPortiere(sPorte);
		//System.out.println(user.getNom()+", "+user.getAge()+" possede une voiture de\n "+voiture1.infoVoiture());
		user.infoParcAuto(voiture1.infoVoiture());
		parking.addParking(voiture1.infoVoiture());
		scanner.nextLine();

		Voiture voiture2 = new Voiture();
		System.out.println("De quelle marque est votre voiture ?");
		voiture2.setMarque(saisie());
		System.out.println("De quelle couleur est votre voitre ?");
		sCouleur = scanner.nextLine();
		voiture2.setCouleur(sCouleur);
		System.out.println("Combien de portiere à votre voiture (3 ou 5)?");
		sPorte = scanner.nextInt();
		voiture2.setPortiere(sPorte);
		user.infoParcAuto(voiture2.infoVoiture());
		parking.addParking(voiture2.infoVoiture());
		System.out.println(user.getNom()+", "+user.getAge()+" possede\n "+user.getParcAuto());
		//System.out.println(parking.getStock());
	}

}
