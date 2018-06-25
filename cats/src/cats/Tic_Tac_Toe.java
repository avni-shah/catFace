package cats;

import java.util.ArrayList;
import java.util.Scanner;

public class Tic_Tac_Toe {
	
	
	public static int[][] board;
	
	public static boolean turn;
	
	public static String winner;

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		board = new int [3] [3];
		turn = true;
		System.out.println("Welcome to Tic Tac Toe, the mobile gaming platform where you can challenge your friends (and foes) to a battle using the most epic game ever!  This is Tic Tac Toe!");
		print();
		while (winner == null) {
			int input = in.nextInt();
			convert(input);
			print();
		}
		
	}
	
	public static void convert(int input) {
		
		input--;
		if (turn == true) { // player 1's turn
			if (board [input/3][input % 3] == 0) {
				board [input/3] [input % 3] = 1;
				
			}
			else {
				System.out.println("Sucks for you! Someone is faster. Better find another spot! haahahahahahahahahahah!");
			}
			turn = false;
		}
		
		else {
			if (board [input/3][input % 3] == 0) {
				board [input/3] [input % 3] = 2;
				
			}
			else {
				System.out.println("Sucks for you! Someone is faster. Better find another spot! haahahahahahahahahahah!");
			}
			turn = true;
		}
		
		

	}
	
	public static void print() {
		
		for ( int i = 0; i<3; i++) {
			for (int y = 0; y<3; y++) {
				System.out.print(board[i][y]);
			}
			
			System.out.println("");
			
			
		}


		
		
		
		
		

	}
}
