package star_Pattern;

public class Pattern3 
{

	
	
	/*
	 
	 *  *  *  * 
	 *  *  *  *
	 *  *  *  *
	 *  *  *  *
	 *  *  *  *
	   
	   10 * 6
	   
	 */
	
	// min =1
	// Max= 5 
	
	
	public static void main(String[] args)
	{
	
		
		for(int i=1;i<=5;i++)  // Row
		{
			
			for(int j=1;j<=4;j++)  // Column   //1+1== 2+1= 3+1= 4+1
			{
				
				System.out.print(" * ");   // Star print     *  *  *  *
							               //                *  *  *  *
			}
			System.out.println();  // Next line
			
			
		}
		
		
		
	}
	
	
	
	
}
