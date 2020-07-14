package collection.List.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Object> al = new ArrayList<Object>();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);

		al.remove(2);
		System.out.println(al);

		al.add(2, "M");
		al.add("N");
		al.set(2, "R");
		System.out.println(al);

		// ListIterator for iterating through ArrayList
		ListIterator<Object> itr = (ListIterator<Object>) al.listIterator();
		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
		}
		System.out.println();

		// For loop for retrieve element from ArrayList
		for (Object o : al) {
			System.out.print(o + " ");
		}

		System.out.println();
		// Check whether particular element exists in ArrayList

		if (al.contains("A")) {
			System.out.println("Letter A available");
		} else {
			System.out.println("Letter A not available");
		}
	}
}
