package test;

import personne.*;


public class Application {

	public static void main(String[] args) {
		Professeur sabrina = new Professeur(3, "Pourcelot", "Sabrina", 2000, "Java JEE");
		Professeur pablo = new Professeur(3, "Brusset", "Pablo", 1800, "Math");
		Etudiant medhi = new Etudiant(2, "Druelle", "Medhi", 657890);
		Etudiant ioanna = new Etudiant(2, "Tsoukalas", "ioanna", 6789054);
		Employe kevin = new Employe(1, "San Martino", "Kevin", 5000);
		Employe thibault = new Employe(1, "Cougrand", "Thibault", 5000);
		System.out.println(sabrina.toString());
		System.out.println(pablo.toString());
		System.out.println(kevin.toString());
		System.out.println(thibault.toString());
		System.out.println(medhi.toString());
		System.out.println(ioanna.toString());
	}

}
