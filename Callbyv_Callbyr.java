package Test;

public class Callbyv_Callbyr {
	int a;
	 void m1(Callbyv_Callbyr cl)
	 {
		 cl.a=cl.a+10;
		 System.out.println("inside method" + a);
	 }
	

	public static void main (String args[])
	{
		
		Callbyv_Callbyr cl=new Callbyv_Callbyr();
		cl.a=50;
		cl.m1(cl);
		
		System.out.println(cl.a);
		
		
		 
		 
	}
	
	
}
