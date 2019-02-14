package warrior;


public abstract class Avatar extends Humain{	
	private int vie;
	private int puissance;
	private int magie;
	private int vieMax;
	private float gold =100;
	int potion=2;
	private boolean mort = false;
	
	public Avatar(String nom) {
		super(nom);
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getMagie() {
		return magie;
	}

	public void setMagie(int magie) {
		this.magie = magie;
	}

	public float getGold() {
		return gold;
	}

	public void setGold(float gold) {
		this.gold = gold;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}
	public void boireUnePotion() {
		System.out.println("glou glou");
		if(potion>0) {
		potion -=1;
		vie += 30;
		}
		else {
			System.out.println("vous n'avez plus de potions ");
		}
	}
	abstract public void attaquer(Avatar adversaire);
	/**
	 * fonction qui permet de pillier son adversaire
	 * @param adversaire
	 */
	public void pillage(Avatar adversaire) {
		this.setGold(adversaire.getGold()+this.gold);
		adversaire.setGold(0);
		System.out.println(adversaire.getNom()+" a perdu tous ses gold et "+this.getNom()+" a maintenant "+this.getGold());
	}

	public boolean isMort() {
		return mort;
	}

	private void setMort(boolean mort) {
		this.mort = mort;
	}

	public int getVieMax() {
		return vieMax;
	}

	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}
}
