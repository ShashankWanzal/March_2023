package casting;

public class UpCasting
{

	
	public static void main(String[] args)
	{
	
		// Will create Object of sub class with ref of Super class 
		
		Father s=new Son();
		
		s.money();
		System.out.println("============================================");
		
		
		
		Demo1 d=new Demo2();
		
		d.m1();
		
		

	}
	
	
}
