package user;

import java.util.Scanner;

public class ComputerCalculateur {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Computer computer = new Computer();
		//System.out.println(computer.getValeurIni());		
		String reponse="";		
		while(!reponse.equals("stop")) {
			System.out.println("entrez votre chiffre(la valeur initial du calculateur est "+computer.getValeurIni()+")");
			int saisie = scanner.nextInt();
			System.out.println("Voulez vous additioner(add)/multiplier(multi)/diviser(div) "+"\n"
					+ "votre chiffre à la valeur initial ? Ou mettre fin au programme (stop)");
			scanner.nextLine();
		    reponse = scanner.nextLine();
		switch (reponse) {
		case "add":
			System.out.println(computer.add(saisie));
			break;
		case "multi" :
			System.out.println(computer.factor(saisie));
			break;
		case "div" :
			System.out.println(computer.divide(saisie));
			break;

		default:
			break;
		}
}
}
}