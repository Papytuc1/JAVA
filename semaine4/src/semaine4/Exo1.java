package semaine4;
// petit test
public class Exo1 {
/* args est un argument, pour exectuer ce code je dois run mon code avec run configuration>arguments
 * et lui passer des argument comme 3 et 4, args[0] seras donc 3*/
	public static void main(String[] args) {
		try {
		int cast1 = Integer.parseInt(args[0]);/* ici je cast ma string args dans un int
si le string est un chiffre ca passe sinon j'ai une erreur qui seras géré par try/catch**/
		int cast2 = Integer.parseInt(args[1]);
		int sum = cast1+cast2;
		System.out.println("la somme de vos deux chiffres est : "+sum);
		}
		catch (Exception e) {
			System.err.println("Vous n'avez pas entrez de chiffre");
		}

}
}
