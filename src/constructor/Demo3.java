package constructor;

public class Demo3 
{

	
	
	int a;
	int b;
	int c;
		
	
	//User Define 
	
	public Demo3()
	{
		a=20;
		b=25;
		System.out.println(a+b);
		
	}
	
	// N constructor but Parameter Diff
	
	//User Define With Parameter 
	
	public Demo3(int z, int y)  // 2
	{
		
		a=z;
		b=y;
		System.out.println("first constructor is running => "+(a+b));
	}
	
	
	// User Define With 3 Parameter

	
	public Demo3(int w, int v,int g)  //2 
	{
		a=w;
		b=v;
		c=g;
		System.out.println("Third constructor is running => "+(a+b+c));
	}
	
	public Demo3(float a, char b)
	{
		
		a=12.1f;
		b='A';
		System.out.println("Second constructor is running => "+(a+b));
		
	}
	
	
	
	public static void main(String[] args)
	{
	
		Demo3 a=new Demo3();
		
		Demo3 b=new Demo3(10,20);
		
		Demo3 c=new Demo3(10.1f, 'b');   //Java Support same parameter constructor but data type of that constructor should be different 
		
		
		Demo3 d=new Demo3(1,2,3);
		
	}
	
	
	
}
