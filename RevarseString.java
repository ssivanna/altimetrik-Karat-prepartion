import java.util.Arrays;

public class RevarseString {


	public static void main(String args[])
	{
		String str="ssivanna";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{   char tmp;
			if(ch[i]>ch[j])
			{
				tmp=ch[i];
				ch[i]=ch[j];
				ch[j]=tmp;
			}
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}
