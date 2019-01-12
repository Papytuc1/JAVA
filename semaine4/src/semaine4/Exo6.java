package semaine4;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		//t
		Scanner scanner = new Scanner(System.in);
		boolean verif = true;
		LocalTime newTime;
		int count = 0;
		int nombreRandom= (int) (Math.random()*1001);
		//System.out.println("Voicie le nombreRandom " + nombreRandom);
		System.out.println("Entrer un nombre compris en 0 et 1000");
		LocalTime oldTime = LocalTime.now();
		while(verif) {
			int saisie = scanner.nextInt();
			if(nombreRandom>saisie) {
				System.out.println("Votre chiffre est " +saisie+" mais c'est plus");
				count++;

			}
			else if(nombreRandom< saisie) {
				System.out.println("Votre chiffre est " +saisie+" mais c'est c'est moins");
				count++;
			}
			else if (nombreRandom == saisie) {
				newTime = LocalTime.now();
				Duration duree = Duration.between(oldTime, newTime);
				System.out.println("Bravo vous avez trouvez le bon nombre en "+count+" essai et en "+
				duree.getSeconds()+" secondes");
				verif = false;
			}

		}

	}
}