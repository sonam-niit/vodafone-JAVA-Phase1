package com.simplilearn.unckeckedexception;

public class DemoException5 {

	public static void main(String[] args) {
		
		int sum=0;
		
		try {
			for(int i=0;i<args.length;i++)
			{
				sum=sum+(Integer.parseInt(args[i]));
			}
			
			System.out.println("Sum is "+sum);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception "+e.getMessage());
			e.printStackTrace();
		}
	}
}
