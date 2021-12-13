package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReadAFile {

	public static List<String> readFileInList(String fileName)
	{
		List<String> list=Collections.emptyList();
		try {
			list=Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		
		List<String> result= ReadAFile.readFileInList("F://DemoFile/textFile3.txt");
		
		for(String s:result)
		{
			System.out.println(s);
		}

	}

}
