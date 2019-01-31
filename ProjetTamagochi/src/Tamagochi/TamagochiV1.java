package Tamagochi;

import java.util.Scanner;

public class TamagochiV1 {
	private static int age = 0;
	private int bonheur = 20;
	private int poid = 20;
	private int faim = 0;
	private String sexe ="";
	private String nom ="";
	private String repos ="";
	private String toilette = "sale";

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getBonheur() {
		return bonheur;
	}
	public void setBonheur(int bonheur) {
		this.bonheur = bonheur;
	}

	public int getAge() {
		return age;
	}

	private static void setAge(int age) {
		TamagochiV1.age = age;
	}

	public int getPoid() {
		return poid;
	}

	private void setPoid(int poid) {
		this.poid = poid;
	}

	public int getFaim() {
		return faim;
	}

	private void setFaim(int faim) {
		this.faim = faim;
	}

	public String getToilette() {
		return toilette;
	}

	private void setToilette(String toilette) {
		this.toilette = toilette;
	}

	public String getRepos() {
		return repos;
	}

	private void setRepos(String repos) {
		this.repos = repos;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Methode pour l'eclosion alléatoire de notre Tamagochi
	 * @return
	 */
	public String eclosion() {
		int random = (int) (Math.random()*2);
		switch (random) {
		case 0:
			setSexe("un male");
			break;
		case 1 :
			setSexe("une femelle");
			break;
		default: System.err.println("error");
		break;
		}
		return getSexe();
	}

	public void age() {
		age++;
	}

	public void dormir() {
		faim -= 10;
		bonheur -= 15;
		repos ="repose";
		toilette ="sale";
	}

	public void nourir() {
		faim +=15;
		poid+=20;
	}
	public void faim() {
		faim -= 15;
	}
	public int toilettage() {
		if(toilette.equals("propre")) {
			return 1;
		}
		else if (toilette.equals("sale")) {
			return 2;
		}
		return 0;
	}
	public void sale() {
		bonheur -=5;
	}
	public void peche() {
		bonheur+=10;
		faim -= 5;
		poid-=5;
		repos = "repose";
	}

	public void faireSport() {
		faim-=10;
		bonheur+=5;
		poid-=10;
		toilette ="sale";
		repos ="fatigue";
	}

	public void tele() {
		poid+=10;
		bonheur+=5;
		repos = "fatigue";
	}
	public void jeu() {
		poid+=5;
		bonheur +=10;
		repos = "fatigue";
	}
	public void rename() {
		Scanner scanner = new Scanner(System.in);
		nom = scanner.nextLine();
		this.setNom(nom);
	}
	public void caresse() {
		bonheur+=15;
	}

	public int statusFaim(){
		if(faim <= 5 && faim >=-20) {
			return 1;
		}
		else if (faim < -19) {
			return 2;
		}
		return 0;
	}
	public int statusPoid() {
		if(poid<=10) {		
			return 1;
		}
		else if(poid>50) {
			return 2;
		}
		return 0;
	}	
	public void statusAge() {
		if(age>=10) {
			System.out.println(getNom()+" se fait vieux il va maintenant rejoindre les ancetres");
		}
	}

	public int formeBonheur() {		
		if(bonheur>=5 && bonheur<=10) {
			return 1;
		}
		else if (bonheur<=5) {

			return 2;
		}
		return 0;
	}
	public int formeRepos() {
		if(repos.equals("fatigue")) {
			return 1;
		}
		return 0;
	}
	public void statusForme() {
		statusAge();
		statusFaim();
		statusPoid();
		formeBonheur();
		formeRepos();
		toilettage();
	}
	public void mortFaim() {
		if(faim<-20) {
			System.out.println(getNom()+" est mort de faim! VOUS etes un monstre");
		}
	}
	public void mortPoid() {
		if(poid<10) {
			System.out.println(getNom()+" est mort de mal nutrition ! Quelle horreur");
		}
	}
	public void mortBonheur() {
		if(bonheur==-10) {
			System.out.println(getNom()+" est mort de depression agravée !\nUn drame tout etais noir chez lui la police conclu a un sucide");
		}
	}
	public void mortRepos() {
		if(repos.equals("trop fatigue")) {
			System.out.println(getNom()+" est mort d'epuisement!");
		}

	}
}

