package Tableaux;

public class Exo20 {

	public static void main(String[] args) {
		//les int représentés entre les crochets, représentent les lignes et colonnes
		//du tableau à deux dimensions, respectivement
		int[][] tableau =new int [2][2];
		
		//Parcours lignes et colonnes pour les deux for, respectivement
				for(int i=0; i<tableau.length; i++)
				{
					   for(int j=0; j<tableau[i].length; j++)
					   {
		//tableau[i][j] est l'entier qui se trouve à la i ème ligne et j ème colonne. 
					     //tableau[i][j] = i+j;
					     System.out.print(tableau[i][j]);
/*Cette méthode "print" écrit la chaîne de caractères mais ne passe pas après à la ligne, 
 * contrairement à la méthode println */
					   }
					   System.out.println();
				}

	}

}
