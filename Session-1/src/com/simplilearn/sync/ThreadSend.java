package com.simplilearn.sync;

public class ThreadSend implements Runnable{

	private String msg;
	Sender sender;
	
	public ThreadSend(String msg,Sender sender) {
		this.msg=msg;
		this.sender=sender;
	}
	
	@Override
	public void run() {
		
		synchronized (sender) {
			sender.send(msg);
		}
		
		
	}

}
