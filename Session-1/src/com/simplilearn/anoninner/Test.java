package com.simplilearn.anoninner;

public class Test {

	public static void main(String[] args) {
		
		Display d= new Display() {
			
			@Override
			public void print() {
				System.out.println("display callled");
				
			}
		};
		
		d.print();

	}

}
