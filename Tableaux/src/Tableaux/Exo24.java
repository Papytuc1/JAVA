package Tableaux;

import java.util.Scanner;



public class Exo24 {

	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Votre nombre à mettre puissance 3");
		double nombre = scanner.nextDouble();
		nombre= Math.pow(nombre, 3);
		System.out.println(nombre);
*/

		regis(0);

	}
	/* je declare une methode "regis" et je declare un double que j'appel nombre
	 * ensuite je fais ma methode (exo demandé)*/

	public static double regis(double nombre) {
		Scanner scanner = new Scanner(System.in);
		nombre = scanner.nextDouble();
		nombre= Math.pow(nombre, 3);
		System.out.println(nombre);
	      return regis(0);

	}
}

