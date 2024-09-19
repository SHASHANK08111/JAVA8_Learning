package day.six.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RestrictedListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(new Integer(234));

		
		List<Employee> empList = new LinkedList<Employee>();
		empList.add(new Employee(1, "Arun", "Instructor", 1234.00));
		empList.add(new Employee(3, "Aruna", "Instructor", 234.00));
		empList.add(new Employee(2, "Ani", "Instructor", 12345.00));
		
		System.out.println("Before sort:");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		Collections.sort(empList);
		System.out.println("After sort:");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getSalary() - o2.getSalary());
			}
		});
		System.out.println("After sorting by salary:");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		
		
		
	}

}
