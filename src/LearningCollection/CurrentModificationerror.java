package LearningCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class CurrentModificationerror {
	
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Adding elements to the list
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);

	        // Creating an iterator
	        Iterator<Integer> iterator = numbers.iterator();

	        // Iterating over the list
	        while (iterator.hasNext()) {
	            Integer number = iterator.next();
	            System.out.println(number);

	            // Simulating modification in another thread
	            //if (number == 2) {
	                // This will throw ConcurrentModificationException
	                numbers.remove(number);
	           // }
	        }
	    }
	

}
