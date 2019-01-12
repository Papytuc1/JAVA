package semaine4;

import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Saisir un chiffre");
		int nombre = scanner.nextInt();
		String detail = String.valueOf(nombre);
		System.out.println("Voicis votre chiffre décomposer");
		for(int i = 0;i<detail.length();i++) {
			System.out.println(detail.charAt(i));
		}

	}

}
