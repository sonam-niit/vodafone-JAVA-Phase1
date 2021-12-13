package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {

	void createFileUsinmgFileClass() throws IOException{
		
		File f=new File("F://DemoFile/testFile.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File Created");
		}
		else {
			System.out.println("File Already Exist");
		}
		
		//to Write
		
		FileWriter writer=new FileWriter(f);
		writer.write("Hello World");
		writer.close();
	}
	
	void createFileUsingFileOutputStreamClass() throws IOException{
		
		//if file there open the file and not there create new file
		FileOutputStream out= new FileOutputStream("F://DemoFile/testFile2.txt");
		
		//write data
		String data="Welcome to File Handling usinng FileOutputStream";
		out.write(data.getBytes());
		out.close();
		
	}
	
	void createFileUsingNIO() throws IOException{
		
		String data="test Data";
		Files.write(Paths.get("F://DemoFile/textFile3.txt"),data.getBytes() );
		
		List<String> list=Arrays.asList("Welcome","good morning","Have a nice day","good bye");
		Files.write(Paths.get("F://DemoFile/textFile3.txt"),list, 
				StandardCharsets.UTF_8,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		
	}
}
