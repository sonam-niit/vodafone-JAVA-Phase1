package com.simplilearn.checkedexception;

public class NotAValidEmailException extends Exception{

	
	public NotAValidEmailException(String s)
	{
		super(s);
	}
}
