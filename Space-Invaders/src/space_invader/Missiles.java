package space_invader;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Missiles extends JLabel {
	private JLabel lblMissile;
	private int posX=500;
	private int posY=500;
	private int deplacement=1;
	public Missiles(Vaisseaux vaisseau) {
		this.lblMissile=new JLabel("coucou");
		lblMissile.setBackground(Color.red);
		lblMissile.setBounds(vaisseau.getX(), vaisseau.getY(), 20, 20);
		this.posX=vaisseau.getX();
	}
	public JLabel getLblMissile() {
		return lblMissile;
	}
	public void setLblMissile(JLabel lblMissile) {
		this.lblMissile = lblMissile;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getDeplacement() {
		return deplacement;
	}
	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}
	public void affichage() {
		lblMissile.setVisible(true);
	}
	public void seDeplacer() {
		System.out.println(posY);
		lblMissile.setBounds(posX, posY-=deplacement, 64, 64);

	}
}
