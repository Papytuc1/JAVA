package semaine4;

import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int saisie = scanner.nextInt();
		int factorielle = 1;
		if (saisie != 0) {
			for (int i = 1; i<=saisie;i++) {
				factorielle *= i;
				System.out.println(saisie+"test "+i);
			}
		}
		System.out.println(factorielle);

	}

}
