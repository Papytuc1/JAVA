package Tableaux;


public class Exo12 {

	public static void main(String[] args) {
		int tab1[] = new int [5];
	    for (int i = 0; i<tab1.length;i++) {
	    	tab1[i] = (int) (Math.random() * 10+0);
		   
	    	System.out.println(tab1[i]);
	    }
	    for (int n = 0; n<tab1.length; n++) {
	    	if(tab1[n] == 4 ) {
	    		System.out.println("La position de 4 est "+n);
	    }
	    	
	    }
}
}

