package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo1 
{

	
	public static void main(String[] args)
	{
	
		ArrayList al=new ArrayList();  // Object 
		
		al.add("Vedprasad");
		al.add(99922211);     
		al.add('A');
		al.add(null);
		al.add("Thakare");
		al.add("Vedprasad");
		al.add(99922211);
		al.add(99922211);
		al.add(null);
		al.add(null);
		al.add(null);  
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		HashSet hs=new HashSet(al);
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		
		
		
	}
	
}
