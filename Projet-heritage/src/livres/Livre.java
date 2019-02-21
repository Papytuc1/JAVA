package livres;

public class Livre {
	private static int id=1;
	private int prix;
	private String titre;
	private String auteur;
	private int count;
	public Livre(String auteur,String titre,int prix) {
		this.auteur= auteur;
		this.titre=titre;
		this.prix=prix;
		count =id;
		id++;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static int getId() {
		return id;
	}
	private  void setId(int id) {
		this.id = id;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String toString() {
		String affichage ="L'auteur du livre n°"+count+" est: "+auteur+"\nle Titre n°"+count+" est : "+titre+"\net sont prix :"+prix+" euros";
		return affichage;
	}
}
