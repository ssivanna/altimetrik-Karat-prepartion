
public class Recursivefunction {


	private static void Recursivefunction(int i) {
		if(i<=10)
		{
	   System.out.println(i);
		Recursivefunction(i+1);
		}
	}
	
	
	public static void main(String[] args)
	{
		Recursivefunction(1);
	}


}
