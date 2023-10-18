package Method;

public class Demo9 
{

	public void m2(int a,int b)
	{
		System.out.println("Non static o/p=> "+(a+b) );
	}
	
	
	public static void m1(int a,int b)
	{
		
		System.out.println(a*b);
		
	}
	
	
	public static void main(String[] args)
	{
	
		m1(2,3);
		m1(10,5);
		m1(20,20);
		
		m1(50,50);
		
		Demo9 a=new Demo9();    
		
		a.m2(10, 20);
		a.m2(20, 25);
		a.m2(30, 50);
		
	}
	
	
}
