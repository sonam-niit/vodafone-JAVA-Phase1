package com.simplilearn.diamondproblem;

public class TestClass implements First,Second{

	@Override
	public void show() {
		
		First.super.show();
		Second.super.show();
	}
	public static void main(String[] args) {
		
		TestClass t= new TestClass();
		t.show();
	}

	
}
