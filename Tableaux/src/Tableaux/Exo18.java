package Tableaux;

import java.util.Scanner;

public class Exo18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir votre entier en 0 et 256");
		int nombre;
		do {
			nombre = scanner.nextInt();
		if(( nombre > 0) && ( nombre <256)) {
		char c = (char)nombre;// le nombre va chercher le char correspondant
		System.out.println(c+" Essayez en un autre ;)");
	}
		else {
			System.out.println("On à dit entre 0 et 256 tant pis :(");
		}
		}while(( nombre > 0) && ( nombre <256));
}
}