package semaine5;

import java.util.Scanner;

public class Tableau {
	/*
	 * une fonction qui affiche un tableau
	 * @args tab
	 */
	public static void affichage(int[] tab) {
		System.out.print("[");
		for (int i = 0 ; i<tab.length; i++) {
			System.out.print(tab[i]);
			if(i != tab.length -1) {
			System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	/*
	 * fonction qui permet de randomiser un nombre et le push dans un tableau
	 * @args la taille du tableau et la planche de randomisation
	 */
	public static int[] random(int tailleTab ,int tailleRandom) {
		int[] tab = new int[tailleTab];
		for (int i = 0; i<tab.length;i++) {
			tab[i] = (int)(Math.random()*tailleRandom+1);
		}
		return tab;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez la taille voulu de votre tableau");
		int saisieTailleTableau = scanner.nextInt();
		System.out.println("Entrez la taille voulu de votre planche de randomisation");
		int saisieRandom = scanner.nextInt();
		affichage(random(saisieTailleTableau, saisieRandom));

	}

}
