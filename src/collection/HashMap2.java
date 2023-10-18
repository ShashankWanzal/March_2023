package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap2 
{

	public static void main(String[] args)
	{
	
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		
		map.put("Nikhil", 999222111);
		map.put("naved", 999992222);
		map.put("ved", 999111222);
		
		int length = map.size();
		
		System.out.println(length);
		
		
		map.remove("ved");
		
		System.out.println(map);
		
		map.replace("naved", 999992222, 9999999);
		
		map.replace("Nikhil", 12345);
		
		System.out.println(map);
		
		System.out.println("===============for each===");
		
		
		for(Entry<String, Integer> s1:map.entrySet())
		{
			System.out.println(s1.getKey() +"=> "+s1.getValue());
		}
		
		System.out.println("================Iterator=========");
		
		
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
	
}
