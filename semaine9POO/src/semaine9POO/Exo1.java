package semaine9POO;

public class Exo1 {
	private String couleur ="";
	private String marque="";
	private int portiere = 5;
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getPortiere() {
		return portiere;
	}
	public void setPortiere(int portiere) {
		this.portiere = portiere;
	}
	
	public String affichage() {
		return "Marque: "+getMarque()+"\nCouleur: "+getCouleur()+"\nNombre de porte: "+getPortiere()+"\n";
	}

}
