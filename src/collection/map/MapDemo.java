package day.six.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		
		Map<Integer, String> map = new HashMap<Integer, String>(); // order not assured
		//Map<Integer, String> map = new LinkedHashMap<Integer, String>(); // order assured
		//Map<Integer, String> map = new TreeMap<Integer, String>(); // sort keys
		map.put(123, "Arun");
		map.put(123, "Aruna");
		map.put(122, "Arun");
		map.put(111, "Anu");
		
		System.out.println("Size is "+map.size());
		
		System.out.println("----------------Using keyset and get(key)-------------");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println("Key : "+key+" Value :"+map.get(key) );
		}
		
		System.out.println("-----------------------------Using Entry ----------");
		Set<Entry<Integer, String>> set = map.entrySet();
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println(map);

		System.out.println("-------------------------Using Lambda Expression --------------");
		map.forEach((K,V)->{System.out.println(K+" "+V);});
	}

}
