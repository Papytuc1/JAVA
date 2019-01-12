package Tableaux;


public class Exo19 {

	public static void main(String[] args) {
/*		int tab1[] = new int [8];
	    for (int i = 0; i<tab1.length;i++) {
	    	tab1[i] = (int) (Math.random() * 101);
	    }
	    System.out.println("Tableau dans le désodre "+Arrays.toString(tab1));
	    //Arrays.toString me permet une affichage en ligne de mon tableau
	    Arrays.sort(tab1);
	    System.out.println("Tableau en ordre "+Arrays.toString(tab1));*/
		boolean bol = false;
		int tab1[] = new int [8];
		int i;
		int modif;
	    for ( i = 0; i<tab1.length;i++) {
	    	tab1[i] = (int) (Math.random() * 101);
	        System.out.print(" "+tab1[i]);
	    }
	    System.out.println();
	while(!bol) {//tant que la boucle ne rentre pas dans la condition elle s'execute defini sur false de base
		bol =true;/* je met mon boolean sur true pour entrer dans la condition et j'y rentre
		               quand la condition de mon if n'est plus bonne*/
	
	    for( i = 0; i<tab1.length-1;i++) {
	    	if(tab1[i] > tab1[i+1]) {
	    		modif = tab1[i];
	    		tab1[i] = tab1[i+1];
	    		tab1[i+1] = modif;
	    		bol=false;// ici on tourne en boucle du coup jusqu'a ne plus rentrer dans la condition

	    	}
	    	//System.out.print(" "+tab1[i]);
	    }
	 }
	   for(int x =0;x<tab1.length;x++) {	    	
	    	System.out.print(" "+tab1[x]);
	    }
	}
}
