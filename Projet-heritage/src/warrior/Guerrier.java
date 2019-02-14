package warrior;

public class Guerrier extends Avatar{

	public Guerrier(String nom) {
		super(nom);
		super.setMagie(5);
		super.setPuissance(30);
		super.setVie(500);
		super.setVieMax(500);
	}

	@Override
	public void saluer(Avatar avatar) {
		System.out.println("Arg"+avatar.getNom());
	}

	@Override
	public void attaquer(Avatar adversaire) {
		System.out.println(this.getNom()+" GROMOK TAPE "+adversaire.getNom());
		adversaire.setVie(adversaire.getVie()-(this.getPuissance()*1));
		System.out.println(this.getNom()+" a retire "+this.getPuissance()+" a "+adversaire.getNom()+"\nIl reste "+adversaire.getVie()+" a "+adversaire.getNom());
	}	
}
