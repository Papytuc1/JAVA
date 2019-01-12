package scanner;

import java.util.Scanner;


public class scanner {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); //permet de recup la saisie
	System.out.println("Nom : ");
	String str = sc.nextLine();// saisie
	System.out.println("Resultat : " + str);
	sc.close();//fermeture du scanner

	System.out.println("Salut " + str + " ca va");
 }
}
