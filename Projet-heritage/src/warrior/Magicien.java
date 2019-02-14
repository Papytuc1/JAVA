package warrior;

public class Magicien extends Avatar{
	
	public Magicien(String nom) {
		super(nom);
		super.setMagie(50);
		super.setPuissance(70);
		super.setVie(300);
		super.setVieMax(300);
		
	}

	@Override
	public void saluer(Avatar avatar) {
		System.out.println("Hello Sir "+avatar.getNom());
	}

	@Override
	public void attaquer(Avatar adversaire) {
		System.out.println(this.getNom()+" lance une boule de feu sur "+adversaire.getNom());
		adversaire.setVie(adversaire.getVie()-(this.getPuissance()+25));
		this.setMagie(this.getMagie()-10);
		System.out.println("Il reste "+this.getMagie()+" de mana a "+this.getNom());
		System.out.println(this.getNom()+" a retire "+this.getPuissance()+" a "+adversaire.getNom()+"\nIl reste "+adversaire.getVie()+" a "+adversaire.getNom());
	}
	public void bouleDeFeu(Avatar avatar) {
		
	}
}
