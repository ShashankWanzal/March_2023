package abstract_class;

public class Demo2   extends Demo1   // Concreate class
{

	
	 int a=10;
	
	protected void pr() 
	{
		System.out.println("Pr is running");
	}
	
	public void m4()
	{
		
		System.out.println("Method m4 is running");
	}
	
	
	
	public void m5()  
	{
		
		System.out.println("Method m5 is running");
		
	}
	
	public void m7()
	{
		
		System.out.println("Method m7 is running");
		
	}
	
	public static void main(String[] args) {
		
		
		Demo2 a=new Demo2();
		
		
		a.m1();
		a.pr();
		
		
	}
	
	
	
	
}
