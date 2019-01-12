package train;

public class Train {
	public int vitesse;
	String etat;
	
	public void accelere(int newVitesse) {
		etat = "En marche";
		if (vitesse+newVitesse <101) {
			vitesse = vitesse+newVitesse;
			
		}
		else {
			vitesse = 100;
			
		}
		
	}
	
	public void deceleration(int x) {
		if(vitesse-x > -1) {
			vitesse = vitesse-x;
		}
		else {
			System.out.println("Vous ne pouvez pas decelerer autant");
		}
	}
	
	public int stop() {
		etat = "Arrêt";
		return vitesse = 0;
	}
	
	public Train() {
		
	}


}
