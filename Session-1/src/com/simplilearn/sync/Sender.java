package com.simplilearn.sync;

public class Sender {

	public void send(String msg)
	{
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(msg+" send successfully");
	}
}
