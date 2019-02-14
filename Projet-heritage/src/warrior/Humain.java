package warrior;

public abstract class Humain {
	
	private String nom;
	public Humain(String nom) {
		this.setNom(nom);
	}
	abstract public void saluer(Avatar avatar);
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
