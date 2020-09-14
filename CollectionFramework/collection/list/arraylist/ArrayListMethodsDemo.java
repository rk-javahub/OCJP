package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethodsDemo {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rohit");
		al.add("Vijay");
		al.add("Sachin");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sanket");
		al2.add("Raj");
		al2.add("Rasika");

		// addAll()
		al.addAll(al2);

		// clone()
		@SuppressWarnings("unchecked")
		ArrayList<String> al3 = (ArrayList<String>) al.clone();
		System.out.println(al3); // [Rohit, Vijay, Sachin, Sanket, Raj, Rasika]

		// contains()
		System.out.println(al.contains("Rohit")); // true

		// containsAll()
		System.out.println(al.containsAll(al2)); // true

		// ensureCapacity()
		al.ensureCapacity(25);

		// indexOf()
		System.out.println(al.indexOf("Rasika")); // 5

		// isEmpty()
		System.out.println(al.isEmpty());// false

		// lastIndexOf()
		System.out.println(al.lastIndexOf("Rohit")); // 0

		// remove()
		System.out.println(al.remove("Sanket")); // true

		// remaining implementation. (1.8 feature)
		// al.removeIf(filter);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			/*
			 * Since Iterator returned by ArrayList is fail fast exception is thrown if we
			 * try to modify ArrayList during iterating
			 */
			// al.add("Sachin"); O/P - java.util.ConcurrentModificationException
		}
	}
}
