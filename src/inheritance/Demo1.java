package inheritance;

public class Demo1
{

	
	public static void main(String[] args)
	{
	
	
		Son1 a=new Son1();
		
		a.money();
		a.car();
		a.mobile();
		a.home();
		
		System.out.println("=============================");
		
		Nikhil n=new Nikhil();
		
		n.Automation();
		n.DB();
		n.manual();
		n.Unix();
		
		System.out.println("===============================");  //70%
		
		Son_2 s=new Son_2();
		s.car();
		s.home();
		s.mobile();
		s.money();
		s.laptop();
		
		System.out.println("===========================");
		
		Son2 z=new Son2();
		z.car();
		z.home();
		z.money();
		
		
		
	}
	
	
}
