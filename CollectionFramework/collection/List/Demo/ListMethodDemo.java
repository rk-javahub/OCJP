package collection.List.Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethodDemo {

	public static void main(String[] args) {
		// List interface methods demo
		ArrayList al = new ArrayList();
		al.add("Sandip");
		al.add("Akshay");
		al.add("Prakash");

		List l = new ArrayList();
		l.add("Rohit"); // Appends the specified element to the end of this list
						// (optional operation).
		l.add("Raju");
		l.add("Rohit");// Duplicates allowed

		l.add(0, "Sachin");// Inserts the specified element at the specified
							// position in this list (optional operation).
							// Shifts the element currently at that position (if
							// any) and any subsequent elements to the right
							// (adds one to their indices).
		
		l.add(null);
		l.add(null);

		l.addAll(al);// appends collection element to end of the list

		l.addAll(1, al);// Inserts all of the elements in the specified
						// collection into this list at the specified position
						// (optional operation). Shifts the element currently at
						// that position (if any) and any subsequent elements to
						// the right (increases their indices).

		System.out.println(l.size());// Returns the number of elements in this
										// list. If this list contains more than
										// Integer.MAX_VALUE elements, returns
										// Integer.MAX_VALUE.

		System.out.println(l.get(2));// Returns the element at the specified
										// position in this list.

		System.out.println(l.contains("Pramod"));// Returns true if this list
													// contains the specified
													// element. More formally,
													// returns true if and only
													// if this list contains at
													// least one element e such
													// that (o==null ? e==null :
													// o.equals(e)).

		Iterator itr = l.iterator(); // Returns an iterator over the elements in
										// this list in proper sequence.

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		l.remove(1);// Removes the element at the specified position in this
					// list (optional operation). Shifts any subsequent elements
					// to the left (subtracts one from their indices). Returns
					// the element that was removed from the list.

		l.remove("Sachin");// Removes the first occurrence of the specified
							// element from this list, if it is present
							// (optional operation). If this list does not
							// contain the element, it is unchanged. More
							// formally, removes the element with the lowest
							// index i such that (o==null ? get(i)==null :
							// o.equals(get(i))) (if such an element exists).
							// Returns true if this list contained the specified
							// element (or equivalently, if this list changed as
							// a result of the call).

		System.out.println(l.lastIndexOf("Rohit"));// Returns the index of the
													// last occurrence of the
													// specified element in this
													// list, or -1 if this list
													// does not contain the
													// element. More formally,
													// returns the highest index
													// i such that (o==null ?
													// get(i)==null :
													// o.equals(get(i))), or -1
													// if there is no such
													// index.

		System.out.println(l.containsAll(al));// Returns true if this list
												// contains the specified
												// element. More formally,
												// returns true if and only if
												// this list contains at least
												// one element e such that
												// (o==null ? e==null :
												// o.equals(e)).Specified by:
												// contains(...) in Collection

		System.out.println(l.equals(al));// Compares the specified object with
											// this list for equality. Returns
											// true if and only if the specified
											// object is also a list, both lists
											// have the same size, and all
											// corresponding pairs of elements
											// in the two lists are equal. (Two
											// elements e1 and e2 are equal if
											// (e1==null ? e2==null :
											// e1.equals(e2)).)

		System.out.println(l.retainAll(al)); // It will remove all elements from list except al collection elements

		System.out.println(l);

	}

}
