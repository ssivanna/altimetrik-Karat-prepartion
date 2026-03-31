package Pojo;

public class test {

	
	public static void main(String args[])
	{
		String str1="Scaler";  
		String str2="Scaler";  
			       String str3=new String("Scaler");  
			       System.out.println(str1==str2);   // true 
			     System.out.println(str1==str3);  // false
			     System.out.println(str2==str3);  // false
			      System.out.println(str1.equals(str3));  // true 
	}
}
