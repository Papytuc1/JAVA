package warrior;

import java.util.Scanner;

public class Game {
	static Pnj pnj;
	static Scanner scanner = new Scanner(System.in);
	/*
	 * methode qui permet de check si la reponse est bien oui ou non
	 */
	public static String ouiNon(String phrase){
		String reponse="";
		boolean verif = true;
		System.out.println(phrase);
		while(verif) {
			System.out.println("Saisissez oui ou non !");
			reponse = scanner.nextLine().toLowerCase();
			if(reponse.equals("oui")|| reponse.equals("non")) {
				verif = false;
			}
			else {
				System.out.println("je n'ai pas compris votre reponse");
			}
		}
		return reponse;
	}
	/*
	 * methode de choix du nom du l'avatar
	 */
	public static String choixNom() {
		boolean verif = true;
		String nom="";
		while(verif) {
			System.out.println("Veuillez choisir un nom pour votre Avatar");
			nom = scanner.nextLine();
			String reponse = ouiNon("Etes vous sur que "+nom+" vous convient ?");
			if(reponse.equals("oui")) {
				verif = false;
			}
		}
		return nom;
	}
	/*
	 * methode de choix de classe qui return un avatar guerrier mage ou voleur
	 */
	public static Avatar choixClasse() {
		String nom = choixNom();
		System.out.println("Quel classe voulez vous ? Vous avez le choix entre Guerrier, Mage ou voleur");
		String reponse;	
		boolean verif=true;
		Avatar avatar=null;
		while(verif) {
			reponse = scanner.nextLine().toLowerCase();
			switch (reponse) {
			case "guerrier": avatar = new Guerrier(nom); verif = false;
			break;
			case "mage" : avatar = new Magicien(nom); verif = false;
			break;
			case "voleur": avatar = new Voleur(nom);verif = false;
			break;
			default : System.out.println("je n'ai pas compris la reponse");
			break;
			}
		}
		return avatar;
	}
	/*
	 * methode de combat des avatars qui met fin au cbt si l'un des deux est mort
	 */
	public static void combat(Avatar joueur,Avatar adversaire) {
		boolean endGame =false;
		while(!endGame) {
			tourJoueur(joueur,adversaire);	
			//endGame = checkMort(adversaire, joueur);
			if(checkMort(adversaire, joueur)==true) {
				endGame = true;
				break;			
			}
			tourAdversaire(adversaire, joueur);
			endGame =checkMort(joueur, adversaire);

		}
	}
	/*
	 * methode qui permet de choisir son adversaire et de lancer le combat entre vous et l'adversaire
	 */
	public static void choixAdversaire(Avatar joueur) {
		boolean verif = true;
		System.out.println("Contre qui voulez vous combattre\nGuerrier, Mage,voleur");
		String reponse;
		Avatar adversaire=null;
		while(verif) {
			reponse = scanner.nextLine().toLowerCase();
			switch (reponse) {
			case "guerrier": adversaire = new Guerrier("Benjy"); verif = false;
			break;
			case "mage" : adversaire = new Magicien("Ruben"); verif = false;
			break;
			case "voleur": adversaire = new Voleur("Justine");verif = false;
			break;
			default : System.out.println("je n'ai pas compris la reponse");
			break;
			}
		}
		combat(joueur, adversaire);
	}
	/*
	 * methode de tour du joueur qui lui permet de ce battre ou de boire une potion
	 */
	public static void tourJoueur(Avatar joueur,Avatar adversaire) {
		boolean verif = true;
		System.out.println("C'est a "+joueur.getNom()+" de jouer. Que doit t'il faire ?");
		while(verif) {
			System.out.println("attaquer ,potion ?");
			String saisie = scanner.nextLine();
			switch (saisie) {
			case "attaquer":joueur.attaquer(adversaire);verif=false;			
			break;
			case "potion" : if(joueur.getPotion()>0) {
				joueur.boireUnePotion();verif=false;
			}else {
				System.out.println("Vous n'avez plus de potion recomencer la saisie");
				verif = true;
			}
			break;
			default:System.out.println("je n'ai pas compris la reponse");
			break;
			}
		}

	}
	/*
	 * methode qui permet a l'ordi de faire des choix entre boire une popo ou ce battre
	 */
	public static void tourAdversaire(Avatar adversaire,Avatar joueur) {
		System.out.println("C'est a "+adversaire.getNom()+" de jouer !! ");
		if(adversaire.getVie()<(adversaire.getVieMax()*0.25f) && adversaire.getPotion()>0) {
			adversaire.boireUnePotion();
		}
		else {
			adversaire.attaquer(joueur);
		}
	}
/*
 * permet de check si un adversaire est mort ou non return un boolean et de lancer le pillage
 */
	public static boolean checkMort(Avatar joueur,Avatar adversaire) {
		boolean mort = false;
		if(joueur.getVie()<1) {
			System.out.println(joueur.getNom()+" est mort");
			adversaire.pillage(joueur);
			mort = true;
		}
		else {
			mort = false;
		}
		return mort;
	}
	/*
	 * methode qui permet au joueur de choisir entre aller chercher une popo ou ce battre
	 */
	public static void sceanario(Avatar joueur) {
		String saisie;
		boolean verif = true;
		while(verif) {
			System.out.println("Que voulez vous faire ?\n combattre ou magasin ?");
			saisie= scanner.nextLine().toLowerCase();
			switch (saisie) {
			case "combattre":choixAdversaire(joueur);verif=false;
			break;
			case "magasin":pnj.saluer(joueur);
				break;
			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		pnj = new Pnj("Papytuc");
		Avatar joueur = choixClasse();
		sceanario(joueur);
	}
}
