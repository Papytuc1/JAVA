package semaine4;

import java.util.Scanner;

public class Exo15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbDeLigne = scanner.nextInt();
		int countEspace = nbDeLigne;
		String etoile1 = "*";
		String etoile2 = "**";
		String espace="";
		
		for(int i = 0 ; i<nbDeLigne;i++) {// ma boucle tourne le nb de lignes entr�es
			countEspace -= 1;// je d�cre�mente mon compteur d'espace de 1 � chaque tours
			for (int j = countEspace; j > 0 ; j--) {/* ma boucle decrementale qui commence donc a
			nbDeLigne -1 */
				espace += " ";/* ici je concat�ne mon nb d'espace par exemple nbDeLigne -1 = 5-1 donc 4 
				j'ajoute donc 4 espace avant d'ecrire quelque chose*/
			}
			System.out.println(espace+etoile1);/*  ici mes 4 espace + mon �toile*/
			etoile1 += etoile2;/* ici j'ajoute � chaque it�ration etoile = etoile + etoile 2 */
			espace = "";/* je reset mes espaces pour qu'en suite au lieu de partir de 4 espace on reparte de 0
			et on refait la m�me op�ration avec un nouveau chiffre qui est d�termin� par mon countEspace**/ 
		}
	}
}
