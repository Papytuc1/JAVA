package semaine4;

import java.util.Arrays;

public class Exo5 {

	public static void main(String[] args) {
		boolean stop = true;
		int[] tab = new int[3];
		int count= 0;
		while(stop == true) {
			for (int i = 0;i<tab.length;i++) {
				tab[i] = (int) Math.floor(Math.random()*1000);
			}
			//int test = tab[0]%2;
			//System.out.println(test+"une tes"+tab[0]);
			for(int i =0; i<tab.length;i++) {
				if((tab[0]%2) ==0 && (tab[1]%2)==0 && (tab[2]%2)==1) {
					stop = false;// si j'entre dans la condition je stop ma boucle
				}
				else {
					count++;
				}
			}

		}
		System.out.println("Cool vous avez trouvez en "+count+" essai et voici "
				+ "votre tableau "+Arrays.toString(tab));/*Arrays.tostring me permet
		d'afficher mon tableau*/
	}
}