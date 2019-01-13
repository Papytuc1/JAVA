package randori;

import java.util.ArrayList;

public class RandoriThib {
	
	public static ArrayList<Integer> Difference(int[] tabA, int[] tabB) {
		ArrayList<Integer> tabC = new ArrayList<Integer>();
		for (int i = 0; i < tabA.length; i++) {
			if (tabA[i] != tabB[0]) {
				tabC.add(tabA[i]);
			}
		}
		return tabC;
	}
	
	public static void main(String[] args) {
		int[] tabA = {1,2,2,2,3};
		int[] tabB = {2};
		System.out.println(Difference(tabA, tabB));
	}

}
