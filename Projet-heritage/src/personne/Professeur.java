package personne;

public class Professeur extends Employe{
	private String specialite;
	public Professeur(int id, String nom, String prenom, double salaire, String specialite) {
		super(id, nom, prenom, salaire);
		this.specialite = specialite;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return super.toString()+" ma specialite est: "+specialite;
	}
	
}
