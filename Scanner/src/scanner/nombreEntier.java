package scanner;

import java.util.Scanner;


public class nombreEntier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// import scanner
		boolean verif = true;
		/* ici j'utilie un boolean pour prendre tous mon code dans la boucle  je specifie plus bas
		  que verif est false tant qu'il est false la boucle ne ce run pas si il est true (de base 
		  il est en true) la boucle ce run et réexecute le code **/
		while (verif) {
		System.out.println("premier nombre");
	    int premierNb = sc.nextInt();//recup du premier NB
		System.out.println("Second nombre");
		int secondNb = sc.nextInt();// recup du second NB
		sc.nextLine();
		System.out.println("saisie opérateur");
		String operateur = sc.nextLine();// recup de l'operateur
		
	if((premierNb >= -1000 ) && (premierNb <= 1000) && (secondNb >= -1000) && (secondNb <= 1000) ) {
		       /* on utilise switch et case pour des condition à la carte en appelalnt l'operateur
		et en le definissant avec le case "" */
		
		switch (operateur) {
			case "+":
				System.out.println(premierNb+secondNb);
				verif=false;//tant que verif=false la boucle ne s'initialise pas
				break;
			case "-" :
				System.out.println(premierNb-secondNb);
				verif=false;
				break;
			case "*" :
				System.out.println(premierNb*secondNb);
				verif=false;
				break;
			case "/" :
				if ((premierNb != 0) && (secondNb != 0)) {
					System.out.println(premierNb/secondNb);
					verif=false;
				}
				else {
					System.out.println("Vous ne pouvez pas diviser par 0");
				}
				break;
			default:System.out.println("Opérateur saisie non valide" + (premierNb+secondNb) );
				break;
			}
		}
	
		    else {
			   System.out.println("Saisie non valide , la saisie doit être comprise entre -1000 et 1000");
		}
		    
		  
	}

}
}
