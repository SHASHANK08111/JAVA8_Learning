package Multithread;

public class main {

	public static void main(String[] args) {
		System.out.println("Main is started");
//		
//		//Naming -use constructor in thread class
//		multithreadClass thread1=new multithreadClass("thread1");
//		thread1.start();
//		
//		
//		//Runnable
//		//Naming -pass second argument
//		multithreadRunnable mt=new multithreadRunnable();
//		Thread thread2=new Thread(mt,"thread2");
//		thread2.start();
//		
//		
//		//Using lamda
//		Thread thread3=new Thread(()->
//		{
//			for(int i=0;i<=100;i++) {
//				System.out.println("Thread Name "+Thread.currentThread().getName()+" Value of i :"+i);
//			}
//		},"thread3");
//		thread3.start();
//		
		
		//Stack
	//	Stack stack =new Stack(5);
		
//		new Thread(()->{
//			int counter=0;
//			while(++counter<10)
//				System.out.println("pushed :"+stack.push(100));
//		},"pushThread").start();
//		
//		
//		new Thread(()->{
//			int counter=0;
//			while(++counter<10)
//				System.out.println("popped :"+stack.pop()); 
//		},"popThread").start();
		
		
		//Queue
		//Consumer and producer problem
		Queue1 queue1=new Queue1(5);
		new Thread(()->{
			int counter=0;
			while(++counter<=10) {
				System.out.println("added "+queue1.add(5));
			}
		},"adder").start();
	
		new Thread(()->{
			int counter=0;
			while(++counter<=10) {
				System.out.println("removed "+queue1.remove());
			}
		},"remover").start();
		System.out.println("Main is ended");
		
		

	}

}
