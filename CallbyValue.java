
public class CallbyValue {
	
 
	public static void main(String args[])
	{
		
	  int r1=10;
	  method(r1);
	  System.out.println(r1);
	}
	
	public static void method(int r2)
	{
	  r2=20;
	  System.out.println(r2);
	}

}

