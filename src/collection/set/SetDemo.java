package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//Set<Integer> set = new HashSet<Integer>(); // order of insertion is not assured
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(12);
		set.add(23);
		set.add(7);
		set.add(34);
		set.add(10);
		set.add(7);
		
		System.out.println("Size is "+set.size());
		System.out.println("-----------------------------Using Iterator----------------------");
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		System.out.println("-------------------------------------------Using for each -----------------------");
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
		System.out.println("----------------------- just ---------------");
		System.out.println(set);

		Set<Employee> empLinkedSet = new LinkedHashSet<Employee>();
		empLinkedSet.add(new Employee(123, "Arun", "Trainer", 1234.00));
		empLinkedSet.add(new Employee(123, "Arun", "Trainer", 1234.00));
		empLinkedSet.add(new Employee(123, "Arun", "Trainer", 1234.00));
		System.out.println(empLinkedSet.size());

		Set<Employee> empSet = new TreeSet<Employee>();
		empSet.add(new Employee(123, "Arun", "Trainer", 1234.00));
		empSet.add(new Employee(121, "Arun", "Trainer", 1234.00));
		empSet.add(new Employee(123, "Arun", "Trainer", 1234.00));
		System.out.println(empSet);
	}

}
