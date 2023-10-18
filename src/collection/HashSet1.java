package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{

	public static void main(String[] args)
	{
	
		
		HashSet hs=new HashSet();
		
		hs.add(100);  
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(100);
		hs.add(300);
		hs.add(null);
		hs.add(null);
		
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.contains(200));
		
		hs.remove(200);
		
		System.out.println(hs);
		
		System.out.println("=========Iterator===========");
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("========For each==========");
		
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
		
		hs.clear();
		
		
		System.out.println(hs);
		
		
		
	}
	
	
	
	
}
