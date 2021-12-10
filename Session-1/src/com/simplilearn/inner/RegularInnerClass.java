package com.simplilearn.inner;

public class RegularInnerClass {

	private String userKey="XYZ";
	
	class Inner
	{
		String bankKey="XYZ";
		void match()
		{
			if(userKey.equals(bankKey))
			{
				System.out.println("successfull!!! Access Provided");
			}
			else {
				System.out.println("Denied");
			}
		}
	}
	public static void main(String[] args) {
		
		RegularInnerClass regular= new RegularInnerClass();
		RegularInnerClass.Inner inner=regular.new Inner();
		
		inner.match();

	}

}
