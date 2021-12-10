package com.simplilearn.inner;

public class MethodLocalInner {

	private String msg="method local inner class";
	
	void display()
	{
		class Inner{
			void msg() {
				System.out.println("Message from method Inner class: "+msg);
			}
		}
		
		Inner i=new Inner();
		i.msg();
	}
	
	public static void main(String[] args) {
		MethodLocalInner mli=new MethodLocalInner();
		mli.display();
	}
}
