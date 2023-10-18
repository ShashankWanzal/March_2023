package generalization;

public class Common_class
{

	
	public static void main(String[] args)
	{
	
		
		Jio j=new Jio();
		Idea i=new Idea();
		Airtel a=new Airtel();
		
		
		System.out.println("-----------------------Jio->");
		j.calling();
		j.sms();
		j.internet();
		j.newA();
		
		System.out.println("----------------------Idea->");
		i.calling();
		i.sms();
		i.internet();
		i.newB();
		
		System.out.println("----------------------Airtel->");
		a.calling();
		a.sms();
		a.internet();
		a.newC();
		
	}
	
	
}
