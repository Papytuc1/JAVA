package Tableaux;

import java.util.Scanner;


public class Exo16bis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("mot a tester");
		String mot = scanner.nextLine();
		int count= 0;
		for(int i = 0; i < mot.length();i++) {
			if(mot.charAt(i) == mot.length()-1){
				count++;
			}
		}
		if (count == mot.length()) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("raté");
		}

		
	}

}
