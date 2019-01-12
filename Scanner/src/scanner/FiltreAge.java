package scanner;

import java.util.Scanner;



public class FiltreAge {
		public static void main(String[] args) {   /* scope parent au dessus des autres donc les 
                                                     variables entrée sont prise partout**/
                 Scanner sc = new Scanner(System.in);
                 int x = 0;
                 int y = 0;
                 int out = 0;
                 for(int i=0; i < 20; i++) {
                 System.out.println("Saisir votre age");
                 int age = sc.nextInt();
                 System.out.println("Votre age :" + age);		 

                 if (age <= 20) {
                      x++;
                      }
                 if(age >= 40) {
                       y++;
                       }
                 if(age<=20 || age <=40) {
                	 out++;
                 }
                 if (age>=100) {
                	 System.out.println("Erreur recommencer");
                	 break;
                 }
                 else {
                	 
                 }
}
                System.out.println("Il y'a "+x+ " de moins de vingt ans et "+y+" de plus de "
                		+ "quarante ans et" +out+ " entre 20 et 40 ans" );
}
}
