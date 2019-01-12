package user;

public class Computer {
	static int valeurIni = 10;
	
	public int getValeurIni(){
		return valeurIni;
	}
	public int add(int a) {
		return a+valeurIni;
	}
	public int factor(int b) {
		return b*valeurIni;
	}
	public int divide(int c) {
		return c/valeurIni;
	}

}
