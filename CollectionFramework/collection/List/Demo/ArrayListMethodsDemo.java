package collection.List.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethodsDemo {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		    
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Sonoo");  
		  al2.add("Hanumat");
		  al2.add("Ravi");
		  //al2.add("Sonoo");
		    
		  al.remove(al2);    
		  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
}
