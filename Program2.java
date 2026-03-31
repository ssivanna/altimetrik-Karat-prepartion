package Pojo;

public class Program2 {
	
	public static void main(String[] args)
	{
		//a567gh8k34y9 =567+8+34+9
		
		String str="a567gh8k34y9";
		char[] ch=str.toCharArray();
		   
		for(int i=0;i<ch.length;i++)
		{
		 System.out.println(Character.isDigit(i)) ;
		}
		
		
	}

}
