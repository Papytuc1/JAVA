package Exo1;

import java.util.ArrayList;

public class Parking {
	private static ArrayList<String> stock = new ArrayList<String>();

	public static ArrayList<String> getStock() {
		return stock;
	}

	public static void setStock(ArrayList<String> stock) {
		Parking.stock = stock;
	}
	
	public ArrayList<String> addParking(String voitures){
		stock.add(voitures);
		return stock;
	}
}
