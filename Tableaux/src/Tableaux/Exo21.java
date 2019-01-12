package Tableaux;

public class Exo21 {

	public static void main(String[] args) {
		int[] [] matriceA= {{1,2},{2,3}};// j'init mes matrices carrée
		int[] [] matriceB= {{4,5},{6,7}};
		int[] [] matriceC = new int [2][2];
		//double boucle pour ouvrir ma matrice et y acceder
		for(int i=0; i<matriceA.length; i++){			
			   for(int j=0; j<matriceA[i].length; j++){
// ma matriceA est "ouverte" je peux donc additionné les lignes et les colonnes
			     matriceC[i][j] = matriceA[i][j] + matriceB[i][j];
			     System.out.print(" "+matriceC[i][j]);
			   }
		}
}
}
