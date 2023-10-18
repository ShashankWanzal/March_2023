package array;

public class Demo2 
{

	public static void main(String[] args)
	{
	
		String ar[]=new String[6];   
		
		ar[0]="Akash";
		ar[1]="Nikhil";
		ar[2]="Ved";
		ar[3]="Sanket";
		ar[4]="Ankita";      // Homogeneous in nature
	//	ar[5]="Prajakta";
		
		
		// Length
		
		int size = ar.length;
		
		System.out.println(size);
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.println(ar[i]);  //ar[5]   0---> 5
		}
		
		
		System.out.println("---------------------------");
		
		
		for(int i=ar.length-1;i>=0;i--)
		{
			
			System.out.println(ar[i]);  //ar[5]   0---> 5
		}
		
		
		
		
		
		
	}
	
	
	
}
