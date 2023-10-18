package this_super_keyword;

public class Demo1
{

	 int a=20;

	 
	 
	 public void m1()
	 {
		 
		 int a=10;
		 
		 System.out.println("Value of local variable= "+a);
		 
		 System.out.println("Value of global variable=> "+this.a);
		 
	 }
	 
	 
	 public static void main(String[] args) 
	{
	
		 
		 Demo1 a=new Demo1();
		 
		 a.m1();
		 
		 
	}
	
	
}
