package Method;

public class Demo10 
{

	public void m1(boolean a)
	{
		
		System.out.println("Non Static Method m1 calling from another class=> "+a);
	}
	
	public void m2(double a)
	{
		System.out.println("Non Static Method m2 calling from another class=> "+a);
	}
	
	public void m3(char c)
	{
		System.out.println("Non Static Method m3 calling from another class=> "+c);
	}
	
	
	public static void m4(String str)
	{
		System.out.println("Static Method m4 calling from another class=> "+str);
	}
	
	
	public static void m5(int s)
	{
		System.out.println("Static Method m5 calling from another class=> "+s);
	}
	
	
	
}
