package Exo1V2;

import java.util.Scanner;

public class Exo1VSMain {
	static Scanner scanner = new Scanner(System.in);

	public static Voiture creVoiture() {
		Voiture voiture = new Voiture();
		System.out.println("votre voiture est de quelle marque ?");
		voiture.setMarque(scanner.nextLine());
		System.out.println("quelle est la couleur ?");
		voiture.setCouleur(scanner.nextLine());
		System.out.println("combien de porte à votre voiture ?");
		voiture.setPorte(scanner.nextInt());
		scanner.nextLine();
		//voiture.infoVoiture();
		return voiture;
	}
	public static void main(String[] args) {
		System.out.println("Combien voulez-vous de voiture ?");
		int saisie = scanner.nextInt();
		scanner.nextLine();
		Voiture[] parking = new Voiture[saisie];
		for(int i = 0; i<saisie;i++) {
			parking[i]= creVoiture();			
		}
		for (Voiture info : parking) {
			System.out.println("info voiture: \n"+info.infoVoiture());
		}
		
	}

}
