package com.simplilearn.sync;

public class Main {

	public static void main(String[] args) {
		Sender s=new Sender();
		
		ThreadSend t1= new ThreadSend("Hello", s);
		ThreadSend t2= new ThreadSend("Good Morning", s);
		ThreadSend t3= new ThreadSend("Good Bye!!!", s);
		
		Thread thread1= new Thread(t1);
		Thread thread2= new Thread(t2);
		Thread thread3= new Thread(t3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
