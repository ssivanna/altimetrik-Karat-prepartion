import java.util.Arrays;

public class Testclass2 {
	
	public static void main(String args[])
	{
		String str="Hello world";
		int[] n=new int[128];
		
		for(int i=0;i<str.length();i++)
		{
			char c=Character.toLowerCase(str.charAt(i));
			  n[c]++;
			
		}
		System.out.println(Arrays.toString(n));
		
	}

}
