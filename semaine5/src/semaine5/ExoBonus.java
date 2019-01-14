package semaine5;

public class ExoBonus {
	public static int tableau(int[] tab) {
		int max =0;
		for (int i = 0; i<tab.length;i++) {
			if(tab[i]>max) {
				max = tab[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] tab = {3,5,2,8,7,9};
		System.out.println(tableau(tab));
	}
}
