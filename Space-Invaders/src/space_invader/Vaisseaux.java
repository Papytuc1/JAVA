package space_invader;

import javax.swing.JLabel;

public class Vaisseaux extends JLabel{
	private int x = 400-32;
	private int y = 500;
	private int pdv=100;
	private JLabel lblVaisseau;
	private int vitesseDeplacement =10;
	public Vaisseaux(JLabel pLbl) {
		this.lblVaisseau = pLbl;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setPdv(int pdv) {
		this.pdv = pdv;
	}
	public int getPdv() {
		return pdv;
	}
	public int getVitesseDeplacement() {
		return vitesseDeplacement;
	}
	public void setVitesseDeplacement(int vitesseDeplacement) {
		this.vitesseDeplacement = vitesseDeplacement;
	}
	public void seDeplacerGauche() {
		lblVaisseau.setBounds(x+=vitesseDeplacement, y, 64, 64);
		
	}
	public void seDeplacerDroite() {
		lblVaisseau.setBounds(x-=vitesseDeplacement, y, 64, 64);
	}
	public Missiles tirer() {
		Missiles missiles = new Missiles(this);
		return missiles;
	}
	
}
