package collection;

import java.util.HashMap;

public class Hashmap1 
{

	
	public static void main(String[] args) 
	{
	
		//Keys & Value 
		
		// Username & Password
		
		
		HashMap<String, String>  map=new HashMap<String, String>();
		
		
		map.put("Nikhil", "Kale");		
		map.put("Naved", "MyName@is Khan");
		map.put("Ved", "Thakare");
		map.put("Shashank", "Wanzal");
		map.put("Nikhil", "Kale");	
		map.put("Akash", null);
		map.put(null, "Akash");
		
		System.out.println(map);
		
		//db
		
		
		System.out.println(map.containsKey("Ved"));
		
		System.out.println(map.containsValue("Kale"));
		
		
		System.out.println(map.get("Naved"));
		
		
		System.out.println("================================================");
		
		HashMap<Character, Integer> map2=new HashMap<Character, Integer>
		();
		
		
		map2.put('A', 90);
		map2.put('B', 80);
		map2.put('C', 70);
		map2.put('D', 60);
		
		
		
		System.out.println(map2);
		
	}
	
	
}
