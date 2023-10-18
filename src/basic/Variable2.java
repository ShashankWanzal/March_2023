package basic;  //basic   variable



public class Variable2  //Variable2  variable
{

	
	public static void main(String[]arg)  //main variable 
	{
		
	//	1. Variable declaration (Allocating/Reserving memory) 
	//	2. Variable Initialization(Assigning or Inserting value) 
	//	3. Usage
		
		//Specific student info 
		
		//Roll no,Name,Mob,Grade,Dep,School name
		
		int roll_no;    // Variable Declaration 
		String name;
		int mob_no;
		char grade;                               //'A'  'B'  'C'
		String Dept;
		String college_name;
		String abc=new String("asbc");
		
		//Keywords 
		
		
		////	2. Variable Initialization(Assigning or Inserting value) 
		
		name="abhi";
		mob_no=11111111;
		roll_no=21;
		Dept="Mechanical";
		grade='A';
		college_name="COEP";
		
		System.out.println("Lenght====>"+Dept.length());
		
		// Use
		
		System.out.println(name);
		System.out.println(mob_no);
		System.out.println(roll_no);
		System.out.println(Dept);
		System.out.println(grade);
		System.out.println(college_name);
		
		
		
		
		
	}
	
	
	
}
