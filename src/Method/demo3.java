package Method;

public class demo3 
{

	
	
	public void m1()
	{
	
		System.out.println("Non Static method m1 is running");
		
	}
	
	public static void m2()
	{
		
		System.out.println("Static method m2 is running");
		
	}
	
	
	
	public static void main(String[] args) 
	{
	
		
		// we have to create object of the class 
		
		demo3 a1=new demo3();  // syntax use to create the object 
		
		a1.m1();
		a1.m2();
		
		
		
		
		
		
	}
	
	
	
}
