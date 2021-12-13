package com.simplilearn.unckeckedexception;

import java.util.Scanner;

//checked Exception
public class DemoException {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		String x=null;
		try 
		{
			int c= a/b;
			System.out.println("The divison is "+c);
			
			System.out.println("Value converted into lower case "+ x.toLowerCase());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occure "+e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Occure "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Any other error "+e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Connection Closed");
		}
	}

}
