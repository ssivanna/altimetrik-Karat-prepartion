package Test;

public class Repated_String {

	
	public static void main (String args[])
	{
		
		String str="sivanna";
		char ch[]=str.toCharArray();
		
		
		for (int i=0;i<ch.length;i++)
		{   int count=1;
		   for (int j=i+1;j<ch.length;j++)
		   {
			   if(ch[i]==ch[j]&&ch[i]!=' ')
			   {  
				   count ++;
				   ch[j]=' ';
				   
			   }
			  
		   }
		   if(count>1&&ch[i]!=' ')
		   {
		   System.out.println(ch[i] + " " + count);
		   }
		}
	}
}
	
	

