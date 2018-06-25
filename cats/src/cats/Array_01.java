package cats;

public class Array_01 {
		
	
	public static void main(String [] args) {
		Array_2d();
		print();
	}
	public static void print() {
		int[] boba = {1,2,3,4,5,6,7,8,9,0};
		for (int i = 0; i<10; i++) {
			System.out.println(boba[i]);
		}
	}
	public static void Array_2d() {
		int [][] bob = new int [15] [100];
		
		
		for (int i = 0; i<15; i++) {
			if (i % 2==1) {
				for (int j = 0; j<100; j++) {
					bob [i][j] = 9;	
				}
			}
		
		}
		
		
		
		
		
		
		
		
		for (int i = 0; i<15; i++) {
			for (int j = 0; j<100; j++) {
				System.out.print(bob[i][j]);
			}
			System.out.println("");
			System.out.println("");
			
		}
	}
	
}
