package constructeur;

public class construction {
	public static void main (String[] args) {
		Avion un = new Avion();// on instancie un Avion
		un.voler();// on lui applique sa methode
		un = null;// on le detruit
		un.voler();// on ne peux plus l'utiliser
	}

}
