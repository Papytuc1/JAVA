package semaine4;

import java.util.Scanner;

public class Exo10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pointEntree = scanner.nextInt();
		int fibonacci1 = 0;
		int fibonacci2 = 1;
		int sum;

		for (int i = 0;i<pointEntree;i++) {
			sum = fibonacci1+fibonacci2;
			fibonacci1=fibonacci2;
			fibonacci2=sum;
			System.out.println(sum);

			// fn-1+fn-2

		}
		System.out.println("le resultat de la position "+pointEntree+" sur la suite de fibonacci est "+fibonacci2);

	}

}
