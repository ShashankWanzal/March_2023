package polymorphism;

public class Demo3
{

	
	public static void main(String[] args)
	{
	
		
		Demo1 a=new Demo1();
		
		a.m1();
		a.m1(1);
		a.m1(1, 2);
		a.m1(1, 2,3);
		a.m1(1, 2, 3, 4);
		
		main(1);
		
	}
	
	public static void main(int a)
	{
	
		System.out.println("main is running=> "+a);
		
	}
	public static void main(int a,int e)
	{
	
		System.out.println("main is running=> "+a);
		
	}
	public static void main(int a, int b, int c)
	{
	
		System.out.println("main is running=> "+a);
		
	}
	
	
	// Static Yes
	// Construct overload  Yes
	// main Overload ?  -> Yes main 
	
	
}
