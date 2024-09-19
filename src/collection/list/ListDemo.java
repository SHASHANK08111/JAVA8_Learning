package day.six.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();

		list.add(123);
		list.add(new Integer(234));
		list.add(23.4f);
		list.add(345.6);
		list.add("Arun");
		list.add(new Employee(8051896, "Arun", "Instructor", 123.45));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-------------------------------------------------------------------------");

		List integerList = new ArrayList();
		integerList.add(123);
		integerList.add(new Integer(345));
		integerList.add(456);
		// integerList.add("arun");

		int sum = 0;
		for (Object object : integerList) {
			sum = sum + (int) object;
		}
		System.out.println(sum);

		System.out.println("-------------------------------------------------------");
		for (Iterator iterator = integerList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

		ListIterator iterator = integerList.listIterator();
		System.out.println("---------------------------Forward-------------------------------------");

		for (; iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);

		}

		System.out.println("---------------------------Backward-------------------------------------");
		for (; iterator.hasPrevious();) {
			Object object = (Object) iterator.previous();
			System.out.println(object);
		}

	}

}
