package collection.List.Demo;

import java.util.ArrayList;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(60);
		al1.add(70);
		al1.add(80);
		al1.add(90);
		al1.add(100);

		System.out.println("Arraylist al" + al);
		System.out.println("Arraylist al1" + al1);

		al.addAll(al1);
		System.out.println("al.addAll(al1)" + al);
		
		al.retainAll(al1);
		System.out.println("al.retainAll(al1)"+al);

		al.remove(1);
		System.out.println("al.remove(1)" + al);

		al.removeAll(al1);
		System.out.println("al.removeAll(al1)" + al);

	}

}
