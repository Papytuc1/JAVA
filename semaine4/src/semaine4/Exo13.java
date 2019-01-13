package semaine4;

import java.util.Scanner;

public class Exo13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int entier = scanner.nextInt();
		//int entier = Integer.parseInt(args[0]);
		double somme= 0;
		for (double i = 1; i <= entier; i++) {
			somme += 1 / i;
			//System.out.println("voicis harmonic "+harmonic);
		}
		System.out.println(somme);
		somme = Math.round(somme*10.0)/10.0;/* Math.round ajoute 0.5 et ensuite il prend la partie entiere
		ce  que je fait ici c'est que je multiplie resultat par 10.0(Math.round fonctionne avec des double si je veux 
		exprimer un double) j'ajoute 0.5 et je redivise par 10 et je prend l'entier 
		j'utilise 10.0 pour avoir une seul décimal aprés la virgule, si j'utilise 100.0 j'en aurais 2 etc*/
		System.out.println("voicis la somme "+ somme);
	}

}
