package array;

public class Demo1 
{

	
	public static void main(String[] args)
	{
	
		String ar[]=new String[6];   
		
		ar[0]="Akash";
		ar[1]="Nikhil";
		ar[2]="Ved";
		ar[3]="Sanket";
		ar[4]="Ankita";      // Homogeneous in nature
	//	ar[5]="Prajakta";   // Fix 
		
		System.out.println(ar[3]);
		
		
		System.out.println(ar.length);
		
		System.out.println("----Print array ");
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.println(ar[i]);  //ar[5]   0---> 5
		}
		
		
		
		
		
		
	}
	
}
