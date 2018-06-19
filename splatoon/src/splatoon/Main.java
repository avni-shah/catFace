package splatoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Board stage = new Board(40, 11);
		Player p1 = new Player(0, 0);
		
		stage.visibleBoard(11,40);
		
		
		
		
		
		
		for (int x = 0; x < 11; x++) {
			System.out.println("****************************************");
		}

		int a = 0;
		int b = 0;
		
		int bobx = 0;
		int boby = 0;
		
		int joex = 0;
		int joey = 0;
		
		
		ArrayList jake = new ArrayList <String>();
		for (int x = 0; x<11; x++) {
			jake.add("****************************************");
		}
		
		
		
		while (a < 100 && b < 100) {
			
			for (int x = 0; x<11; x++) {
				System.out.println(jake.get(x));
			}
			
			jake.get(0);
		    Scanner scan= new Scanner(System.in);

		    //For string

		    String text= scan.next();

		    System.out.println(text);
		    
		    if (text == "w") {
		    	
		    	
		    	if (boby != 10) {
		    		boby++;
		    	}
		    	
		    	
		    }
		    
		    if (text == "a") {
		    	
		    	if (bobx != 0) {
		    		bobx--;
		    	}
		    	
		    }
		    
		    if (text == "s") {
		    	
		    	if (boby != 0) {
		    		boby--;
		    	}
		    	
		    }
		    
		    if (text == "d") {
		    	
		    	if (bobx != 39) {
		    		bobx++;
		    	}
		    	
		    }
		    
		    if (text == "i") {
		    	
		    	if (joey != 10) {
		    		joey++;
		    	}
		    	
		    }
		    
		    if (text == "j") {
		    	
		    	if (joex != 0) {
		    		joex--;
		    		
		    		
		    	}
		    	
		    }
		    
		    if (text == "k") {
		    	
		    	if (joey != 0) {
		    		joey--;
		    		
		    	}
		    	
		    	
		    }
		    
		    if (text == "l") {
		    
		    	if (joex != 39) {
		    		joex++;
		    	}
		    	
		    }
		    
			long start = System.currentTimeMillis();
	        
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
