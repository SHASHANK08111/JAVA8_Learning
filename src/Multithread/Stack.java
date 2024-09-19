package Multithread;

public class Stack {
	private int[] array;
	private int stackTop;
	Object lock;
	
	public Stack(int capacity) {
		array=new int[capacity];
		stackTop=-1;
		lock=new Object();
	}
	
	public boolean isFull() {
		if(stackTop>=array.length-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(stackTop==-1) {
			return true;
		}
		return false;
	}
	
	public synchronized boolean push(int element) {
			if(isFull()) return false;
			++stackTop;
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			array[stackTop]=element;
			return true;
	}
	
	public int pop() {
		synchronized (lock) {
			if(isEmpty()) return Integer.MIN_VALUE;
			int obj=array[stackTop];
			array[stackTop]=Integer.MIN_VALUE;
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			stackTop--;
			return obj;
		}
	}

}
