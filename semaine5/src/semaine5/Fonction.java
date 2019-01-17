package semaine5;

import java.util.Arrays;

public class Fonction {
	static int count1 = 0;
	static int count2 = 0;
	static int countEssai = 12;
	public static String[] CouleurRandom(String[] tab) {
		for (int i = 0 ; i<tab.length;i++) {
			int random = (int) (Math.random()*4);
			switch (random) {
			case 0:
				tab[i] ="rouge";
				break;
			case 1:
				tab[i] ="bleu";
				break;
			case 2:
				tab[i] ="vert";
				break;
			case 3:
				tab[i] ="jaune";
				break;

			default:System.err.println("il y'a une erreur");
			break;
			}
		}
		return tab;
	}
	public static void affichage(String facile ,String[] tableauUtilisateur,String[]tableauCouleurRandomCopie,String[]tableauFacilitateur) {
		countEssai--;
		if(facile.equals("facile")) {
			System.out.println("Vous avez saisie "+Arrays.toString(tableauUtilisateur)+"\n                 "
					+ Arrays.toString(tableauFacilitateur));
		}
		else {
			System.out.println("Vous avez saisie "+Arrays.toString(tableauUtilisateur));
		}
		if(countEssai > 0 && count1 != 4) {
		System.out.println("Vous avez "+ count1 +" couleurs bien place");
		System.out.println("Vous avez "+ count2 +" couleurs presente mais mal place");
		System.out.println("Il vous reste "+countEssai+" essais");
		}
		if(count1==4) {
			System.out.println("Bravo vous etes le master Mind");
		}
		if (countEssai == 0) {
			System.out.println("Vous avez perdu la bonne reponse etais "+Arrays.toString(tableauCouleurRandomCopie));
		}
		count1 = 0;
		count2 = 0;
	}
	public static String[]	utilisateur (String[] tableauUtilisateur,String[]tableauCouleurRandom,String[]tableauFacilitateur) {
		String[] tableauCouleurRandomCopie = new String[4];
		String[] tableauUtilisateurCopie = new String[4];
		System.arraycopy(tableauUtilisateur, 0, tableauUtilisateurCopie, 0, 4);
		System.arraycopy(tableauCouleurRandom, 0, tableauCouleurRandomCopie, 0, 4);	
		for (int i = 0 ; i < tableauUtilisateur.length; i++) {
			if(tableauUtilisateur[i].equals(tableauCouleurRandom[i])) {					
				count1++;
				tableauUtilisateurCopie[i] ="-";
				tableauCouleurRandomCopie[i] = "*";
				tableauFacilitateur[i]="2";
			}
		}
		for (int i = 0 ; i<tableauUtilisateurCopie.length; i++) {
			for (int k = 0; k < tableauCouleurRandomCopie.length; k++) {
				if(tableauUtilisateurCopie[i].equals(tableauCouleurRandomCopie[k])) {
					count2++;
					tableauCouleurRandomCopie[k] = "*";
					tableauFacilitateur[i]="1";
					break;
				}
				else if(!tableauUtilisateurCopie[i].equals(tableauCouleurRandomCopie[k]) || tableauUtilisateurCopie[i].equals("-")) {
					tableauFacilitateur[i]="*";
				}
			}					  
		}
		return tableauUtilisateur;
	}

	public static void main (String[]args) {
		String[] tabUser = {"rouge","vert","vert","jaune"};
		String[] tabRandomStrings = new String[4];
		String[] tableauFacilitateur = {"0","0","0","0"};
		String facile = "facile";
 		CouleurRandom(tabRandomStrings);
		utilisateur(tabUser,tabRandomStrings,tableauFacilitateur);
		affichage(facile,tabUser,tabRandomStrings,tableauFacilitateur);
		
	}
}

