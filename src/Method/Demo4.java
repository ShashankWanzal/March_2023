package Method;

public class Demo4 
{

	
	
	public static void m1()
	{
		
		System.out.println("Method m1 is runing");
		
	}
	
	
	public void m2()
	{
		System.out.println("Non Static method m2 is running");
		
	}
	
	
	public static void main(String[] args)
	{
	
		System.out.println("main method is running");
		
		//m1(); //direct call 
		
		Demo4.m1();
		
		Demo4 a=new Demo4();  //syntax
		
		a.m2();
		a.m3();

		
	}
	
	
	public void m3()
	{
		System.out.println("Non Static method m3 is running");
		
	}
	
	
	
	
}
