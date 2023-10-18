package constructor;

public class Demo2 
{
	 int mark;   // Variable declare   

	
	
	public Demo2()
	{
	
		mark=35;   // Intialize constructor 
	}
	
	

	
	public static void main(String[] args) 
	{
	
	Demo2 a=new Demo2();
	
	a.m1();
		
		
		
	}
	
	
	public void m1()
	{
		
		System.out.println("Percentage= "+mark+"%");   //Use in non Static Method 
	}
	
	
	
}
