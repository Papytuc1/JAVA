package semaine4;

import java.util.Arrays;

public class Exo12 {

	public static void main(String[] args) {
		int[] tab = new int[5];
		int somme = 0;
		for (int i = 0 ; i<tab.length;i++) {
			tab[i] = (int) (Math.random()*10);
			somme += tab[i];	
		}
		System.out.println("Voici le tableau "+Arrays.toString(tab));
		System.out.println("Et voici sa somme "+somme);
	}

}
