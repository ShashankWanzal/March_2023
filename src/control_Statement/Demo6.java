package control_Statement;

public class Demo6 
{

	//switch
	
	// Money Transfer
	// mini statement
	// Money Withdraw 
	// pin change 
	// balance check
	//
	
	public static void main(String[] args)
	{
	
		
		String option ="CB";
		
		
		switch(option)
		{
		
		
		case "MS":
			System.out.println("Mini Statement");
			break;
			
		case "MT":
			System.out.println("Money Transfer");
			break;
			
		case "CW":
			System.out.println("Cash Withdraw");
			break;
			
		case "PC":
			System.out.println("Pin Change");
			break;
			
		case "CB":
			System.out.println("Balance check");
			break;
			
		default :
			System.out.println("please enter valid input");
			break;
		
		
		}
		
		
		
		
		
		
		
	}
	
	
	
}
