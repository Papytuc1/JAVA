import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ExpandBis {

	public static ArrayList<Integer> Decomposition(int nb) {
		ArrayList<Integer> stockArrayList = new ArrayList<Integer>();
		for ( int i = 2 ; i<=nb;i++) {
			if (nb % i == 0) {
				stockArrayList.add(i);
				nb = nb/i;
				i = 1;
			}
		}
		return stockArrayList;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nbDecompose = scanner.nextInt();
		ArrayList<Integer> tableauMultiple = Decomposition(nbDecompose);
		/*for (int multiple : tableauMultiple) {
		System.out.print(multiple+"*");
		/* pour chaque ligne de tableauMultiple elle associe une valeur à multiple pour la premier itération
		 * multiple vaux la valeur de la premier case et ainsi de suite*/
		//}
		for (ListIterator<Integer> iter = tableauMultiple.listIterator(); iter.hasNext(); ) {
			System.out.print(iter.next());
			if (iter.hasNext()) {
				System.out.print("*");
				/*  on utilise un nouvel objet : l'iterateur qu'on construit à partir de
				 * tableau multiple, l'iterateur permet de parcourir une liste est posséde les méthode haseNext, hasPrevious
				 * et regarder la doc
				 *    // 1 - can call methods of element
    // 2 - can use iter.remove() to remove the current element from the list
    // 3 - can use iter.add(...) to insert a new element into the list
    //     between element and iter->next()
    // 4 - can use iter.set(...) to replace the current element*/
			}

		}


	}

}
