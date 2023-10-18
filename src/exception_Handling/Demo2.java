package exception_Handling;

public class Demo2 
{

	public static void main(String[] args)
	{
	
		
		int a=10;
		int b=0;
		int c=0;
		
		
		try 
		{
			c=a/b;    // Risky Code   10/0 => 00
		}
		
		catch(ArithmeticException e)
		{
			
			c=a/1;  //  10/1==>10
			
			System.out.println("Arithmatic Exception found");
			
		}
		
		
		System.out.println(c);
		
	}
	
	
}
