package semaine4;

import java.util.Scanner;

public class Exo7reel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez votre mot");
		String motSaisie = scanner.nextLine();
		motSaisie = motSaisie.toLowerCase();
		char A = 'a', E= 'e', I = 'i', O = 'o', U = 'u', Y='y';
		int a = 0 , e = 0 , i = 0 ,o = 0 ,u = 0 , y = 0 ;
		for(int x = 0 ; x<motSaisie.length();x++) {
			if(motSaisie.charAt(x)==A) {
				a++;
			}
			else if (motSaisie.charAt(x)==E) {
				e++;
			}
			else if (motSaisie.charAt(x)==I) {
				i++;
			}
			else if (motSaisie.charAt(x)==O) {
				o++;
			}
			else if (motSaisie.charAt(x)==U) {
				u++;
			}
			else if (motSaisie.charAt(x)==Y) {
				y++;
			}
				
		}
		System.out.println("Il y'a "+a+" 'a'\n"+"Il y'a "+e+" 'e' \n"+"Il y'a "+i+" 'i' \n"+
				"Il y'a "+o+" 'o'\n"+"Il y'a "+u+" 'u'\n"+"Il y'a "+y+" 'y'\n");

	}

}
