import java.util.Scanner;

public class RomainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine().toLowerCase();
		char user2[] = user.toCharArray();
		char voyelle[] = {'a','e','i','o','u','y'};
		int nVoy[] = new int[voyelle.length];

		for(int j=0; j<voyelle.length; j++) {
			for(int i=0; i <user2.length; i++) {

				/* je parcours gr�ces au deux for mes voyelles et mon
				 * entr�e user2 qui est convertit en tableau de char
				 * et en minuscule en amont */

				if(user2[i]==voyelle[j]) {
					nVoy[j]++;
				}

				/* Ma condition de comparaison entres voyelles et entr�e utilisateur
				 * si �a match je stock l'index de localisation dans mon tableau nVoy et
	                   l'incr�mante (du nbres de voyelles (j)) � chaque fois que �a match */
			}
		}
		  for(int i=0; i<voyelle.length; i++) {
			  if(nVoy[i] != 0) {
	            System.out.println("Voyelle trouv� "+ voyelle[i]+ " et leurs nombres "+ nVoy[i] );
	        }
		  }
		sc.close(); 

	}

}
