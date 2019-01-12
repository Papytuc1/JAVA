package scanner;

import java.util.Scanner;

public class MultiplicationLibre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir votre multiple");
		int premiereSaisie = sc.nextInt();
		System.out.println("Saisir le chiffre a multiplier");
		int secondeSaisie = sc.nextInt();
		
		for (int  i = 0; i <= secondeSaisie; i++) {
			
			System.out.println(i*premiereSaisie);
		}
	}

}
