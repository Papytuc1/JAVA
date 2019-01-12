package constructeur;/* on instancie avec un constructeur on la declare 
sans retour  et on lui donne le même nom que la classe (pas de void pas de type)*/

public class Avion {
	int taille = 100; // caractéristique de l'avion (variables)
	int place = 60;
	public void voler() {// fonctionalité de l'avion (méthode)
		System.out.println("l'avion vole");
	}
	public Avion() {/* fonction constructeur permet de passer les carac et 
		fonctionalitées dans le main pour les utiliser*/
	}

}
