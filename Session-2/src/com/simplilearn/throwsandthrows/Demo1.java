package com.simplilearn.throwsandthrows;

public class Demo1 {

	public void divide(int a,int b)
	{
		if(b==0)
			throw new ArithmeticException("B's value can not be 0");
		else
		{
			int c=a/b;
			System.out.println("Division "+c);
		}
	}
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		Demo1 d=new Demo1();
		//handled unchecked exception thrown by throw key word
		try {
			d.divide(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured "+e.getMessage());
		}

	}

}
