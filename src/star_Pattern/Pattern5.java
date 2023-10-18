package star_Pattern;

public class Pattern5
{

	
	
	//    *
	//   **
	//  ***
	// ****
	//*****
	
	public static void main(String[] args) 
	{
	
		int space=4;   //--1 3
		int star=1;    //++2
		
		
		for(int i=1;i<=5;i++)   //i=1   2<=5
		{
			
			for(int j=1;j<=space;j++)   //j=1+1   1<=space   5<=3
			{
				System.out.print(" ");  //        
			}
					
			for(int k=1;k<=star;k++)  //k1+1   1<=star   2<=2
			{
				System.out.print("*");  //    *
			}						   //    **
			System.out.println();
			
			space--;
			star++;
			
		}
		
		
		
		//Home Work
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		
		// **********
		//  ********
		//   ******
		//    ****
		//     **
		//     *
		
	}
	
	
	
	
	
	
}
