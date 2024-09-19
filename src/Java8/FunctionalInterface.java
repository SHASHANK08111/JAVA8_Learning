package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

		public static void main(String args[])
		
		{
//			new Thread(() -> {
//			        System.out.println("New thread created");
//		    }).start();

            Runnable r=() -> {
            	System.out.println("New thread created!");
			};
			Thread t1=new Thread(r);
			t1.start();
			
			
//Consumer Interface
			// Only one argument
			Consumer<Integer> display = a -> System.out.println(a);
	        display.accept(10);
	        
	        Consumer<List<Integer> > modify = list ->
	        {
	            for (int i = 0; i < list.size(); i++)
	                list.set(i, 2 * list.get(i));
	        };
	 
	        // Consumer to display a list of numbers
	        Consumer<List<Integer> >
	            dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
	 
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(2);
	        list.add(1);
	        list.add(3);
	        modify.accept(list);
	        dispList.accept(list);
	        
//BiConsumer Interface
	        //Two Arguments
	        List<Integer> lista = new ArrayList<Integer>();
	        lista.add(1);
	        lista.add(2);
	        lista.add(3);
	        List<Integer> listb = new ArrayList<Integer>();
	        listb.add(1);
	        listb.add(2);
	        listb.add(3);
	 
	        // BiConsumer to compare both lists
	        BiConsumer<List<Integer>, List<Integer> > equals = (list1, list2) ->
	        {
	            if (list1.size() != list2.size()) {
	                System.out.println("False");
	            }
	            else {
	                for (int i = 0; i < list1.size(); i++)
	                    if (list1.get(i) != list2.get(i)) {
	                        System.out.println("False");
	                        return;
	                    }
	                System.out.println("True");
	            }
	        };
	        equals.accept(lista, listb);
	        
	        
//Predicate Interface
	    
            // Creating predicate 
            Predicate<Integer> lesserthan = i -> (i < 18);  
            // Calling Predicate method 
            System.out.println(lesserthan.test(10));  
	        
            
            Predicate<Integer> greaterThanTen = (i) -> i > 10; 
            Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
            //and method
            boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
            System.out.println(result); 
            //negate method
            boolean result2 = greaterThanTen.or(lowerThanTwenty).negate().test(22); 
            System.out.println(result2); 
	        
//Function Interface   
            //Input type Integer and return type is double
            Function<Integer, Double> half = a -> a + 2.0;
            System.out.println(half.apply(10));
            System.out.println(half.andThen(a -> a / 2.0).apply(10));
           
            half = half.compose(a -> 3 * a);//first compose will call then apply
            System.out.println(half.apply(5));
            
            Function<Integer, Integer> i = Function.identity();
            System.out.println(i.apply(10));//returns its own argument
            
 //Supplier Interface
            //Zero argument and return type T
            Supplier<Double> randomValue = () -> Math.random(); 
            System.out.println(randomValue.get()); 
		}
	
}
