package com.simplilearn.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileModification {

	static void modifyFile(String filePath,String oldString,String newString)
	{
		File fileToBeModified= new File(filePath);
		String oldContent="";
		
		try(BufferedReader reader=new BufferedReader(new FileReader(fileToBeModified));
				FileWriter writer=new FileWriter(fileToBeModified)	)
		{
			
			String line=reader.readLine();
			System.out.println(line);
			while(line!=null);
			{
				oldContent=oldContent+line+System.lineSeparator();
				line=reader.readLine();
				System.out.println(line);
			}
			String newContent= oldContent.replaceAll(oldString, newString);
			
			writer.write(newContent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		modifyFile("F://DemoFile/testFile.txt", "78", "87");
		System.out.println("File Modified Successfully");
	}

}
