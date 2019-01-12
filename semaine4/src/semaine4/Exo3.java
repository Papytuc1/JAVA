package semaine4;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nom = scanner.nextLine();
		System.out.println(nom.toUpperCase());
		System.out.println(nom.substring(0, 1).toUpperCase()+nom.substring(1,nom.length()).toLowerCase());

	}

}
