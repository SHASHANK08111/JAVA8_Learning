package Multithread;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	private Queue<Integer> q;
	private int capacity;
	
	public Queue1(int cap) {
		q=new LinkedList<>();
		capacity=cap;
	}

	public boolean add(int item) {
		synchronized (q) {
			while(q.size()==capacity)
			{
				System.out.println("full");
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			q.add(item);
			q.notifyAll();
			return true;
			
		}
	}
	
	public int remove() {
		synchronized (q) {
			while(q.size()==0) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int element=q.poll();
			q.notifyAll();
			return element;
		}
	}
}
