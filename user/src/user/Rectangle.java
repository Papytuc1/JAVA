package user;

import java.util.Scanner;

public class Rectangle {
	private int height;
	private int wide;
	
	public int getHauteur() {
		return height;
	}
	public int getLargeur() {
		return wide;
	}
	public void setHauteur(int newHauteur) {
		height=newHauteur;
		
	}
	public void setLargeur(int newLargeur) {
		wide = newLargeur;
	}
	
	public int aire() {
		return height*wide;
	}
	public int perimetre() {
		return (wide+height)*2;
	}

}
