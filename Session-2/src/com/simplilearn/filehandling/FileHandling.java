package com.simplilearn.filehandling;

import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException{
		CreateNewFile create= new CreateNewFile();
		
		//create.createFileUsinmgFileClass();
		create.createFileUsingFileOutputStreamClass();
		create.createFileUsingNIO();

	}

}
