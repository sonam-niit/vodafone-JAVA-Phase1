package com.simplilearn.checkedexception;

import java.util.Scanner;

public class TestCustomExecption {

	public static void testEmail(String email) throws NotAValidEmailException
	{
		if(!email.contains("@"))
		{
			throw new NotAValidEmailException("Email not valid");
		}
		else {
			System.out.println("Welcome "+email);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String email=sc.next();
		try {
			TestCustomExecption.testEmail(email);
		}
		catch(NotAValidEmailException e)
		{
			System.out.println("Exception occure "+e.getMessage());
		}
		
	}
}
