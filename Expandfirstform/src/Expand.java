import java.util.ArrayList;
import java.util.Scanner;

public class Expand {
	public static int Decomposition(int nb) {
		for ( int i = 2 ; i<=nb;i++) {
			if (nb % i == 0) {
				nb = nb/i;	
				return i; /* il y'a des cas ou elle peux ne rien retourner c'est pour ca qu'il lui faut 
				un second return */
			}
		}
		return 0; // je met return 0 pour prevoir le fait que return i ne renvois rien.
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbDecompose = scanner.nextInt();
		ArrayList<Integer> tableauMultiple = new ArrayList<Integer>();
		while(nbDecompose>1) {
		tableauMultiple.add(Decomposition(nbDecompose));
		nbDecompose = nbDecompose/tableauMultiple.get(tableauMultiple.size()-1);
		/* nbdecompose = nbDecompose diviser par la
		dernier valeur qu'on à mis dans regis get me permet d'obtenir la valeur qui lui est passer en argument
		  size -1 me permet d'obtenir la dernier valeur du tableau car size compte le nb d'element dans la list
		  à partir de 1*/
		}
		System.out.println(tableauMultiple);
		/*
		 * ArrayList<Integer> stock = new ArrayList<Integer>();
		 * for(int i = 2 ; i<=nbDecompose ; i++) { 
		 * if (nbDecompose % i == 0) {
		 * stock.add(i); 
		 * nbDecompose = nbDecompose/i; 
		 * i = 1; 
		 * }
		 * System.out.println(stock); }
		 */

	}

}
