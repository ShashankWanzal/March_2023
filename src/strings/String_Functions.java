package strings;

public class String_Functions
{

	
	public static void main(String[] args) 
	{

		String a="Vedprasad";  
		
		String b="VEDPRASAD";
		
		String c="Ved";
		
		String d="it always seems impossible until it is done";
		String e="abc abc ads awq asx azs abc ";
		
		
		//1. Length => It shows the length of String, Return type of this fn is integer
		
		int length = a.length();   // int variable =fun call; 
		
		System.out.println(length);
		
									//System.out.println(a.length());
		
		//2. toUppercase=> By using this fn we can convert entire string into capital case 
		
		System.out.println(a.toUpperCase());
		
		//3. toLowercase=> By using this fn we can convert entire string into small case 
		
		System.out.println(b.toLowerCase());
		
		//4. Ends With => This fn show whether string is end with 'aaa' this particular character ,Return type of this fn is boolean
		
		boolean result = a.endsWith("d");   // This fn is case sensitive 
		
		System.out.println(result);
		
		//5. Start With => This fn show whether string is Start with 'aaa' this particular character , Return type of this fn is boolean
		
		boolean result1 = a.startsWith("V");  // This fn is case sensitive 
		
		System.out.println(result1);
		
		System.out.println("--------------------");
		
		
		//6. Equal=> This fn is used to compare two string at the same type ,Return type of this fn is boolean ,This fn is case sensitive 
	
		boolean eqresult = a.equals(b);
		
		System.out.println(eqresult);
		
		//7. Equal Ignore Case=> This fn is used to compare two string at the same type ,Return type of this fn is boolean ,This fn is not case sensitive 
		
		boolean eqresult1 = a.equalsIgnoreCase(b);
		
		System.out.println(eqresult1);
		
		System.out.println(a.equalsIgnoreCase(b));
		
		//8. Replace => We can replace any character of the string ,This changes are temp
		
		
		System.out.println(a.replace("V", "A"));  //Vedprasad ---> Aedprasad
		
		System.out.println(a);
		
		String news = a.replace("e", "i");  //
		
		System.out.println(news);  //Vedprasad ---> Vidprasad
		
		System.out.println("--------------------");
		
		System.out.println(d.replaceAll("it", "a")); //replaceAll-> this is use to replace specific word 
		
		System.out.println(e.replaceAll("abc", "Hi"));
		
		System.out.println("---------------------");
		 
		System.out.println(d.replaceFirst("it", "is")); // Replacefirst -> this is use to replace first word of the string 
		
		System.out.println(e.replaceFirst("abc", "xyz"));
		
		
		
		
		
	}
	
	
}
