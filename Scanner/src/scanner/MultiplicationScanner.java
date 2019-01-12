package scanner;

import java.util.Scanner;

public class MultiplicationScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanner recup saisie
		int table = sc.nextInt();// saisie du chiffre
		for (int i = 0; i <= 10; i++) {//boucle stricte qui permet de multiplier la saisie
			System.out.println(table*i);
			sc.close();
		}
 	}
	

}
