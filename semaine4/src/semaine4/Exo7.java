package semaine4;

import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez votre mot");
		String motSaisie = scanner.nextLine();
		motSaisie = motSaisie.toLowerCase();
		System.out.println("Entrez votre lettre qui seras compté dans votre mot");
		char lettre = scanner.next().charAt(0);
		int count = 0;
		//System.out.println(lettre);
		for(int i = 0; i<motSaisie.length();i++) {
			if(motSaisie.charAt(i)==lettre) {
				count++;
			}
		}
		System.out.println("Votre mot "+motSaisie+" contient "+count+" "+lettre);

	}

}
