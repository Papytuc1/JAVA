package user;

import java.time.LocalDate;

public class User {
	int id;
	String civilite;
	String nom;
	String prenom;
	String email;
	String telFixe;
	String telPortable;
	String login;
	LocalDate date;
	String pw;
	
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
	public User() {
		
	}

}
