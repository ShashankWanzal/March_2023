package constructor;

public class Demo9
{

 	 int a;
	
	 Demo9()
	{
		
		a=10;
		System.out.println("1st constructor"+a);
		
		
	}
	
	
	
	Demo9(int a)
	{
		
		System.out.println("2nd Constructor  "+a);
		
	}
	
	
	Demo9(int a,int b)
	{
		System.out.println("3rd constructor=> "+(a+b));
		
		
	}
	
	Demo9(int a, int b, int c)
	{
		System.out.println("4th constructor=> "+(a+b+c));
	}
	
	Demo9(int a,int b,int c,int d)
	{
		System.out.println("5th constructor=> "+(a+b+c+d));
		
	}
	
   Demo9(char a,char b)
	{
		System.out.println("6th constructor=> "+(a+b));
	}
	
}
