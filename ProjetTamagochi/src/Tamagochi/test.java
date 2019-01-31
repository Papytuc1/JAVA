package Tamagochi;

import java.util.Scanner;

public class test {
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
		TamagochiV1 tamagochiV1 = new TamagochiV1();
		System.out.println("Hello... ... ... oh votre tamagochi va eclore");
		tamagochiV1.eclosion();
		System.out.println("Votre tamagochi est "+tamagochiV1.getSexe());
		System.out.println("Choisisez un nom pour votre Tamagochi");
		tamagochiV1.rename();
		System.out.println("Votre tamagochi s'appel "+tamagochiV1.getNom()+" etes vous sur de votre choix(oui/non) ?");
		saisie();

		while(reponse.equals("non")) {
			System.out.println("Okay changeons le nom de votre Tamagochi");
			tamagochiV1.rename();
			System.out.println("Votre Tamagochi s'appel désormais "+tamagochiV1.getNom()+"\net maintenant etes vous sur de votre choix ?");
			reponse = scanner.nextLine();
		}
		System.out.println("Super!!! "+tamagochiV1.getNom()+" est pret pour l'aventure regardons son status");
		while(tamagochiV1.getAge() != 10) {
			System.out.println("ICI LA FAIM "+tamagochiV1.getFaim());
			tamagochiV1.statusForme();
			if(tamagochiV1.statusFaim()==1) {
				System.out.println(tamagochiV1.getNom()+" a faim voulez vous le nourir (oui/non)?");
				saisie();
				if(reponse.equals("oui")) {
					tamagochiV1.nourir();
				}
				else if(reponse.equals("non")) {
					System.out.println("bon bah je vais pas manger alors =(");
					tamagochiV1.faim();
					tamagochiV1.statusFaim();
					if(tamagochiV1.statusFaim()==2) {
					tamagochiV1.mortFaim();
					}
				}
			}
			tamagochiV1.statusForme();
			if(tamagochiV1.toilettage()==2) {
				System.out.println("Oh !! "+tamagochiV1.getNom()+" est sale laver le(oui/non)");
				saisie();
				if(reponse.equals("oui")) {
					System.out.println("Super je file dans ma douche");
					tamagochiV1.toilettage();
				}
				else {
					System.out.println(":( okay je vais rester tout sale");
					tamagochiV1.sale();
				}
			}
			tamagochiV1.statusForme();
			if(tamagochiV1.statusPoid()==1) {
				System.out.println(tamagochiV1.getNom()+" est beaucoup trop maigre");
				System.out.println("Voulez vous le nourir (oui/non)?");
				saisie();
				if(reponse.equals("oui")) {
					tamagochiV1.nourir();
				}
			}
			else if(tamagochiV1.statusPoid()==2) {
				System.out.println(tamagochiV1.getNom()+" est obése faites lui faire du sport ou il risque de grave probleme de sante\n"+
						"Voulez vous l'envoyez au sport ? Aller a la peche(sport/peche ?");
				reponse = scanner.nextLine().toLowerCase();
				if(reponse.equals("sport")) {
					System.out.println("Super du sport !!! je vais perdre beaucoup de poid.\nAh je suis bien content ,fatigue et je me sent sale");
					tamagochiV1.faireSport();
				}
				else if(reponse.equals("peche")) {
					System.out.println("J'adore la peche c'est reposant et je perds un peux de poids");
					tamagochiV1.peche();
				}
			}
			tamagochiV1.statusForme();
			if(tamagochiV1.formeBonheur()==1) {
				System.out.println(tamagochiV1.getNom()+" s'embete faites lui faire une activite par exemple la tele ou un jeu ?");
				reponse = scanner.nextLine().toLowerCase();
				if(reponse.equals("tele")) {
					System.out.println("Cool j'adore la tele merci ;)");
					tamagochiV1.tele();
				}
				else if(reponse.equals("jeu")) {
					System.out.println("YEAHHHH, je vais jouer a la league des legendes okay");
					tamagochiV1.jeu();
				}
			}
			else if(tamagochiV1.formeBonheur()==2) {
				System.out.println(tamagochiV1.getNom()+" se sent vraiment mal faites lui une caresse (caresse)");
				reponse = scanner.nextLine().toLowerCase();
				if(reponse.equals("caresse")) {
					System.out.println(tamagochiV1.getNom()+" ronrone et se sent vraiment bien");
					tamagochiV1.caresse();
				}
			}
			tamagochiV1.statusForme();
			System.out.println("Il ce fait tard "+tamagochiV1.getNom()+" est épuisé et doit dormir \n"
					+ "pour être en forme demain");
			tamagochiV1.dormir();
			tamagochiV1.age();
			System.out.println(tamagochiV1.getNom()+" à maintenant "+tamagochiV1.getAge()+" an");
		}
	}
}