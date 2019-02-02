package tamagochiSwing;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TamagochiV3 {
	Scanner scanner = new Scanner(System.in);
	private static int age = 0;
	private int bonheur = 2;
	private int poid = 2;
	private int faim = 0;
	private String sexe ="";
	private String nom ="Regis";
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
		TamagochiV3.age = age;
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
		poid++;
		bonheur++;
		repos--;
	}
	/*
	 * methode qui increment le poid le bonheur et le repos
	 */
	public void jeu() {
		poid++;
		bonheur ++;
		repos++;
	}
	/*
	 * methode qui increment le bonheur
	 */
	public void caresse() {
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
	public String statusBonheur(){
		String statusBonheur ="";
		switch(bonheur) {
		case -3: case -4 :
			statusBonheur ="la je suis en totale depression, si ca continue je vais faire une connerie";
			break;
		case 0  : case -1 : case -2:
			statusBonheur ="Je suis tres triste";
			break;
		case 1: case 2:
			statusBonheur ="Je vais plutot bien";
			break;
		case 3: case 4:
			statusBonheur ="Je vais super bien";
			break;
		case 5:
			statusBonheur ="Je pete la forme, si ca continue je vais plus me sentir";
			break;
		default:statusBonheur ="error bonheur";
		break;
		}
		return statusBonheur;
	}
	/*
	 * methode qui permet de check le poid et de retourner une phrase en conséquence
	 */
	public String statusPoid() {
		String statusPoid ="";
		switch(poid) {
		case -3 : case -4:
			statusPoid = "Ma tête tourne je vais flancher";
			break;
		case 0 : case-1: case -2:
			statusPoid= "Je suis super maigre je me sent pas bien";
			break;
		case 1: case 2:
			statusPoid= "je suis maigrichon mais ca va";
			break;
		case 3 : case 4:
			statusPoid= "Je me sens en forme";
			break;
		case 5:
			statusPoid = "Je suis un peux gros il me faudrais une activitees";
			break;
		default : statusPoid = "error poid";
		break;
		}
		return statusPoid;
	}	
	/*
	 * methode qui permet de check la faim et de retourner une phrase en conséquence
	 */
	public String statusFaim() {	
		String statusFaim ="";
		switch(faim) {
		case -3 : case -4 :
			statusFaim ="NOURISSEZ MOIIII !!! NOURISSEZ MOIIII !!!";
			break;
		case 0 : case -1: case -2 :
			statusFaim ="J'ai tres faim!";
			break;
		case 1: case 2:
			statusFaim ="Je sent mon ventre gargouiller mais ca peux aller";
			break;
		case 3: case 4:
			statusFaim ="Je sens mon ventre bien plein, NIQUEL";
			break;
		case 5:
			statusFaim ="Je commence a beaucoup trop manger je crain le pire";
			break;
		default : statusFaim ="error faim";	
		break;
		}
		return statusFaim ;
	}
	/*
	 * methode qui permet de check le repos et de retourner une phrase en conséquence
	 */
	public String statusRepos() {
		String statusRepos ="";
		switch (repos) {
		case 0:
			statusRepos ="Je suis tellement epuise que j'ai des hallucination";
		case 1:
			statusRepos ="Je suis epuise";
			break;
		case 2 :
			statusRepos ="Je me sent en pleinne forme";
			break;
		default : statusRepos ="Je suis super repose";
		break;
		}
		return statusRepos ;
	}
	/*
	 * methode qui permet de check la proprete et de retourner une phrase en conséquence
	 */
	public String statusToilettage() {
		String statusToilettage ="";
		switch (toilette) {

		case 1:
			statusToilettage ="Je suis tout degeulasse aled";
			break;
		case 2:
			statusToilettage ="Grouuu je suis tout propre";
			break;
		case 3 :
			statusToilettage ="C'est bon je crois que je brille maintenant";
			break;
		default:
		break;
		}
		return statusToilettage ;
	}
	/**
	 * methode qui regroupe les methodes de statusFaim,Poid,Bonheur,repos et toilettage
	 * elle permet de toute les lance en une fonction, et donc evite de toutes les 
	 * appeler dans le main
	 */
	public String checkStatus() {
		return statusFaim()+", "+statusPoid()+", "+statusBonheur()+"\n"+statusRepos()+", "+statusToilettage();
	}
	/*
	 * methode qui check la mort selon l'age et retourne une phrase en consequence
	 */
	public boolean mortAge(){
		if(age>10) {
			JOptionPane.showMessageDialog(null, getNom()+" est partit rejoindre les ancetres");
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * methode qui check la mort selon la faim et retourne une phrase en consequence
	 */
	public boolean mortFaim() {
		String mortFaim="";
		if(faim == -5) {
			JOptionPane.showMessageDialog(null, getNom()+" est mort de faim ! VOUS etes un MONSTRE");
			return true;
		}
		else if(faim >5) {
			JOptionPane.showMessageDialog(null,getNom()+" s'est etouffe en mangeant trop, il est mort seul devant sa gamelle");
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * methode qui check la mort selon le poid et retourne une phrase en consequence
	 */
	public boolean mortPoid() {
		
		if(poid == -5) {
			JOptionPane.showMessageDialog(null,getNom()+" est mort de mal nutrition, quelle tristesse");
			return true;
		}
		else if(poid>5) {
			JOptionPane.showMessageDialog(null, getNom()+" est mort suite a une obesite morbide! HORIBLE");
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * methode qui check la mort selon le bonheur et retourne une phrase en consequence 
	 */
	public boolean mortBonheur() {
		if(bonheur == -5) {
			JOptionPane.showMessageDialog(null,getNom()+" est mort de depression agravees !\nUn drame tout etais noir chez lui la police conclu a un sucide");
			return true;
		}
		else if(bonheur>5) {
			JOptionPane.showMessageDialog(null,getNom()+" est mort, il etait tellement content qu'il n'a pas regarder en traversant et s'est fait percute");
			return  true;
		}
		else {
			return false;
		}
	}
	/*
	 * methode qui check la mort selon la fatigue et retourne une phrase en consequence 
	 */
	public boolean mortRepos() {
		if(repos == -1) {
			JOptionPane.showMessageDialog(null,getNom()+" est mort d'epuisement");
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * methode qui regroupe toute les methodes de mort et retourne un boolean true si on rentre
	 */
	public boolean checkMort() {
		boolean mort = false;
		if(mortFaim() == true||mortBonheur()== true||mortPoid()==true||mortRepos()==true|| mortAge()== true ) {
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
	public String phrasePeche(){
		String phrasePeche="";
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			phrasePeche="Yeah je vais a la peche a la truite je suis super content";
			break;
		case 1:
			phrasePeche="Oh tiens je vais aller a la peche au gros, la mer ca me connais";
			break;
		case 2 :
			phrasePeche="Hey Aujourd'hui je vais a la pisciculture !!!";
			break;
			default : phrasePeche="error phrasePeche";
			break;
		}
		return phrasePeche;
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour le sport
	 */
	public String phraseSport(){
		String phraseSport="";
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			phraseSport="Oh cool je vais aller a la salle today";
			break;
		case 1:
			phraseSport="Ok je file sur le tapis de course";
			break;
		case 2 :
			phraseSport="Bon ok je vais me forcer j'avais pas trop envie mais pour toi je le fais!!!";
			break;
			default : phraseSport="error phraseSport";
			break;
		}
		return phraseSport;
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour les caresses
	 */
	public String phraseCaresse(){
		String phraseCaresse = "";
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			phraseCaresse =getNom()+"ronrone tres fort";
			break;
		case 1:
			phraseCaresse =getNom()+" est super content";
			break;
		case 2 :
			phraseCaresse ="grrr rou rou";
			break;
			default : phraseCaresse ="error phraseCaresse";
			break;
		}
		return phraseCaresse ;
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour les caresses
	 */
	public String phraseJeu(){
		String phraseJeu ="";
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			phraseJeu ="Yeah je vais m'eclater sur Ark";
			break;
		case 1:
			phraseJeu ="Super je vais jouer avec un pote a factorio";
			break;
		case 2 :
			phraseJeu ="Bon ok cette foi je bat ma pote sur just dance";
			break;
			default :phraseJeu ="error phraseJeu";
			break;
		}
		return phraseJeu ;
	}
	/*
	 * methode qui permet de choisir aleatoirement une phrase pour la tele
	 */
	public String phraseTele(){
		String phraseTele= "";
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			phraseTele="dac je vais aller mater un doc sur nat geo wild";
			break;
		case 1:
			phraseTele="Okay je vais me mettre le seigneur des anneaux version longue tranquilou";
			break;
		case 2 :
			phraseTele="dac je vais mater le hobbit cette foi tiens !!";
			break;
			default : phraseTele="error phraseTele";
			break;
		}
		return phraseTele;
	}
	public String phraseManger(){
		String phraseManger= "";
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			phraseManger="Cool aujourd hui je me fait un bon burger";
			break;
		case 1:
			phraseManger="La je vais me manger une bonne salade norvegienne avec du saumon c'est super !!!";
			break;
		case 2 :
			phraseManger="Aller hop une bonne tartiflette dans le gosier";
			break;
			default : phraseManger="error phraseManger";
			break;
		}
		return phraseManger;
	}
	
	public String phraseLaver(){
		String phraseLaver= "";
		int random = (int)(Math.random()*3);
		switch(random) {
		case 0:
			phraseLaver="Chante sous la douche";
			break;
		case 1:
			phraseLaver="GLOU GLOU GLOU je fais des bulles dans mon bain";
			break;
		case 2 :
			phraseLaver="Et plouf direct dans mon bain bien chaud comme ca je vais �tre tout propres !!!";
			break;
			default : phraseLaver="error phraseLaver";
			break;
		}
		return phraseLaver;
	}
}
