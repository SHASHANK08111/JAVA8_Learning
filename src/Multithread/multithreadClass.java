package Multithread;

import java.util.Iterator;


public class multithreadClass extends Thread {

	public multithreadClass(String threadName) {
		super(threadName);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName()+" Value of i :"+i);
		}
		
	}
	
}
