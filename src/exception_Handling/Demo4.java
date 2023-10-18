package exception_Handling;

public class Demo4
{

	public static void main(String[] args) throws Exception
	{
	
		
		
		int age=17;
		
		// 18 old 
		
		
		if(age>=18)
		{
			
			System.out.println("Eligible for voting");
		}
		else
		{
			
			throw new ArithmeticException("age not valid");
			
		}
		
		
		
	}
	
}
