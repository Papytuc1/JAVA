package semaine4;

import java.util.Scanner;
/* au carr�e = au nb*nb */

public class Exo14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int saisie = scanner.nextInt();
		int[] tableau = new int[saisie];
		int nbImpair = 1;
		
		for (int i = 0 ; i<saisie ;i++) {
			tableau[i]= nbImpair*nbImpair;
			System.out.println(nbImpair+" a pour carre "+ tableau[i] );
			nbImpair += 2;
			
		}
	}

}
