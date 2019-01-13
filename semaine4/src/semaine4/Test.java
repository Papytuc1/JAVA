package semaine4;

import java.util.Scanner;

public class Test {
	  public static long facto(long i) {
	        if(i == 0 || i == 1)
	        {
	            return 1;
	        }
	            return i*facto(i-1);
	        
	        
	        
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int i = sc.nextInt();
	        System.out.println("le facto de " +i+ " est "+ facto(i));
	        
	    
	        sc.close();
	    }

	}