package Exo1V2;

public class Voiture {
	private String marque;
	private String couleur;
	private int porte;
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getPorte() {
		return porte;
	}
	public void setPorte(int porte) {
		this.porte = porte;
	}
	
	public String infoVoiture(){
		return "Marque "+getMarque()+"\nCouleur "+getCouleur()+"\nNombre de porte "+getPorte();
	}
}
