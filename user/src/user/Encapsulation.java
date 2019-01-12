package user;

import java.time.LocalDate;

public class Encapsulation {
	private  int id;
	private  String civilite;
	private  String nom;
	private  String prenom;
	private  String email;
	private  String telFixe;
	private  String telPortable;
	private  String login;
	private  LocalDate date;
	private  String pw;
	
	public int getId() {
		return id;	
	}
	
	public String getCivilite(){
		return civilite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelFixe() {
		return telFixe;
	}
	
	public String getTelPortable(){
		return telPortable;
	}
	
	public String getLogin() {
		return login;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	public void setcivilite(String newCivilite) {
		civilite = newCivilite;
	}
	public void setNom(String newNom) {
		nom = newNom;
	}
	
	public void setPrenom(String newPrenom) {
		prenom = newPrenom;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public void setTelFixe(String newTelFixe) {
		telFixe = newTelFixe;
	}
	
	public void setTelPortable(String newTelPortable) {
		telPortable = newTelPortable;
	}
	
	public void setLogin(String newLogin){
		login = newLogin;
	}
	
	public void setDate(LocalDate newDate) {
		date = newDate;
	}
	public void setPw(String newPw) {
		pw = newPw;
	}
	
	public void finalize() {
		System.out.println("déstruction");
	}
	public String calculePw() {
		/*nom = nom.toLowerCase().concat("pw");
		System.out.println("Votre mot de passe est : "+nom);*/
		
		return nom.toLowerCase()+"pw";
	}
	public void affichage() {
		System.out.println(id);
		System.out.println(civilite);
		System.out.println(nom);
		System.out.println(prenom);
		System.out.println(email);
		System.out.println("votre telephone fixe est "+telFixe);
		System.out.println("votre telephone portable est "+telPortable);
		System.out.println(login);
		System.out.println(date);
		System.out.println(pw);
		
	}
	public Encapsulation(int id, String civilite ,String login,String nom,String prenom,String email,String telFixe,String telPortable,
		LocalDate date) {
		this.setId(id);
		this.setcivilite(civilite);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setEmail(email);
		this.setTelFixe(telFixe);
		this.setTelPortable(telPortable);
		this.setLogin(login);
		this.setDate(date);
		this.setPw(calculePw());
		
		
	}
	public Encapsulation() {
		
	}
	public Encapsulation(Encapsulation regis) {
		this.nom = regis.nom;
	}
}
