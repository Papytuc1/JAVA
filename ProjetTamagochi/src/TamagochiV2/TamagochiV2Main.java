package TamagochiV2;

import java.util.Scanner;

public class TamagochiV2Main {

	static String reponse = "";

	public static String saisie() {
		Scanner scanner = new Scanner(System.in);
		reponse = scanner.nextLine().toLowerCase();
		boolean verif = true;
		while(verif) {
			if(reponse.equals("oui")|| reponse.equals("non")) {
				verif = false;
			}
			else {
				System.out.println("vous avez du vous trompez veuillez recomencer la saisie");
				reponse = scanner.nextLine();
			}
		}
		return reponse;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TamagochiV2 tamagochiV2 = new TamagochiV2();
		System.out.println("Hello... ... ... oh votre tamagochi va eclore");
		tamagochiV2.eclosion();
		System.out.println("Votre tamagochi est "+tamagochiV2.getSexe());
		System.out.println("Choisisez un nom pour votre Tamagochi");
		tamagochiV2.rename();
		System.out.println("Votre tamagochi s'appel "+tamagochiV2.getNom()+" etes vous sur de votre choix(oui/non) ?");
		saisie();

		while(reponse.equals("non")) {
			System.out.println("Okay changeons le nom de votre Tamagochi");
			tamagochiV2.rename();
			System.out.println("Votre Tamagochi s'appel désormais "+tamagochiV2.getNom()+"\net maintenant etes vous sur de votre choix ?");
			reponse = scanner.nextLine();
		}
		System.out.println("Super!!! "+tamagochiV2.getNom()+" est pret pour l'aventure votre tamagochi peux faire 3 activitees par jour.\nAttention a ce qu'il n'en meurt pas. Maintenant regardons son status");
		while(tamagochiV2.checkMort() == false) {
			if(tamagochiV2.checkMort() == true) {
				break;
			}
			tamagochiV2.checkStatus();
			System.out.println(tamagochiV2.getNom()+" viens de ce lever que voulez lui faire faire pour ce debut de matinees");
			tamagochiV2.activitees();
			if(tamagochiV2.checkMort() == true) {
				break;
			}
			System.out.println("il est maintenant midi que doit faire "+tamagochiV2.getNom());
			tamagochiV2.activitees();
			if(tamagochiV2.checkMort() == true) {
				break;
			}
			System.out.println("Il ce fait tard que doit faire "+tamagochiV2.getNom());
			tamagochiV2.activitees();
			if(tamagochiV2.checkMort() == true) {
				break;
			}
			tamagochiV2.age();
			System.out.println(tamagochiV2.getNom()+" a maintenant "+tamagochiV2.getAge()+" ans");
		}
	}
}

