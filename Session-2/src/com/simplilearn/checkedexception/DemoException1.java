package com.simplilearn.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoException1 {

	public static void main(String[] args) {
		
		File file=new File("test.txt");
		//checked Exception
		try {
			FileInputStream stream= new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error "+e.getMessage());
			e.printStackTrace();
		}
	}
}
