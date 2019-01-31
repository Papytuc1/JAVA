package Exo1;

public class Voiture {
	private String couleur ="";
	private Constructeur marque;
	private int portiere = 5;
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getPortiere() {
		return portiere;
	}
	public void setPortiere(int portiere) {
		this.portiere = portiere;
	}
	
	public  String infoVoiture() {
		return "Marque: "+getMarque()+"\nCouleur: "+getCouleur()+"\nNombre de porte: "+getPortiere()+"\n";
	}
	
	public Constructeur getMarque() {
		return marque;
	}
	public void setMarque(Constructeur marque) {
		this.marque = marque;
	}

	public enum Constructeur {
		RENAULT,
		HONDA,
		TOYOTA,
		PROTOTYPE
	}

}
