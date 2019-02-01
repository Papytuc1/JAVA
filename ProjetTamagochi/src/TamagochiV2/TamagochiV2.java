package TamagochiV2;

import java.util.Scanner;

import javafx.scene.layout.ConstraintsBase;

public class TamagochiV2 {
	Scanner scanner = new Scanner(System.in);
	private static int age = 0;
	private int bonheur = 2;
	private int poid = 2;
	private int faim = 0;
	private String sexe ="";
	private String nom ="";
	private int repos =1;
	private int toilette = 2;
	/* Getteur/Setteur*/
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
		TamagochiV2.age = age;
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

	public int getToilette() {
		return toilette;
	}

	private void setToilette(int toilette) {
		this.toilette = toilette;
	}

	public int getRepos() {
		return repos;
	}

	private void setRepos(int repos) {
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
	/*
	 * methode qui decremente la faim,le repos,le bonheur,la proprete
	 * et qui incremente le poid et l'age
	 */
	public void age() {
		faim--;
		repos--;
		bonheur--;
		toilette--;
		poid++;
		age++;
	}
	/**
	 * methode qui decrement la faim et la propreter
	 * increment le repos
	 */
	public void dormir() {
		faim --;
		repos++;
		toilette--;
	}
	/*
	 * methode qui increment le poid et la faim
	 */
	public void nourir() {
		faim ++;
		poid++;
	}
	/*
	 * methode qui decrement la faim
	 */
	public void faim() {
		faim --;
	}
	/*
	 * methode qui decrement le bonheur
	 */
	public void sale() {
		bonheur --;
	}
	/*
	 * methode qui incremente le bonheur, et le repos
	 * decrement la faim et le poid
	 */
	public void peche() {
		phrasePeche();
		bonheur++;
		faim --;
		poid--;
		repos++;
	}
	/*
	 * methode qui decrement la faim, poid et proprete
	 * increment le bonheur et le repos
	 */
	public void faireSport() {
		phraseSport();
		faim--;
		bonheur++;
		poid--;
		toilette--;
		repos++;
	}
	/*
	 * methode qui decrement la proprete
	 */
	public void laver() {
		toilette--;
	}
	/*
	 * methode qui increment le poid et le bonheur
	 * decrement le repos
	 */
	public void tele() {
		phraseTele();
		poid++;
		bonheur++;
		repos--;
	}
	/*
	 * methode qui increment le poid le bonheur et le repos
	 */
	public void jeu() {
		phraseJeu();
		poid++;
		bonheur ++;
		repos++;
	}
	/*
	 * methode qui increment le bonheur
	 */
	public void caresse() {
		phraseCaresse();
		bonheur++;
	}
	
	/*
	 * methode pour renomer son tamagochi
	 */
	public void rename() {
		nom = scanner.nextLine();
		this.setNom(nom);
	}

	/*
	 * methode qui permet de check le bonheur et de retourner une phrase en conséquence
	 */
	public void statusBonheur(){
		switch(bonheur) {
		case -3: case -4 :
			System.err.println("la je suis en totale depression, si ca continue je vais faire une connerie");
			break;
		case 0  : case -1 : case -2:
			System.out.println("Je suis tres triste");
			break;
		case 1: case 2:
			System.out.println("Je vais plutot bien");
			break;
		case 3: case 4:
			System.out.println("Je vais super bien");
			break;
		case 5:
			System.err.println("Je pete la forme, si ca continue je vais plus me sentir");
			break;
		default:System.err.println("error bonheur");
		break;
		}
	}
	/*
	 * methode qui permet de check le poid et de retourner une phrase en conséquence
	 */
	public void statusPoid() {
		switch(poid) {
		case -3 : case -4:
			System.err.println("Ma tête tourne je vais flancher");
			break;
		case 0 : case-1: case -2:
			System.out.println("Je suis super maigre je me sent pas bien");
			break;
		case 1: case 2:
			System.out.println("je suis maigrichon mais ça va");
			break;
		case 3 : case 4:
			System.out.println("Je me sens en forme");
			break;
		case 5:
			System.err.println("Je suis un peux gros il me faudrais une activitées");
			break;
		default : System.err.println("error poid");
		break;
		}
	}	
	/*
	 * methode qui permet de check la faim et de retourner une phrase en conséquence
	 */
	public void statusFaim() {		
		switch(faim) {
		case -3 : case -4 :
			System.err.println("NOURISSEZ MOIIII !!! NOURISSEZ MOIIII !!!");
			break;
		case 0 : case -1: case -2 :
			System.out.println("J'ai trés faim!");
			break;
		case 1: case 2:
			System.out.println("Je sent mon ventre gargouiller mais ca peux aller");
			break;
		case 3: case 4:
			System.out.println("Je sens mon ventre bien plein, NIQUEL");
			break;
		case 5:
			System.err.println("Je commence a beaucoup trop manger je crain le pire");
			break;
		default : System.err.println("error faim");	
		break;
		}
	}
	/*
	 * methode qui permet de check le repos et de retourner une phrase en conséquence
	 */
	public void statusRepos() {
		switch (repos) {
		case 0:
			System.err.println("Je suis tellement epuise que j'ai des hallucination");
		case 1:
			System.out.println("Je suis epuise");
			break;
		case 2 :
			System.out.println("Je me sent en pleinne forme");
			break;
		default : System.out.println("Je suis super repose");
		break;
		}
	}
	/*
	 * methode qui permet de check la proprete et de retourner une phrase en conséquence
	 */
	public void statusToilettage() {
		switch (toilette) {

		case 1:
			System.out.println("Je suis tout degeulasse aled");
			break;
		case 2:
			System.out.println("Grouuu je suis tout propre");
			break;
		case 3 :
			System.out.println("C'est bon je crois que je brille maintenant");
			break;
		default: System.err.println("JE BRILLE LA OK");
		break;
		}
	}
	/**
	 * methode qui regroupe les methodes de statusFaim,Poid,Bonheur,repos et toilettage
	 * elle permet de toute les lance en une fonction, et donc evite de toutes les 
	 * appeler dans le main
	 */
	public void checkStatus() {
		statusFaim();
		statusPoid();
		statusBonheur();
		statusRepos();
		statusToilettage();
	}
	/*
	 * methode qui check la mort selon l'age et retourne une phrase en consequence
	 * et qui prend en parametre un boolean
	 */
	public boolean mortAge(boolean mort){
		if(age>10) {
			System.out.println(getNom()+" est partit rejoindre les ancetres");
			return mort=true;
		}
		else {
			return mort=false;
		}
	}
	/*
	 * methode qui check la mort selon la faim et retourne une phrase en consequence
	 * et qui prend en parametre un boolean
	 */
	public boolean mortFaim(boolean mort) {
		if(faim == -5) {
			System.err.println(getNom()+" est mort de faim ! VOUS etes un MONSTRE");
			return mort=true;
		}
		else if(faim >5) {
			System.err.println(getNom()+" s'est etouffé en mangeant trop, il est mort seul devant sa gamelle");
			return mort=true;
		}
		else {
			return mort=false;
		}
	}
	/*
	 * methode qui check la mort selon le poid et retourne une phrase en consequence
	 * et qui prend en parametre un boolean
	 */
	public boolean mortPoid(boolean mort) {
		if(poid == -5) {
			System.err.println(getNom()+" est mort de mal nutrition, quelle tristesse");
			return mort=true;
		}
		else if(poid>5) {
			System.err.println(getNom()+" est mort suite a une oésité morbide! HORIBLE");
			return mort = true;
		}
		else {
			return mort=false;
		}
	}
	/*
	 * methode qui check la mort selon le bonheur et retourne une phrase en consequence
	 * et qui prend en parametre un boolean
	 */
	public boolean mortBonheur(boolean mort) {
		if(bonheur == -5) {
			System.err.println(getNom()+" est mort de depression agravée !\nUn drame tout etais noir chez lui la police conclu a un sucide");
			return mort=true;
		}
		else if(bonheur>5) {
			System.err.println(getNom()+" est mort, il etait tellement content qu'il n'a pas regarder en traversant et s'est fait percute");
			return mort = true;
		}
		else {
			return mort=false;
		}
	}
	/*
	 * methode qui check la mort selon la fatigue et retourne une phrase en consequence
	 * et qui prend en parametre un boolean
	 */
	public boolean mortRepos(boolean mort) {
		if(repos == -1) {
			System.out.println(getNom()+" est mort d'epuisement");
			return mort=true;
		}
		else {
			return mort=false;
		}
	}
	/*
	 * methode qui regroupe toute les methodes de mort et retourne un boolean true si on rentre
	 * dans une des conditions de mort
	 */
	public boolean checkMort(boolean mort) {
		if(mortFaim(mort) == true||mortBonheur(mort)== true||mortPoid(mort)==true||mortRepos(mort)==true|| mortAge(mort)== true ) {
			mort=true;
		}
		return mort;
	}
	/*
	 * methode qui permet de laisser le choix a l'utilisateur une activitees 
	 * quand le mot correspond la methode lance la methode associe
	 */
	public void activitees() {
		System.out.println("Choix possible : laver , manger , peche, sport, tele, jeu, caresse");
		switch(scanner.nextLine().toLowerCase()) {
		case "laver" :
			laver();
			break;
		case "manger":
			nourir();
			break;
		case "peche" : 
			peche();
			break;
		case "sport" :
			faireSport();
			break;
		case "tele" :
			tele();
			break;
		case "jeu":
			jeu();
			break;
		case "caresse":
			caresse();
			break;
		default : System.out.println(getNom()+" n'a pas compris ce qu'il devait faire, recomencez ");
		break;
		}
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour la peche
	 */
	public void phrasePeche(){
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			System.out.println("Yeah je vais a la peche a la truite je suis super content");
			break;
		case 1:
			System.out.println("Oh tiens je vais aller a la peche au gros, la mer ca me connais");
			break;
		case 2 :
			System.out.println("Hey Aujourd'hui je vais a la pisciculture !!!");
			break;
			default : System.err.println("error phrasePeche");
			break;
		}
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour le sport
	 */
	public void phraseSport(){
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			System.out.println("Oh cool je vais aller a la salle today");
			break;
		case 1:
			System.out.println("Ok je file sur le tapis de course");
			break;
		case 2 :
			System.out.println("Bon ok je vais me forcer j'avais pas trop envie mais pour toi je le fais!!!");
			break;
			default : System.err.println("error phraseSport");
			break;
		}
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour les caresses
	 */
	public void phraseCaresse(){
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			System.out.println(getNom()+"ronrone tres fort");
			break;
		case 1:
			System.out.println(getNom()+" est super content");
			break;
		case 2 :
			System.out.println("grrr rou rou");
			break;
			default : System.err.println("error phraseCaresse");
			break;
		}
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour les caresses
	 */
	public void phraseJeu(){
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			System.out.println("Yeah je vais m'eclater sur Ark");
			break;
		case 1:
			System.out.println("Super je vais jouer avec un pote a factorio");
			break;
		case 2 :
			System.out.println("Bon ok cette foi je bat ma pote sur just dance");
			break;
			default : System.err.println("error phraseJeu");
			break;
		}
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour la tele
	 */
	public void phraseTele(){
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			System.out.println("dac je vais aller mater un doc sur nat geo wild");
			break;
		case 1:
			System.out.println("Okay je vais me mettre le seigneur des anneaux version longue tranquilou");
			break;
		case 2 :
			System.out.println("dac je vais mater le hobbit cette foi tiens !!");
			break;
			default : System.err.println("error phraseTele");
			break;
		}
	}
}
