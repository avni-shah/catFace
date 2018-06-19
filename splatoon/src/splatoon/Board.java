package splatoon;

import java.util.ArrayList;

public class Board {
	
	int w;
	int l;
	
	public Board (int w, int l) {
		this.w = w;
		this.l = l;
	}
	
	public void visibleBoard (int w, int l) {
		
	}
	
	public ArrayList <Integer> getDimention () {
		
		ArrayList <Integer> dimention = new ArrayList <Integer>();
		
		dimention.add(w);
		dimention.add(l);
		return dimention;
	}
}
