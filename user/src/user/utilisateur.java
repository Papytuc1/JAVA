package user;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class utilisateur {

	public static void main(String[] args) {
		User user = new User();
		
		user.id = 1;
		user.civilite ="MR";
		user.login = "samoulos";
		user.nom = "LA TORTUE";
		user.prenom = "samy";
		user.email = "samy@latortue.litoral";
		user.telFixe = "0467";
		user.telPortable= "0630";
		user.date = LocalDate.of(2018, Month.DECEMBER, 10);
		user.pw = user.calculePw();	
		
		user.affichage();
	}
	/*public static void main(String[] args) {
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez votre pseudo");
		user.id = scanner.nextLine();
		System.out.println("Entrez votre civilité");
		user.civilite =scanner.nextLine();
		System.out.println("Entrez votre nom ");
		user.nom = scanner.nextLine();
		System.out.println("Entrez votre prénom");
		user.prenom = scanner.nextLine();
		System.out.println("Entrez votre email");
		user.email = scanner.nextLine();
		System.out.println("Entrez votre téléphone Fixe");
		user.telFixe = scanner.nextLine();
		System.out.println("Entrez votre téléphone portable");
		user.telPoratable= scanner.nextLine();
		user.date = LocalDate.of(2018, Month.DECEMBER, 10);
		
		
		user.affichage();
		user.calculePw();
		//System.out.println(user.nom);
		

	}*/

}
