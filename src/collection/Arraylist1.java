package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1
{

	
	public static void main(String[] args)
	{
	
		ArrayList al=new ArrayList();  // Object 
		
		al.add("Vedprasad");
		al.add(99922211);    // Heterogeneous 
		al.add('A');
		al.add(null);
		al.add("Thakare");
		al.add("	");
		al.add(99922211);
		al.add(99922211);
		al.add(null);
		al.add(null);
		al.add(null);  
		
		
		
		
		System.out.println("Size of list=>"+al.size());  // 0-10
		
		//Arraylist is empty?
		
		System.out.println(al.isEmpty());  // boolean 
		
		System.out.println(al.contains(99922211));  // Boolean
		
		System.out.println(al.get(4));  
		
		System.out.println(al);
		
		al.add(3,"Ved");
		
		System.out.println(al);
		
		
		al.add(7,11111111);
		
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		System.out.println("Value on index 1=> "+al.get(1));
		
		al.remove(1)
		;
		
		System.out.println(al);
		
		System.out.println("Value on index 1=> "+al.get(1));
		
		al.set(2,"Jan Batch" );
		
		System.out.println(al);
		
		
		// Set // Modify  
		al.set(5,91919191 );
		
		System.out.println(al);
		
		
		// 3 
		
		// Iterator -> Universal 
		// ListIterator -> List 
		// Enumeration -> only for vector
		
		System.out.println("===========================================");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		
		System.out.println("============================================");
		
		ListIterator litr = al.listIterator();
		
		
		while(litr.hasNext())
		{
			
			
			System.out.println(litr.next());
			
		}
		

		
		System.out.println("====================For Loop==================");
		
		for(int i=0;i<=al.size()-1;i++)  //i=1  //   11   // 0 -> 10
		{
			
			System.out.println(al.get(i));  //i=0   al.get(1)-> 
		}
		
		System.out.println("===================For Each Loop======================");
		
		
		for(Object s1:al)
		{
			
			System.out.println(s1);
		}
		
		
		
	}
	
	
	
}
