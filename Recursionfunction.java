
public class Recursionfunction {
	
	public static void main(String args[])
	{
		method(1);
	
	}
	
	
	public static void method(int n)
	
	{
		if(n<=5)
		{
		 //n++;
		System.out.println(n);
		method(n+1);
		}
	}
	

}
