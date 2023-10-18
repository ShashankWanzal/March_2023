package this_super_keyword;

public class Demo2 extends Demo1
{
	
		
	int a=30;
	
	
	public void m2()
	{
		int a=100;
		
		System.out.println("Value of local variable=> "+a);
		
		System.out.println("Value of global variable from Demo2=> "+this.a);
		
		System.out.println("Value of global variable=> "+super.a);
		
	}
	
	
	public static void main(String[] args) 
	{
	
		Demo2 a=new Demo2();
		
		a.m2();
		
		// we can not use this & super keyword in static Method 
		
		
		
	}
	
	
	
	
}
