package com.simplilearn.interface1;

public class NewBuilding implements Plan{

	@Override
	public void groudFloor() {
		System.out.println("Ground Floor Developed");
		
	}

	@Override
	public void firstFloor() {
		System.out.println("First Floor Developed");
		
	}

	@Override
	public void secondFloor() {
		System.out.println("Second Floor Developed");
		
	}

}
