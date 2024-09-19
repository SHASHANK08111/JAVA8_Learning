package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLearn {
	    public static void main(String[] args) {
	        // Create a list of fruit names
	        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "banana");


	        List<String> transformedFruits = fruits.stream()
	                // Filter out fruits containing 'a'
	                .filter(fruit -> !fruit.contains("a"))
	                // Sort the remaining fruits alphabetically
	                .sorted()
	                // Convert each fruit name to uppercase
	                .map(String::toUpperCase)
	                // Skip the first fruit
	                .skip(1)
	                // Find the first fruit in the remaining list
	                .findFirst()
	                // Collect the result into a list
	                .stream()
	                // Remove duplicates
	                .distinct()
	                // Collect the result into a list
	                .collect(Collectors.toList());

	        // Print the transformed fruits
	        System.out.println(transformedFruits);
	        
	        
	        
	        
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Use stream and reduce to find the sum of all even numbers
	        int sumOfEvenNumbers = numbers.stream()
	                // Filter out even numbers
	                .filter(n -> n % 2 == 0)
	                // Reduce to find the sum
	                .reduce(0, (a,b)->(a+b));

	        // Print the result
	        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
	    }
	

}
