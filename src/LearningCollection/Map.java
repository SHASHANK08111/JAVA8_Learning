package LearningCollection;

import java.util.HashMap;
import java.util.Hashtable;

public class Map {
	public static void main(String[] args) {
		
	//HashTable
        Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>(); 
        hash_table.put(10, "Geeks"); 
        hash_table.put(15, "4"); 
        hash_table.put(20, "Geeks"); 
        hash_table.put(25, "Welcomes"); 
        hash_table.put(30, "You");
        System.out.println(hash_table);
        System.out.println(hash_table.put(20, "GeeksNew"));//return previous value
        System.out.println(hash_table.put(22, "GeeksNew"));//return null if new key added
        System.out.println(hash_table);
        
        //remove
        hash_table.remove(20); //return Geeks
        hash_table.remove(12); //return NULL
        hash_table.size();     //return 5
        
        
    //HashMap
     // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
        System.out.println(hash_map);
        System.out.println(hash_map.put(20, "GeeksNew"));//return previous value
        System.out.println(hash_map.put(22, "GeeksNew"));//return null if new key added
        System.out.println(hash_map);
        
        //remove
        hash_map.remove(20); //return Geeks
        hash_map.remove(12); //return NULL
        hash_map.size();     //return 5
        
        hash_map.replace(10, "GeeksReplace"); //return Geeks
        hash_map.replace(12, "NEW");          //Return null and new pair is not added
        System.out.println(hash_map);
        
	}
}
