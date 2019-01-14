package semaine4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] email = new String[2];
		String domaine ="";
		int orange =0;
		int sfr = 0;
		int gmail = 0;
		int hotmail = 0;
		
		for (int i = 0; i<email.length;i++) {
			email[i]= scanner.nextLine();
		}
		for(int x = 0; x<email.length;x++) {
			String e = email[x];
			int stock = email[x].indexOf("@");/* je trouve l'index de @ et je le stock 
			dans une variable pour le reutiliser plus bas*/
			int last = email[x].indexOf(".");
			//System.out.println(e);
			for(int j = stock;j<last;j++) {
				//System.out.println(e.charAt(j));
				domaine += e.charAt(j);// je concaténe chaque lettre pour reformer un mot et pouvoir le comparer
				//System.out.println(domaine);
				if(domaine.equals("@hotmail")) {
					hotmail++;
					domaine = "" ;/* je réinitialise domaine a chaque foi qu'il 
					trouve pour qu'il puisse recomencer a compter*/
				}
				else if (domaine.equals("@orange")) {
					orange++;
					domaine = "";

				}
				else if (domaine.equals("@sfr")) {
					sfr++;
					domaine = "";
				}
				else if (domaine.equals("@gmail")) {
					gmail++;
					domaine = "";
				}
			}
		}
		System.out.println("il y'a "+hotmail+" adresse email @hotmail");
		System.out.println("il y'a "+orange+" adresse email @orange");
		System.out.println("il y'a "+sfr+" adresse email @sfr");
		System.out.println("il y'a "+gmail+" adresse email @gmail");
		//System.out.println(hotmail);
	}
}