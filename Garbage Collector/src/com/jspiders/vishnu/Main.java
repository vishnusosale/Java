package com.jspiders.vishnu;

public class Main {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		System.out.println("K = " +d1.k);
		
		d1.show();
		
		d1 = null;
		
		System.gc();
		
		//d1.k; Cannot compile
		
	}

}
