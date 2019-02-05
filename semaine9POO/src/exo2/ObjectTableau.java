package exo2;



public class ObjectTableau {
	private int entier;
	private int[] tab;
	private static int instance=0;

	public ObjectTableau() {
		instance++;
	}

	public int getEntier() {
		return entier;
	}
	public void setEntier(int entier) {
		this.entier = entier;
	}
	public int[] getTab() {
		return tab;
	}
	public void setTab(int[] tab) {
		this.tab = tab;
	}

	public int[] push() {
		tab = new int[entier];
		for(int i=1; i<tab.length+1;i++) {
			tab[i-1]=i;
		}
		return tab;
	}
	public void affichage() {
		for (int i : tab) {
			System.out.println(i);
		}
	}

	public static int getInstance() {
		return instance;
	}

	private static void setInstance(int instance) {
		ObjectTableau.instance = instance;
	}
	public int[] pushRandom() {
		tab = new int[entier];
		for(int i=1; i<tab.length+1;i++) {
			tab[i-1]= (int)(Math.random()*9);
		}
		return tab;
	}
	public int intMinimum() {
		int min = Integer.MAX_VALUE;
		for (int i = 0;i<tab.length;i++) {
			if (tab[i]<min) {
				min = tab[i];
			}
		}
		return min;
	}
	public int intMaximum() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i<tab.length;i++) {
			if(tab[i]>max) {
				max= tab[i];
			}
		}
		return max;
	}
	public int somme() {
		int somme= 0;
		for (int i : tab) {
			somme += i;
		}
		return somme;
	}

	public int egalite(int egale) {
		int egalite = 0;
		for (int i =0 ;i<tab.length;i++) {
			if (tab[i]== egale) {
				egalite++;
			}
		}
		return egalite;
	}
	public int compris(int p,int q) {
		int compris = 0;
		for(int i =0; i<tab.length;i++) {
			if(tab[i]>p &&tab[i]<q) {
				compris++;
			}
		}
		return compris;
	}

	public int premier() {
		return tab[0];
	}
	public int dernier() {
		return tab[tab.length-1];
	}
	public void inverse() {
		System.out.print("[");
		int inverse = 0;
		for (int i = tab.length-1 ; i>=0 ; i--) {
			if(i != -1 && i != tab.length-1) {
				System.out.print(",");
			}
			inverse = tab[i];
			tab[i]=inverse;
			System.out.println(tab[i]);
		}
		System.out.println("]");
	}
}
