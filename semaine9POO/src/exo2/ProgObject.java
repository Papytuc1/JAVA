package exo2;

import java.util.Scanner;

public class ProgObject {

	public static void main(String[] args) {
		ObjectTableau tableau = new ObjectTableau();
		Scanner scanner = new Scanner(System.in);
		int saisie;
		System.out.println("nombre");
		saisie = scanner.nextInt();
		tableau.setEntier(saisie);
		//tableau.push();
		tableau.pushRandom();//je génére un tableau aléatoire pour la suite de l'exo
		tableau.affichage();
		System.out.println("Ici le nombre d'instanciation de mon objet "+tableau.getInstance());
		System.out.println("Ici la valeur minimal "+tableau.intMinimum());
		System.out.println("Ici la valeur MAXIMAl "+tableau.intMaximum());
		System.out.println("Ici la somme du tableau "+tableau.somme());
		System.out.println("Donnez un parametre pour comptez les egalité ");
		System.out.println("il y'a "+tableau.egalite(4)+"egale à 4 dans le tableau");
		System.out.println("il y'a "+tableau.compris(4, 9)+" chiffre compris entre 4 et 9");
		System.out.println("Voici le premier element de votre tableau "+tableau.premier());
		System.out.println("Voici le dernier element de votre tableau "+tableau.dernier());
		System.out.println("Voici votre tableau a l'envers ");
		tableau.inverse();
		
		
	}

}
