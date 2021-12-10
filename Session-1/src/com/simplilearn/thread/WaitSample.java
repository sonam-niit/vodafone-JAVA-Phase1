package com.simplilearn.thread;

public class WaitSample {

	private static Object obj= new Object();
	
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println(Thread.currentThread()+" started");
		
		Thread.sleep(1000);
		
		System.out.println("Thread "+Thread.currentThread().getName()+" is woke up "
				+ "after 1 second");
		
		synchronized (obj) {
			obj.wait(1000);
			
			System.out.println("Object "+obj+ " woke up after 1 second");
		}
	}
}
