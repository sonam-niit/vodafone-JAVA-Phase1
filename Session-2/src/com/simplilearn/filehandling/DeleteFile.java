package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeleteFile {

	public static void main(String[] args) {

		try {
			Files.deleteIfExists(Paths.get("F://DemoFile/textFile3.txt"));
			
		} catch (NoSuchFileException e) {
			System.out.println("No such file or directory exist");
		}
		catch(DirectoryNotEmptyException e) {
			System.out.println("Directory not Empty Exception");
		}
		catch(IOException e)
		{
			System.out.println("Invalid permissions");
		}
		
		System.out.println("File Deleted Successfully");

	}

}
