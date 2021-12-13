package com.simplilearn.checkedexception;

public class DemoException2 {

	public static void main(String[] args) {
		
		Thread thread=new Thread();
		
		try {
			thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Error "+e.getMessage());
		}
		
	}
}
