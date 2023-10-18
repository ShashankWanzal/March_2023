package loop;

public class Demo4 
{
	
	/* 1   7
	 *     6
	 * 2   5
	 * 3   4
	 * 4   3
	 * 5   2
	 * 6   1
	 * 7
	 */

		// 100     --------->    1        i>=1  i--   //i-1 100-1=99 -1=98-1=97
		// 1          ------>    100     i=1    i++   //i+1 1+1=2
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		
		for(int i=100;i>=1;i--)   //i--   100-1=99    1-1=0
		{
			
			System.out.println(i);
			//Thread.sleep(500);
		}
		
		
		
	}
		
}
