package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{

	public static void main(String[] args)
	{
	
		Vector v=new Vector();
		
		v.add("Vedprasad");
		v.add(99922211);    
		v.add('A');
		v.add(null);
	/*	v.add("Thakare");
		v.add(99922211);
		v.add(99922211);
		v.add(null);
		v.add(null);
		v.add(null);  
		*/
		
		
		System.out.println("Default size of vector=>"+v.capacity());
		
		System.out.println(v);
		
				
		System.out.println(v.size());
		
		System.out.println(v.isEmpty());
		
		System.out.println(v.contains('A'));
		
		System.out.println(v.get(2));
		
		v.add(2,"Abc");
		
		System.out.println(v);
		
		v.remove(2);
		
		System.out.println(v);
		
		v.set(2, 'B');
		
		System.out.println(v);
		
		
		System.out.println("============Iterator===========");
		
		Iterator itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("=============List Iterator==================");
		
		ListIterator litr = v.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("==============Enumeration====================");
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		System.out.println("==============For loop================");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("==============For Each===============");
		
		for(Object s1:v)
		{
			
			System.out.println(s1);
			
		}
		
		
		
		
		
	}
	
	
}
