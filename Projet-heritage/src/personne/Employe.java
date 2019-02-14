package personne;

public class Employe extends Personne{
	private double salaire;
	public Employe(int id, String nom, String prenom,double salaire) {
		super(id, nom, prenom);
		this.salaire=salaire;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return super.toString()+"mon salaire est de: " + salaire+"euros";
	}
	
}
