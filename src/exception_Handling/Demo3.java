package exception_Handling;

import java.util.InputMismatchException;

public class Demo3
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
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			c=a/1;  //  10/1==>10
			
			System.out.println("ArrayIndexOutOfBoundsException found");
			
		}
		
		catch(InputMismatchException e)
		{
			
			c=a/1;  //  10/1==>10
			
			System.out.println("InputMismatchException found");
			
		}
		
		catch(NullPointerException e)
		{
			
			c=a/1;  //  10/1==>10
			
			System.out.println("InputMismatchException found");
			
		}
		
		catch(ArithmeticException e)
		{
			
			c=a/1;  //  10/1==>10
			
			System.out.println("Arithmatic Exception found");
			
		}
		
		
		System.out.println(c);
	}
	
}
