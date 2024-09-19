package Java8;

import java.util.Optional;

public class OptionalClass {

	    public static void main(String[] args) {
	       
	        Optional<String> optionalValue = getValue(true); // Change to false to simulate no value

	        // Checking if a value is present
	        if (optionalValue.isPresent()) {
	            System.out.println("Value is present: " + optionalValue.get());
	        } else {
	            System.out.println("Value is absent");
	        }

	        String valueOrDefault = optionalValue.orElse("Default Value");
	        System.out.println("Value or default: " + valueOrDefault);
	        
	        
	        
	        //Nullable
	        // Same as of but it will return empty instead of exception if parameter is null 
	        Optional<String> op2  = Optional.ofNullable(null); 
	  
	        // print value 
	        System.out.println("Optional 2: "
	                           + op2); 
	        
	        
	        
	        
	    }

	    public static Optional<String> getValue(boolean hasValue) {
	        if (hasValue) {
	            return Optional.of("Hello, Optional!");
	        } else {
	            return Optional.empty();
	        }
	    }

}
