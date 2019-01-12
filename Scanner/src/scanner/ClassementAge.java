package scanner;


import java.util.Scanner;

public class ClassementAge {

	public static void main(String[] args) {   /* scope parent au dessus des autres donc les 
		                                       variables entrée sont prise partout**/
		    Scanner sc = new Scanner(System.in);
		    int x = 0;
		    int y = 0;
            for(int i=0; i < 20; i++) {
			System.out.println("Saisir votre age");
			int age = sc.nextInt();
			System.out.println("Votre age :" + age);		 
			
			 if (age <= 20) {
					x++;

			}
				else {
					y++;
					
				}
      }
            System.out.println("Il y'a "+x+ " de moins de vingt ans et "+y+" de plus de ving ans" );
}
}