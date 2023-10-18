package control_Statement;

public class Demo4
{

	//Nested if 
	
	public static void main(String[] args)
	{
	
		String UN="abc";
		String Pass="xyz";
		
		 
		if(UN=="abc")   //  ==      a==A
		{
			
			System.out.println("Correct UN");
			
			if(Pass=="xyz")
			{
				System.out.println("Correct Password");
				System.out.println("Login is sucessfull");
				
			}
			else 
			{
				System.out.println("Wrong Password");
				System.out.println("Login is failed");
			}
	
		}
		
		else
		{
			System.out.println("Wrong username");
			System.out.println("Login is failed");
		}
		
		
		
		
		
	}
	
	
	
	
	
}
