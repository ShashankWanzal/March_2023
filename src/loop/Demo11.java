package loop;

public class Demo11
{
	
	public static int abc=10;
	
	
	public static void a()
	{
		
		//int abc;  //abc is a local variable 
		
		abc=10;
		System.out.println("abc value from static method=> "+abc);
	
	}
	
	
	public static void main(String[] args)
	{
	
		
		int an;
		
		for (int i=1;i<=10;i++)  // i local variable 
		{
			
			System.out.println(i);
			
		}
		
		int i=10;
		a();
		System.out.println(i);
		
		abc=11;
		
		//int abc=12;
		
		System.out.println("abc value from main method=> "+abc);
		
		
	}
	

	
	

	
}
