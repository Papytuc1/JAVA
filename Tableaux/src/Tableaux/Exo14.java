package Tableaux;

import java.util.Scanner;

public class Exo14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir une phrase qui va s'ecrire en MAJ");
		String phrase = scanner.nextLine();
		phrase = phrase.toUpperCase();
		System.out.println(phrase);
		System.out.println("Saisir une seconde phrase qui va avoir sa premiere lettre en MAJ et le reste en min");
		String phrase2 = scanner.nextLine();
		phrase2 = phrase.substring(0,1).toUpperCase() + phrase2.substring(1).toLowerCase();
		System.out.println(phrase2);
	}

}
