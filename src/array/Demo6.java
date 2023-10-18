package array;

public class Demo6 
{

	
	public static void main(String[] args)
	{
	
		
		int ar[][]=new int[2][2];
		
		
		ar[0][0]=15;
		ar[0][1]=11;
		ar[1][0]=12;
		ar[1][1]=13;
		
		
		System.out.println("Reverse");
		
		for(int i=0;i<=1;i++)
		{
			
			for(int j=0;j<=1;j++)
			{
				
				int sum=0;
				int num =ar[i][j];    
				while(num>0)
				{
					int rem = num%10;   
					sum=sum*10+rem;     
					num=num/10;
					
				}
				ar[i][j]=sum;
			}
	
		}

		for(int i=0;i<=1;i++)
		{
			
			for(int j=0;j<=1;j++)
			{
				
				System.out.print(ar[i][j]+" ");
			}
			
			System.out.println();
			
			
		}
		
		
		
	}
	
	
}
