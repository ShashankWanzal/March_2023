package control_Statement;

public class Demo5 
{

	
	//Nested if 
	
	// if 
	//-> req if 
	
	// Credit card 
	//1. card number 
	//2. Exp date= YY/MM
	//3. CVV 
	
	public static void main(String[] args)
	{
	
		
		int card_number =121314;
		String exp_date="23/05";
		int cvv= 123;
		String name="shashank";
		
		
		
		if(card_number==121314)
		{
			System.out.println("Your card number is correct please enter Exp date");
			
			if(exp_date=="23/05")
			{
				System.out.println("Your Exp Date is correct please enter cvv number");
				
				if(cvv==1233)
				{
					
					System.out.println("Your CVV number is correct, your card is sucessfully validate");
				}
				else 
				{
					System.out.println("Your cvv number  is not correct please enter valid cvv number");
				}
				
			}
			else
			{
				System.out.println("Your Exp Date is not correct please enter valid Exp date");
			}
			
			
			if(name=="shashank")
			{
				System.out.println("Your name is correct");
			}
			
			else
			{
				System.out.println("Please enter valid name");
			}
			
		}
		
		else
		{
			System.out.println("Please Enter Valid card number");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
