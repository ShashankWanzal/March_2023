package loop;

public class Demo13
{

	
	static int value=103;
	
	static int abc=120;
	
	int value1=12;
	
	
	public static void a()
	{
		
		
		System.out.println(value);
		
		
		
	}
	
	public void a2()
	{
		System.out.println(value1);
		System.out.println(value);
	}
	
	
	public static void main(String[] args)
	{
	
		
		System.out.println(value);
		a();
		Demo13 a1=new Demo13();
		a1.a2();
		
		int as = a1.value1;
	System.out.println(as);
		
		
	}
	
	
	
}
