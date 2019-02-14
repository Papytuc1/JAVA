package warrior;

public class Pnj extends Humain{

	public Pnj(String nom) {
		super(nom);
		
	}
	public void vendrePotion(Avatar client) {
		System.out.println("Bonjour voicis un potion"+client.getNom());
		client.setPotion(+1);
		client.setGold(client.getGold()-20);
	}
	@Override
	public void saluer(Avatar avatar) {
		System.out.println("Bonjour voulez vous une potion ?"+avatar.getNom());
	}
}
