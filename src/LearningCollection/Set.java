package LearningCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
		
    public static void main(String arg[]) {
    //HashSet
		   HashSet<String> h = new HashSet<String>();
	       h.add("geeks");
	       h.add("for");
	       h.add("geek");
	    // h.remove("Geeks");
	       for (String i : h) {
	            System.out.println(i);        
	       }
	       
//	       HashSet<String> h1 = new HashSet<String>();
//	       h1.add("geeks");
//	       h1.add("4");
//	       h1.add("you");
//	       System.out.println("Merge");
//	       h1.addAll(h);
//	       for (String i : h1) {
//	            System.out.println(i);        
//	       }
	       
	       //Max and Min
		   System.out.println("Maximum value of HashSet : "+ Collections.max(h)); 
		   System.out.println("Minimum value of HashSet : "+ Collections.min(h)); 
		   
		//Sorting HashSet using List 
		//HashSet to List conversion   
	        ArrayList<String> list = new ArrayList<String>(h); 
	        //list.addAll(list);
	        //for(String s:h) {
	        //	list.add(s);
	        //}
	        Collections.sort(list); 
	        System.out.println("After sort" +list);
		   
		   
	    // Sorting HashSet using TreeSet 
	       TreeSet<String> treeSet = new TreeSet<String>(h);
	       System.out.println("After sort using TreeSet " +treeSet);
		   
    
    //LinkedHashSet
	       LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	       lhs.add(2);
	       lhs.add(3);
	       lhs.add(4);
	       lhs.add(2);
	       lhs.add(7);
	       System.out.println(lhs);
	       
	       //print the element of given index
	       int index=4;
	       int currIndex=0;
	       Integer currElement=null;
	       Iterator<Integer> it=lhs.iterator();
	       while(it.hasNext()) {
	    	   currElement=it.next();
	    	   if(currIndex==index-1) {
	    		   System.out.println("Index "+index+" :"+currElement);
	    		   break;
	    	   }
	    	   currIndex++;
	       }
		   
	       //Converting to array
	       Integer[] lhsArray=lhs.toArray(new Integer[lhs.size()]);
		   
	       // Convert LinkedHashSet to ArrayList
	       ArrayList<Integer> lhsarrayList = new ArrayList<>(lhs);
		   
		   //Remove an Element
	       lhs.remove(2);
	       
	       //Merging of two linkedList
	       LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
	       lhs1.add(2);
	       lhs1.add(8);
	       lhs.addAll(lhs1);
	       System.out.println("After merge :"+lhs);
	       
	       
	       
	       
	       
	       //EnumSet 
	    	enum Colors { 
	    		Red, 
	    		Pink, 
	    		Grey, 
	    		Yellow, 
	    		Green 
	    	} 
    		EnumSet<Colors> colors = EnumSet.of(Colors.Pink, Colors.Green); 
    		Iterator<Colors> itr = colors.iterator(); 
    		System.out.println("EnumSet : "); 
    		while (itr.hasNext()) { 
    			System.out.println(itr.next()); 
    		} 
	
		   
	       //TreeSet
	    		TreeSet<String> ts = new TreeSet<String>(); 
	    		ts.add("Geek"); 
	    		ts.add("For"); 
	    		ts.add("Geeks"); 
		    	ts.add("welcomes"); 
		    	ts.add("you"); 

	    		System.out.println("Tree Set is " + ts); 
	    		
	    		String check = "welcomes"; 
	    		System.out.println("Contains : " + check + " "+ ts.contains(check)); 

	    		System.out.println("First Value " + ts.first()); 
	    		System.out.println("Last Value " + ts.last()); 

	    		String value = "Geek"; 
	    		// Find the values just greater and smaller than the above string 
	    		System.out.println("Higher " + ts.higher(value)); 
	    		System.out.println("Lower " + ts.lower(value));

	    		
	    		
	    	  // Create Treeset using  List
	            ArrayList<String> fruitlist = new ArrayList<String>();
	            fruitlist.add("Mango");
	            fruitlist.add("Apple");
	            TreeSet<String> tree_set= new TreeSet<String>(fruitlist);
	            //tree_set.addAll(fruitlist);
	            System.out.println("TreeSet from List : " + tree_set);
	            
	          
	         //Remove duplicate from Array
	            String[] input = new String[] { "Hello","hi","Wow","cute","thanks","hi","Aww","cute","baby"};
	            TreeSet<String> Treeset1 = new TreeSet<String>();
	            for(String i:input) {
	            	if(!Treeset1.add(i)) {
	            		System.out.println("Duplicate Data entered : " + i);
	            	}
	            }
	            //converting to array
	            input=Treeset1.toArray(input);
	    
    }

}
