package Tableaux;

import java.util.Scanner;

public class Exo16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String mot,reverse="";// = une chaine de caractere vide
		System.out.println("entrez votre mot");
		mot = scanner.nextLine();
		int x = mot.length();
		for (int i =  x-1 ; i >= 0 ; i-- ) { // boucle decremental (qui compte en partant de la fin)
			reverse = reverse + mot.charAt(i);/* string est un tableau de base charAt(i) permet 
			                                     d'acceder au case du tableau par rapport a i (la fin donc ici grace a 
			                                     la boucle decremental)
			                                     et de le recomposer les case (charAt) sur reverse*/
			//System.out.println(mot.charAt(i));
		}
		if(mot.equals(reverse)) {// compare deux chaine de caractere .equals est un comparateur de string
			System.out.println("Le mot est un Palindrome");
		}
		else {
			System.out.println("Le mot n'est pas un Palindrome");
		}
	}


}
/* ma boucle decremental a x-1 ce qui correspond à la longueur du mot -1
 * car 0 etant compté si je ne met pas -1 en longueur de mot ma boucle tourne une foi de moins
 * mon mot fait 5 lettres il fait pas 1/2/3/4/5 mais 0/1/2/3/4/5 donc 6 tours c'est pour cela 
 * que longueur du mot -1 ou x-1 dans mon code  pour un tour de moins*/
