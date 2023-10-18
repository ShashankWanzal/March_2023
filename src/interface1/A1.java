package interface1;

public class A1 implements Demo6,Demo7
{

	
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 is running");
	}


	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 is running");
	}


	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 is running");
	}

	
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 is running");
	}
	
	
	public static void main(String[] args) {
		
		A1 a=new A1();   // A1=> Class name    a-> object name  new-> keyword   A1()-> Constructor 
		
		
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m3(1);
		
		
	}



	public void m3(int a) {
		System.out.println("m3 from demo6");
		
	}

	
	
}
