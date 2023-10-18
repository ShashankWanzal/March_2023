package abstract_class;

public class Demo7 extends Demo6
{

	public void m1()
	{
		
		int a = super.a=12;
		
		System.out.println("Bye");
		
		System.out.println(a);
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
	
		
		
		Demo6 d=new Demo7();
		
	
		System.out.println(d.a);
		
		
	}
}
