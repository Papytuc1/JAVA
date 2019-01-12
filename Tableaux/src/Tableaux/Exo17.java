package Tableaux;

import java.util.Arrays;
import java.util.Scanner;


public class Exo17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String oui = "o";
		String reponse;
		int count = 0;
		String mot = scanner.nextLine();// un mot random
		char[] copieMot = mot.toCharArray();// je met mon mot dans un tableau de char
		char [] decouvert = "---------".toCharArray();// je fait un tableau "vide"
		System.out.println("trouver le mot --------- bon courage");
		do {
			count++;
		String saisie = scanner.nextLine();
		int position;
		while((position = new String(copieMot).indexOf(saisie))>=0) {
		 /* indexOf() me permet de chercher dans mon tableau la premier occurence de la saisie
		  * premier passage avec un u il trouve u en index 0 il remplace u dans le copieMot
		  * par un - (voir en bas) la boucle repasse ne vois plus le u en position 0 mais en 
		  * X et donc la remplace et ainsi desuite. 
		  * new String(copieMot) cree un String a partir du tableau copieMot et nous permet d'utiliser
		  * indexOf qui est une methode de la classe String par rapport a saisie le tout sans le stocké
		  
		 */
			copieMot[position] = '_';// il remplace la position par un char
			decouvert[position]= saisie.charAt(0);//il remplace le char par la saisie
		}
		System.out.println("vous avez saisie "+saisie);
		System.out.println(decouvert);

		if(!copieMot.equals(decouvert)) {
			System.out.println("Vous y etes presque voulez vous essayez un mot ?");
			reponse = scanner.nextLine();
			if(reponse.equals("o")) {
			   String solution = scanner.nextLine();
		         if(solution.equals(mot)) {
			       System.out.println("Bravo");
			         count = 5;
		}
		}
		}
}while(count != 5);
}
}

		/*Scanner scanner = new Scanner(System.in);

		String[] tab= {"u", "l","u","b","e","r","l","u","e"};
		String[] tabCache = {"-","-","-","-","-","-","-","-","-"};
		String oui = "o";
		int count = 0;
		do {
			count++;
			System.out.println("Choisir une lettre");
			String lettre = scanner.nextLine();
			for (int i=0;i<tab.length;i++) {
				if (tab[i].equals(lettre)){		
					tabCache[i] =lettre;
					System.out.println("Votre lettre a été trouvé en position : "+i);
				}

			}
			System.out.println(Arrays.asList(tabCache));
			if(!tab.equals(tabCache)) {
				System.out.println("Vous y etes presque voulez vous essayez un mot ?");	
				
				String reponse = scanner.nextLine();
				if(reponse.equals(oui)) {
					System.out.println("Votre réponse est ");
				String solution = scanner.nextLine();
				
			if(solution.equals("uluberlue")) {
				System.out.println("Bravo le mot étais bien [u-l-u-b-e-r-l-u-e]");
			count = 5;
			}
			}
			}
		
		}while(count !=5 );

	}
}*/
