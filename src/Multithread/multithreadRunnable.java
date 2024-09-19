package Multithread;

public class multithreadRunnable implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread Name "+Thread.currentThread().getName()+" Value of i :"+i);
		}
		
	}

}
