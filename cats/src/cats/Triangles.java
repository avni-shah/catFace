package cats;

public class Triangles {

	public static void printSquare(int sideLength) {
		String line = "";
		for (int l = 0; l<5; l++) {
			line = line + "*";
		}
		for (int s = 0; s<sideLength; s++) {
			System.out.println(line);
			
		}
	}
	
	public static void main(String [] args) {
		String string; 
		for (int i = 0; i < 5; i = i + 1) {
			string = "";
			for (int j = 0; j < i + 1; j++) {
				string += "*";
			}
			System.out.println('*');
			System.out.println("*0*");
			System.out.println("*****");
		}
		for (int x = 0; x<5; x++) {
			System.out.println("*****");
		}
//		while (true) {
//			
//		}
//		
//		do {
//			
//		} while (true);
//		"asd" + "fgh" = "asdfgh"
		
	}
}
