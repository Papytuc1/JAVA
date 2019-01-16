package semaine5;

import java.util.Arrays;
import java.util.Scanner;

public class MasterMindMieux {
	/**
	 * fonction qui permet de push les entrées sasie dans mon tableau
	 * elle permet aussi de géré le cas ou un espace est ajouté
	 * @param tab
	 * @param saisie
	 * @return
	 */
	public static String[] pushTableau(String[] tab , String saisie ) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0 ; i<tab.length;i++) {
			saisie = scanner.nextLine();
			
			if(saisie.indexOf(" ") > -1) {
			tab[i] = saisie.substring(0,saisie.indexOf(" "));
		}
		else {
			tab[i] = saisie;
		}
		
	}
		return tab;
	}
	/**
	 * fonction qui permet de push des couleurs aleatoirement dans un tableau 
	 * @param tab
	 * @return
	 */
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
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tableauCouleurRandom = new String[4];
		String[] tableauUtilisateur = new String[4];
		String saisie="";
		int countEssai = 12;
		boolean verif = false;
		int count1 =0;
		int count2 = 0;
		CouleurRandom(tableauCouleurRandom);
		System.out.println(Arrays.toString(tableauCouleurRandom));
		System.out.println("C'est parti vous avez 12 essais");
		while(!verif && countEssai > 0) {		
			if(countEssai == 12) {
				System.out.println("Saisissez 4 couleurs (Rouge, Bleu, Vert, Jaune)");
			}
			else {
				System.out.println("Vous avez du vous tromper saisissez 4 couleurs à nouveau "
						+ "(Rouge, Bleu, Vert, Jaune).\nIl vous reste "+countEssai+" essais");
			}
			countEssai--;
			pushTableau(tableauUtilisateur, saisie);
			String[] tableauCouleurRandomCopie = new String[4];
			String[] tableauUtilisateurCopie = new String[4];
			/* je cree une copie de mes tableau pour ne pas toucher au vrais tableau  et pouvoir regener� mes tableaux � chaque it�ration*/
			System.arraycopy(tableauUtilisateur, 0, tableauUtilisateurCopie, 0, 4);
			System.arraycopy(tableauCouleurRandom, 0, tableauCouleurRandomCopie, 0, 4);				
			/* je fais une boucle qui parcours mes tableaux originaux et je dis : a chaque foi que tu trouve une parfaite �galit�
			 * ajoute +1 au compteur 1 et remplace cette valeur par un "-" et modifie ma copie je fais ca pour ne
			 * plus avoir de valeur identique l'interet et qu'une valeur trouv� en bonne position ne peux pas etre ensuite retrouv�e */	
			for (int i = 0 ; i < tableauUtilisateur.length; i++) {
				if(tableauUtilisateur[i].equals(tableauCouleurRandom[i])) {					
					count1++;
					tableauUtilisateurCopie[i] ="-";
					tableauCouleurRandomCopie[i] = "-";
				}
			}
			/*  ici je parcours mes copies de tableau (donc apres modification) je n'ai donc plus que des valeur diff�rente 
			 * et je dis la valeur i est trouver en position k et que ce n'est pas un "-" (sinon il le compte comme une valeur) alors fait mon second compteur +1 */
			for (int i = 0 ; i<tableauUtilisateurCopie.length; i++) {
				for (int k = 0; k < tableauCouleurRandomCopie.length; k++) {
					if(tableauUtilisateurCopie[i].equals(tableauCouleurRandomCopie[k]) && !tableauUtilisateurCopie[k].equals("-")) {
						count2++;	
						break;
					}
				}					  
			}
			System.out.println("Vous avez saisie "+Arrays.toString(tableauUtilisateur));
			System.out.println("Vous avez "+ count1 +" couleurs bien place");
			System.out.println("Vous avez "+ count2 +" couleurs presente mais mal place");
			/*  si on entre dans le if on stop la boucle sinon on remet les compteurs a 0 et on recomence*/
			if(count1 == 4) {
				verif = true;
			}
			else {
				count1 = 0;
				count2 = {
0;
			}
		}
		/* hors de la boucle je verifie la position de mon boolean pour savoir si le joueurs a win ou lose*/ 
		if(verif) {
			System.out.println("vous etes le master mind");
		}
		else {
			System.out.println("vous avez perdu ;) le tableau etais "
		+Arrays.toString(tableauCouleurRandom));
		}
	}
}
