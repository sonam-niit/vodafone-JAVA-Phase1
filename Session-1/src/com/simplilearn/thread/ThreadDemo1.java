package com.simplilearn.thread;

public class ThreadDemo1 extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==2)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadDemo1 t1=new ThreadDemo1();
		t1.start();
		
		ThreadDemo1 t2=new ThreadDemo1();
		t2.start();
		
		ThreadDemo1 t3=new ThreadDemo1();
		t3.start();

	}

}
