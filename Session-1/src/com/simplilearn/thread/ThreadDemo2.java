package com.simplilearn.thread;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{	
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}
	
	public static void main(String[] args) {
		
		ThreadDemo2 demo1=new ThreadDemo2();
		Thread t1=new Thread(demo1);
		
		ThreadDemo2 demo2=new ThreadDemo2();
		Thread t2=new Thread(demo2);
		t1.start();
		t2.start();
		
		try {
			t1.wait();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
