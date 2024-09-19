package LearningCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class List {	
	public static void main(String[] args) 
		{ 

			ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
			arrlist.add(2); 
			arrlist.add(15); 
			arrlist.add(20); 
			arrlist.add(25); 
			//arrlist.add(1,35); 
			//arrlist.remove(1);                   //remove by index
			//arrlist.remove(Integer.valueOf(20)); //remove by value
			//arrlist.set(2, 30);
			
//			Iterator itr = arrlist.iterator();   //Iterate all element and remove
//	        while (itr.hasNext()) { 
//	            // Remove elements smaller than 10 using 
//	            int x = (Integer)itr.next(); 
//	            if (x < 10) 
//	                itr.remove(); 
//	        } 
			for (Integer number : arrlist) { 
				System.out.println("Number = " + number); 
			} 
			//LinkedArrayList and Vector
			
			//STACK
			
			  Stack<String> STACK = new Stack<String>();
			  
			  STACK.push("Geeks");
		      STACK.push("4");
		      STACK.push("Geeks");
		      STACK.push("Welcomes");
		      STACK.push("You");
		      System.out.println(STACK);
		      System.out.println(STACK.isEmpty());
		      
//		      STACK.pop();
//		      STACK.pop();
//		      STACK.pop();
//		      STACK.pop();
//		      STACK.pop();
//		      System.out.println(STACK);
//		      System.out.println(STACK.isEmpty());
		      
			  System.out.println("Does the stack contains '4'? "+ STACK.search("4"));  
			  System.out.println("Does the stack contains 'Hello'? "+ STACK.search("Hello")); 
			  System.out.println("Does the stack contains 'Geeks'? " + STACK.search("Geeks"));
			  System.out.println("Peek Element is "+ STACK.peek()); 
			  
			} 
}
