package Exo1;

public class User {
	private String nom;
	private String age;
	private String parcAuto ="";
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age+" ans";
	}
	public String getParcAuto() {
		return parcAuto;
	}
	public void setParcAuto(String parcAuto) {
		this.parcAuto = parcAuto;
	}
	public String infoParcAuto(String parc) {
		parcAuto += parc;
		return parcAuto;
	}
}
