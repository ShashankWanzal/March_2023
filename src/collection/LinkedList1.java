package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{

	
	public static void main(String[] args) 
	{
	
		LinkedList ll=new LinkedList();
	
		ll.add("Vedprasad");
		ll.add(99922211);    // Heterogeneous 
		ll.add('A');
		ll.add(null);
		ll.add("Thakare");
		ll.add("	");
		ll.add(99922211);
		ll.add(99922211);
		ll.add(null);
		ll.add(null);
		ll.add(null);  
		
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		System.out.println(ll.isEmpty());
		
		System.out.println(ll.contains('A'));
		
		
		System.out.println(ll.get(1));
		
		ll.add(1,1234567);
		
		System.out.println(ll);
		
		
		ll.remove(1);
		
		System.out.println(ll);
		
		
		
		
		ListIterator litr = ll.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("====================================");
		
		Iterator itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===========for===========");
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("=========for each============");
		
		for(Object s1:ll)
		{
			System.out.println(s1);
		}
		
		
		
	}
	
	
}
