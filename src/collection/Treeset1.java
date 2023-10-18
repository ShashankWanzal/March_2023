package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1
{

	
	public static void main(String[] args)
	{
		
		TreeSet tr=new TreeSet();
		
		tr.add(10);
		tr.add(15);
		tr.add(12);
		tr.add(5);
		tr.add(22);
		tr.add(20);
		
		tr.add(50);
		tr.add(222);
		tr.add(120);
		
		
		
		System.out.println(tr);
		
		System.out.println(tr.first());
		
		System.out.println(tr.last());
		
		tr.pollFirst(); //delete  first record
		
		System.out.println(tr);
		
		tr.pollLast();
		
		System.out.println(tr);
		
		tr.remove(20);
		
		System.out.println(tr);
		
		System.out.println(tr.isEmpty());
		
		System.out.println(tr.contains(10));
		
		System.out.println(tr.size());
		
		
		System.out.println("================Iterator=====================");
		
		
		Iterator itr = tr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("================Decending Order====================");
		
		Iterator ditr = tr.descendingIterator();
		
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		System.out.println("========for Each=======================");
		for(Object s1:tr)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
	}
	
	
}
