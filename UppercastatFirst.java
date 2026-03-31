
public class UppercastatFirst {

	public static void main(String args[])
	{
		String str="welcom to Bangalore";
		
		String[] str2=str.split(" ");
		String finalstatement=" ";
		
		for(String str3:str2)
		{   
			char[] ch=str3.toCharArray(); //welcome
			
			  char c =ch[0];
			String fc=String.valueOf(c).toUpperCase();
			//System.out.print(str3 + " ");
			String cfc=fc;
			for(int i=1;i<ch.length;i++)
			{
			cfc=cfc + ch[i];
			}
			
			finalstatement=finalstatement+cfc+" ";
		}
		
		System.out.println(finalstatement);
		
	}
	
	
}
