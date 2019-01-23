package semaine5;

import java.util.Arrays;
import java.util.Scanner;
/*
 * supprimer les espace apres le mot rentrée
 * et empecher une case vide
 */
public class MasterMind {
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
		//System.out.println(Arrays.toString(tableauCouleurRandom));
		while(!verif && countEssai < 12) {
			countEssai++;
			System.out.println("Saisissez 4 couleurs (Rouge, Bleu, Vert, Jaune)");
			for (int i = 0 ; i<tableauUtilisateur.length;i++) { 

				saisie =scanner.nextLine().toLowerCase(); 
				tableauUtilisateur[i] = saisie; 		  
			}	
			String[] tableauCouleurRandomCopie = new String[4];
			String[] tableauUtilisateurCopie = new String[4];
			/* je cree une copie de mes tableau pour ne pas toucher au vrais tableau  et pouvoir regener� mes tableaux � chaque it�ration*/
			System.arraycopy(tableauUtilisateur, 0, tableauUtilisateurCopie, 0, 4);
			System.arraycopy(tableauCouleurRandom, 0, tableauCouleurRandomCopie, 0, 4);			
	
			/* je fais une boucle qui parcours mes tableaux originaux et je dis : � chaque foi que tu trouve une parfaite �galit�
			 * ajoute +1 au compteur 1 et remplace cette valeur par un "-" et modifie ma copie je fais ca pour ne
			 * plus avoir de valeur identique l'interet et qu'une valeur trouv� en bonne position ne peux pas etre ensuite retrouv�e */	
			for (int i = 0 ; i < tableauUtilisateur.length; i++) {
				if(tableauUtilisateur[i].equals(tableauCouleurRandom[i])) {					
					count1++;
					tableauUtilisateurCopie[i] ="-";
					tableauCouleurRandomCopie[i] = "-";
				}
			}
			/*  ici je parcours mes copie de tableau (donc apres modification) je n'ai donc plus que des valeur diff�rente 
			 * et je dis la valeur i est trouver en position k et que ce n'est pas un "-" (sinon il le compte comme une valeur) alors fait mon second compteur +1 */
			for (int i = 0 ; i<tableauUtilisateurCopie.length; i++) {
					for (int k = 0; k < tableauCouleurRandomCopie.length; k++) {
						if(tableauUtilisateurCopie[i].equals(tableauCouleurRandomCopie[k]) && !tableauUtilisateurCopie[k].equals("-")) {
							count2++;
							break;
						}
					}					  
			}
			System.out.println("Vous avez "+ count1 +" couleurs bien place");
			System.out.println("Vous avez "+ count2 +" couleurs presente mais mal place");
			/*  si on entre dans le if on stop la boucle sinon on remet les compteurs a 0 et on recomence*/
			if(count1 == 4) {
				verif = true;
			}
			else {
				count1 = 0;
				count2 = 0;
			}
		}
		/* hors de la boucle je verifie la position de mon boolean pour savoir si le joueurs a win ou lose*/ 
		if(verif) {
			System.out.println("vous etes le master mind");
		}
		else {
			System.out.println("vous avez perdu ;)");
		}
	}

}
