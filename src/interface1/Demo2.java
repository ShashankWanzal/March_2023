package interface1;

public class Demo2 implements Demo1
{


	public void m1()
	{
	
		System.out.println("M1 is running");
		
	}


	public void m2() 
	{

	System.out.println("M2 is running");	
		
	}

	
	public static void main(String[] args) 
	{
		
		
		Demo2 a=new Demo2();
		
		a.m1();
		a.m2();
		System.out.println(a.a);
		
	}
	
	
	
	
	
}
