package train;

import java.util.Scanner;

public class TrainGare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Train train = new Train();
		train.vitesse = 0;
		int b;
		boolean marcheArret= true;
		
		System.out.println("Attention train sur le départ");
		System.out.println("On accelére ");
		train.accelere(10);
		System.out.println(train.vitesse);
		train.accelere(20);
		System.out.println(train.vitesse);
		train.accelere(30);
		System.out.println(train.vitesse);
		train.accelere(50);
		System.out.println(train.vitesse);
		System.out.println("le train rencontre une obstacle");
		train.stop();
		System.out.println(train.vitesse);
		System.out.println("le train réaccelere");
		train.accelere(10);
		System.out.println(train.vitesse);
		train.accelere(20);
		System.out.println(train.vitesse);
		train.accelere(30);
		System.out.println(train.vitesse);
		train.accelere(50);
		System.out.println(train.vitesse);
		System.out.println("le train ce met a décelérrer");
		train.deceleration(10);
		System.out.println(train.vitesse);
		train.deceleration(30);
		System.out.println(train.vitesse);
		train.deceleration(60);
		System.out.println(train.vitesse);
		System.out.println("Le train est à l'arrêt vous pouvez decendre");

}
}
