package Tableaux;


public class Exo22 {

	public static void main(String[] args) {
		String asterix = "*";
		int count = 60;
		for (int i = 0; i< count ; i++) {
			System.out.print(asterix);
			
		}// ici j'appel mes methode
		System.out.println();
		asterix2();
		System.out.println("**                      BIENVENUE                         **");
		asterix2();
		asterix3();
	}

	public static String asterix2() {//je crée une methode et en dessous j'en cree d'autre 
		String asterix2 = "**";	
		String espace ="**                                                        **";
		System.out.println(espace);
		return asterix2;
	}
	public static String asterix3() {
		String asterix = "*";
		int count = 60;
		for (int i = 0; i< count ; i++) {
			System.out.print(asterix);
	}
		return asterix;
}
	
	
}
