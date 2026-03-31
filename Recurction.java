
public class Recurction {

	public static void main(String args[])

	{
     main(5);
     
      
	}
	public static void main(int n)
	{    
	   if(n>0)
	   {
		n--;   
	  	main(n);
	  	System.out.println(n);
	   }
	   
	}
	
}
