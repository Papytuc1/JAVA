package user;

import java.util.Scanner;

public class QuadrilatereMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hauteur = scanner.nextInt();
		int largeur = scanner.nextInt();
		
		Rectangle quadrilatere = new Rectangle();
		//quadrilatere.setLargeur(scanner.nextInt());
		//quadrilatere.setHauteur(scanner.nextInt());
		quadrilatere.setHauteur(hauteur);
		quadrilatere.setLargeur(largeur);
		System.out.println("Voicis l'aire "+quadrilatere.aire()+" "
		+"Voicis le périmetre "+ quadrilatere.perimetre());

	}

}
