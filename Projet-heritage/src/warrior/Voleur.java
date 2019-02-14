package warrior;

public class Voleur extends Avatar{

	public Voleur(String nom) {
		super(nom);
		super.setMagie(25);
		super.setPuissance(25);
		super.setVie(300);
		super.setVieMax(300);
		
	}

	@Override
	public void saluer(Avatar avatar) {
		System.out.println("Bonjour que vous etes beau aujourd hui "+avatar.getNom());
		super.setGold(+1);
		avatar.setGold(avatar.getGold()-1);
	}

	@Override
	public void attaquer(Avatar adversaire) {
		System.out.println(this.getNom()+" lance coup de dague, coup de dague sur "+adversaire.getNom());	
		int cc = (int)(Math.random()*10);		
		if(cc<3) {
			System.out.println("Coup critique");
			adversaire.setVie(adversaire.getVie()-(this.getPuissance()*2));
			System.out.println(this.getNom()+" a retire "+(this.getPuissance()*2)+" a "+adversaire.getNom()+"\nIl reste "+adversaire.getVie()+" a "+adversaire.getNom());
		}
		else {
			adversaire.setVie(adversaire.getVie()-this.getPuissance());
			System.out.println(this.getNom()+" a retire "+this.getPuissance()+" a "+adversaire.getNom()+"\nIl reste "+adversaire.getVie()+" a "+adversaire.getNom());
		}
	}
}
