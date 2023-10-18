package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 
{

	
	public static void main(String[] args) 
	{
	
		
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add(100);  
		lh.add(200);
		lh.add(300);
		lh.add(400);
		lh.add(100);
		lh.add(300);
		lh.add(null);
		lh.add(null);
		lh.add("Ganesh");
		lh.add('A');
		lh.add("Ganesh");
		lh.add(100);
		lh.add(100);
		lh.add(100);
		lh.add(100);

		
		System.out.println(lh.size());
		
		System.out.println(lh);
		
		
		System.out.println(lh.isEmpty());
		
		System.out.println(lh.contains(100));
		
		lh.remove(100);
		lh.remove(null);
		
		System.out.println(lh);
		
		System.out.println("===========Iterator==========");
		
		Iterator itr = lh.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===========For each =============");
		
		for(Object s1:lh)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
	}
	
	
}
