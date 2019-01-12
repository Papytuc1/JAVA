package Tableaux;

import java.util.Scanner;

public class Exo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir une chaine de cara");
		String chaines = sc.nextLine();
		System.out.println("Saisir un caractère");
		String lettre = sc.nextLine();
		char saisie = lettre.charAt(0);// on transforme la chaine de cara en caractere 
		int nb = 0;
		
		for(int i=0;i<chaines.length();i++) {
			if(chaines.charAt(i) == saisie) {
				nb++;
			}
		}
        System.out.println(nb);
	}

}