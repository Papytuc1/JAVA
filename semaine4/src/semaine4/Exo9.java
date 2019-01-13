package semaine4;

import java.util.Scanner;

public class Exo9 {
	public static long facto(long saisie) {
		long factoriel = 1;
		for(long j = 1 ; j<= saisie ; j++ ) {
			factoriel *= j;		
		}
		return  factoriel;		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long saisie = scanner.nextInt();
		System.out.println("le factorielle de "+saisie+" est " +facto(saisie));

	}

}
