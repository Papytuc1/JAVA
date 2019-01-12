package user;


public class ApplicationClassA {

	public static void main(String[] args) {
		// classA et une référence qui pointe vers ClassA
		ClassA classA= new ClassA();// j'instancie la classe ClassA en utilisant le constructeur par default
		String color= classA.color;
		color = "jaune";// je modifie pas la valeur de l'objet mais la variable
		System.out.println(color);/* classA.color renvoie null car je change 
		la couleur dans le main et cela renvoi a la class*/
		
		ClassA classB = new ClassA();
		classB.color = "rouge";
		
		/* ici ma ref classC = classB ils sont identique*/
		ClassA classC= classB;
		classC.color= "bleu";
		System.out.println(classC.color);
		
		int nbRouesMotrice = ClassA.nbRouesMotrice;
		System.out.println(nbRouesMotrice);// j'accede à une variable de classe
		ClassA.nbRouesMotrice = 4;// je vais chercher la variable dans la classA et je lui met 4 je la modifie
		System.out.println(ClassA.nbRouesMotrice);
		
		System.out.println(classB.nbRouesMotrice);// j'accede a une variable de classe via un objet
        classA.nbRouesMotrice=8;// je modifie la variable de classe via un objet
        System.out.println(classC.nbRouesMotrice);// on accede a une valuer de classe via un autre objet
        
        
	}

}
