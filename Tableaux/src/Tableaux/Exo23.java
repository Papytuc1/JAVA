package Tableaux;

import java.util.Scanner;


public class Exo23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir votre mot");
		String phrase = scanner.nextLine();
		System.out.println(majuscule(phrase));
		
	}

	public static String majuscule(String phrase) {// ma methode que j'appel au dessus du coup
		return phrase.toUpperCase();
	}
	

}
