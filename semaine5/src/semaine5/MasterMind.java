package semaine5;

import java.util.Arrays;
import java.util.Scanner;

public class MasterMind {
	public static String[] pushTableau(String[] tab , String saisie ) {
		for (int i = 0 ; i<tab.length;i++) {
			tab[i] = saisie;
		}
		return tab;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tableauCouleurRandom = new String[4];
		String[] tableauUtilisateur = new String[4];
		String saisie="";
		int countEssai = 0;
		boolean verif = false;
		int count1 =0;
		int count2 = 0;
		for (int i = 0 ; i<tableauCouleurRandom.length;i++) {
			int random = (int) (Math.random()*4);
			switch (random) {
			case 0:
				tableauCouleurRandom[i] ="rouge";
				break;
			case 1:
				tableauCouleurRandom[i] ="bleu";
				break;
			case 2:
				tableauCouleurRandom[i] ="vert";
				break;
			case 3:
				tableauCouleurRandom[i] ="jaune";
				break;

			default:System.err.println("il y'a une erreur");
			break;
			}
		}
		System.out.println(Arrays.toString(tableauCouleurRandom));
		while(!verif && countEssai < 12) {
			countEssai++;
			for (int i = 0 ; i<tableauUtilisateur.length;i++) { 

				saisie =scanner.nextLine().toLowerCase(); 
				tableauUtilisateur[i] = saisie; 		  
			}
			
			String[] tableauCouleurRandomCopie = new String[4];
			String[] tableauUtilisateurCopie = new String[4];
			System.arraycopy(tableauUtilisateur, 0, tableauUtilisateurCopie, 0, 4);
			System.arraycopy(tableauCouleurRandom, 0, tableauCouleurRandomCopie, 0, 4);
			System.out.println("Saisissez 4 couleurs (Rouge, Bleu, Vert, Jaune)");			
	

			for (int i = 0 ; i < tableauUtilisateur.length; i++) {
				if(tableauUtilisateur[i].equals(tableauCouleurRandom[i])) {					
					count1++;
					tableauUtilisateurCopie[i] ="-";
					tableauCouleurRandomCopie[i] = "-";
				}
			}
			for (int i = 0 ; i<tableauUtilisateurCopie.length; i++) {
					for (int k = 0; k < tableauCouleurRandomCopie.length; k++) {
						if(tableauUtilisateurCopie[i].equals(tableauCouleurRandomCopie[k]) && !tableauUtilisateurCopie[k].equals("-")) {
							count2++;
							break;
						}
					}					  
			}
			System.out.println("Vous avez "+ count1 +" couleurs bien placé");
			System.out.println("Vous avez "+ count2 +" couleurs présente mais mal placé");
			if(count1 == 4) {
				verif = true;
			}
			else {
				count1 = 0;
				count2 = 0;
			}
		}
		if(verif) {
			System.out.println("vous etes le master mind");
		}
		else {
			System.out.println("vous avez perdu ;)");
		}
	}

}
