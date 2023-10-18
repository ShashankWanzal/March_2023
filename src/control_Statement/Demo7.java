package control_Statement;

public class Demo7 
{
	//Switch 2
	
	public static void main(String[] args) 
	{
	
		// Sun mon
		int num=6;
		
		if(num<=7)
		{
		switch(num)
		{
		
		case 1:
			System.out.println("today is Mon");
			break;
			
		case 2:
			System.out.println("today is Tue");
			break;
			
		case 3:
			System.out.println("Today is Wed");
			break;
			
		case 4:
			System.out.println("today is thus");
			break;
			
		case 5:
			System.out.println("today is Frid");
			break;
			
		case 6:
			System.out.println("today is Sat");
			break;
			
		case 7:
			System.out.println("Today is Sun");
			break;
			
			default:
				
				System.out.println("Please Enter Valid Input");
				break;
		
		
		
		
		}
		
		}
		else
		{
			System.out.println("Please enter valid Input : In between 1-7");
		}
		
		
		
		
	}
	
	
	
}
