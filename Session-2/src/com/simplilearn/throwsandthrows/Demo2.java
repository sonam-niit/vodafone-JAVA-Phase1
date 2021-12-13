package com.simplilearn.throwsandthrows;

import java.io.IOException;

public class Demo2 {

	//throwing exception which is checked needs to handle in each method where you call
	//handle by throws declaration or try catch block
	public void divide(int a,int b) throws IOException
	{
		if(b==0)
			throw new IOException("B's value can not be 0");
		else
		{
			int c=a/b;
			System.out.println("Division "+c);
		}
	}
	
	public void call() throws IOException
	{
		divide(10, 0);
	}
	public static void main(String[] args) throws IOException{
		

		Demo2 d=new Demo2();
		d.call();
//		try
//		{
//			d.call();
//		}
//		catch(IOException e)
//		{
//			System.out.println(e.getMessage());
//		}

	}

}
