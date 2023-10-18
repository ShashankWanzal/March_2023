package strings;

public class String_Function2 
{

	public static void main(String[] args)
	{
	
		String a="Vedprasad";  
		
		String b="VEDPRASAD";
		
		String c="Ved";
		
		String d="it always seems impossible until it is done";
		String e="abc abc ads awq asx azs abc ";
		
		
		// 9. SubString => It return character/parts of the string based on index value 

		
		System.out.println(a.substring(2));
		
		System.out.println(a.substring(4));
		
		System.out.println(a.substring(2, 6));
		
		System.out.println(a.substring(3, 7));
		
		// 10. Concatenation => it is used to connect word/character to the particular string
		
		
		String ved = a.concat(" Thakare");
		
		System.out.println(ved);

		System.out.println(a+b);
	
		
		//11. Find Character => by using this fn we can find the particular character present on that index, return type of this fn is char 
		
		System.out.println(a.charAt(2));
		
		System.out.println(a.charAt(5));
		
		char ab = a.charAt(8);
		
		System.out.println(ab);
		
		
		//12. Index of =>  By using this fn we will get index value by providing the character, return type of this fn is integer 
		// compiler will check from starting index   '---->'  like this
		
		
		System.out.println(a.indexOf('a'));
		
		System.out.println("d=>"+a.indexOf('d'));
		
		int nn = a.indexOf('p');
		
		System.out.println(nn);
		
		//13. Last index of=> By using this fn we will get index value by providing the character, return type of this fn is integer 
		// compiler will check from End index   '<----'  like this
		
		
		System.out.println("d=>"+a.lastIndexOf('d'));
		
		System.out.println(a.lastIndexOf('a'));
		
		// 14. Contains => It checks whether string is  containing specific sequence of character or not.
		// return type of this fn is boolean 
		
		System.out.println(a.contains(c));  // a is containing  "Ved"  => true
		
		// 15. Split => It is used to split the string as per the requirement
		// Return type is  array 
		
		System.out.println("--------------------");
		
		String ar[]=d.split(" ");  // String of array 
		
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		//System.out.println(ar[7]);
		

		
	}
	
	
	
}
