package kata;

import java.util.Scanner;

public class PremierKataGroupe {
	public static void expandedFirstForm(int result) {

		int facteur ; 
		String test = "";
		for (int i = 2; i <=result; i++) {  
			if(result%i==0) {
				result/= i;
				facteur = i;
				i= 1;
				test  += facteur  + "*";
			} 
		}

		System.out.print(test.substring(0,test.length() -1));

	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in); // recuperer saisie 
		int num1 = num.nextInt();
		expandedFirstForm(num1);

	}

}
