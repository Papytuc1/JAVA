package semaine4;

public class Exo2Test {
	/**
	 * je crée une méthode que me permet d'acceder à un tableau
	 * @param tab; ce que devrais recevoir ma methode est une tableau à deux dimension
	 */

	 public static void affiche(int tab[][]) {
	        for(int x=0; x<tab.length; x++) {
	            for(int j=0; j<tab[x].length; j++) {
	                System.out.print(tab[x][j]+" ");
	            }
	            System.out.println("");
	        }
	        
	        /* methode pour acceder à un tableau à deux dimension */
	        
	    }
	    
	    public static void main(String[] args) {
	        int tab1[][] = {{2,4,5}, {3,33,32}};
	        System.out.println("premier tableau");
	        affiche( tab1);
	        System.out.println("second tableau");
	        int tab2[][] = {{3},{3,4,5},{3,5},{3,1,0}};
	        affiche(tab2);
	        /* on déclare les tableau et on lui applique notre methode */
	    }

	}
