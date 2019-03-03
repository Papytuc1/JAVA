package warrior;

import java.util.Scanner;

public class Pnj extends Humain{
	String reponseString="";
	public Pnj(String nom) {
		super(nom);
		
	}
	public void vendrePotion(Avatar client) {
		System.out.println("Bonjour voicis une potion "+client.getNom());
		client.setPotion(+1);
		client.setGold(client.getGold()-20);
	}
	@Override
	public void saluer(Avatar avatar) {
		Scanner scanner=new Scanner(System.in);
		boolean verif = true;
		System.out.println("Bonjour je suis "+ super.getNom()+" le vendeur de popo voulez vous une potion(oui/non) ?"+avatar.getNom());
		while (verif) {
			reponseString=scanner.nextLine();
		if(reponseString.equals("oui")&& avatar.getGold()>=20) {
			vendrePotion(avatar);
			verif=false;
		}
		else if(reponseString.equals("non")) {
			System.out.println("Aurevoir");
			verif=false;
		}
		else if(avatar.getGold()<20){
			System.err.println("Vous n'avez pas assez d'argent");
			verif=false;
		}
		else {
			System.out.println("Je n'ai pas compris votre reponse recomencer votre saisie");
		}
		}
	}
}
