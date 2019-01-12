package Tableaux;

import java.util.Scanner;
public class Exo15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x;
		int i;
		String phrase;
		String phrase2;
		do {
		System.out.println("Saisir un mot ou les trois dernier cara vont être supprimer");       
		phrase = scanner.nextLine();
        x =phrase.length(); // compte la longueur de la chaines de caractere
        if(x>3) {
             phrase2 = phrase.substring(phrase.length()-3 );
             System.out.println(phrase);	
             }
             else {
             	System.out.println("Mot trop court recommencer");
             }
		}while (x<=3);		
        do {       
        System.out.println("saisir un mot ou les deux premier et les trois dernier cara vont être suprr");
      
        i = phrase.length();
        if (i>5) {
        phrase2 = phrase.substring(2, phrase.length()-3);
        System.out.println(phrase2);
        }
        else {
        	System.out.println("Votre mot n'est pas assez long");
        }
        }while(i<=5);
	}
      }
