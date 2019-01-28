package semaine4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo4Bis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean verif = true;
		String email="";
		String comparateur ="";
		String oui;
		String reponse;
		ArrayList<String> emailInconnue = new ArrayList<String>();
		//ArrayList<Integer> Compteur = new ArrayList<Integer>();
		//emailInconnue.add("salut@gmail.fr");
		//emailInconnue.add("regis@gmail.fr");
		//emailInconnue.add("salut@gmail.fr");
		while(verif){
			email = scanner.nextLine();
			if(email.contains("@") && email.substring(email.indexOf("@")).contains(".")) {
				emailInconnue.add(email.substring(email.indexOf("@")+1,email.lastIndexOf(".")));
				System.out.println("Voulez vous continuer oui/non ?");
				reponse = scanner.nextLine();
				if(reponse.equals("non")) {
					verif = false;
				}
				else {
					verif = true;
					System.out.println("entrée un nouvel email");
				}
			}
		}
		emailInconnue.sort(null);
		comparateur = emailInconnue.get(0);
		//System.out.println(emailInconnue);
		int count = 0 ;
		for (int i = 0; i<emailInconnue.size();i++) {

			//System.out.println(comparateur);
			if(comparateur.equals(emailInconnue.get(i))) {
				count++;				
			}
			else {
				System.out.println("vous avez "+count+" "+comparateur);
				comparateur = emailInconnue.get(i);
				count = 1;
			}
		}
		System.out.println("vous avez "+count+" "+comparateur);

	}
}
