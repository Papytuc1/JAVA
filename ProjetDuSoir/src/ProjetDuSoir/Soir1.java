package ProjetDuSoir;

import java.util.Scanner;

public class Soir1 {
	public static int fibonacci(int saisie) {
		int f1 = 0;
		int f2 = 1;
		int sum = f1+f2;
		for(int i = 1; i<saisie;i++) {
			f1=f2;
			f2= sum;
			sum = f1+f2;			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int saisie = scanner.nextInt();
		System.out.println(fibonacci(saisie));
	}

}
