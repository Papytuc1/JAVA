package randori;

import java.util.ArrayList;

public class RandoriThib {

	public static ArrayList<Integer> Difference2(int[] tabA, int[] tabB) {
		ArrayList<Integer> tabC = new ArrayList<Integer>();
		for (int i = 0; i < tabA.length; i++) {
			//tester l element i 
			boolean flag = true ;
			int j = 0;
			while (flag && j < tabB.length) {
				if (tabA[i] == tabB[j]) {
					flag = false;
				}
				j++;
			}
			//fin test i
			if (flag) {
				tabC.add(tabA[i]);
			}
		}
		return tabC;
	}

	public static ArrayList<Integer> Difference(int[] tabA, int[] tabB) {
		ArrayList<Integer> tabC = new ArrayList<Integer>();
		for (int i = 0; i < tabA.length; i++) {
			//tester l element i 
			boolean flag = true ;
			for (int j = 0 ; j < tabB.length; j++) {
				if (tabA[j] == tabB[i]) {
					flag = false;
				}
			}
			//fin test i
			if (flag) {
				tabC.add(tabA[i]);
			}
		}
		return tabC;
	}

	public static void main(String[] args) {
		int[] tabA = {1,2,2,2,3,3};
		int[] tabB = {3,1};
		System.out.println(Difference2(tabA, tabB));
	}

}
