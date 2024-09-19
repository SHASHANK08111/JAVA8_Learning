package LearningCollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Queue {
	public static void main(String[] args) {
		
        Deque<String> de_que = new ArrayDeque<String>(); 
  
        de_que.add("Welcome"); 
        de_que.add("To"); 
        de_que.add("Geeks"); 
        de_que.add("4"); 
        de_que.add("Geeks"); 
  
        System.out.println("Initial Deque: " + de_que); 
  
        de_que.offerFirst("World"); 
        de_que.offerFirst("Hello"); 
  
        System.out.println("Final Deque: " + de_que); 
        de_que.peek();
        de_que.peekFirst();
        de_que.peekLast();
        //removes
        de_que.poll();
        de_que.pollFirst();
        de_que.pollLast();
        
        
        
        Iterator value = de_que.descendingIterator(); 
        
        // Displaying the values after iterating through the Deque 
        // in reverse order 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next());
        }
	}
}

