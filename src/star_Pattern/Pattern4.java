package star_Pattern;

public class Pattern4
{

	/*
	 * 
	 * * 
	 * * *  
	 * * * * 
	 * * * * *  
	 */
	
	
	// Min =1
	// Max= 5
	
	
	public static void main(String[] args)
	{
	
		
		int star=1;   //1+1  =2+1=3+1 =4 +1= 5+1= 6
		
		for(int i=1;i<=5;i++)  //row  i=3+1=4+1=5+1  =6<=5
		{
			
			for(int j=1;j<=star;j++)  // columnm   Star =5    6<=5     
			{
				
				
				System.out.print("* ");    //* * * * * 
			
				
				
			}
			
			System.out.println();    //
			
			star++;
			
			
		}
		
		System.out.println(star);
		
		
		
		
	}
	
	
}


  /*
   * * * * *
   * * * * 
   * * *
   * *     Homework
   * 
   */

		
		




