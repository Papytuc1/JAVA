package personne;

public class Etudiant extends Personne{
	private int cne;
	public Etudiant(int id, String nom, String prenom,int cne) {
		super(id, nom, prenom);
		this.cne=cne;
		
	}

	@Override
	public String toString() {
		return super.toString()+" mon CNE est :"+cne;
	}

	public int getCne() {
		return cne;
	}

	public void setCne(int cne) {
		this.cne = cne;
	}

}
