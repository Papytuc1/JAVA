package Tableaux;

public class Exo10 {

	public static void main(String[] args) {
		int tab1[] = {4,67,25,87};
		double tab2[] = {4.5,67,25.50,87.00};
		char tab3[] = {'r','2','?','+'};
		String tab4[] = {"Robert","Noémie","David","Bertrand"};
		
		System.out.println("Le chiffre 1 du tableau 1 est " + tab1[0]);
		tab1[2]=42;
		System.out.println("Le nombre 25 est remplacé par " + tab1[2]);
		System.out.println("Voicis le tableau 3 :");
		for(int i = 0; i < tab3.length ; i++ ) {
		System.out.println(tab3[i]);
		}
		System.out.println("Taille du tableau 1 est "+tab1.length);
	}
}
