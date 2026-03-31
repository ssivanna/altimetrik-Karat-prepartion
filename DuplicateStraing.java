import java.util.Arrays;

public class DuplicateStraing {

	public static void main(String args[])
	{
		String[] str = new String[]{"Alpha", "Beta","Beta", "Gama", "Delta", "Alpha", "Beta", "MAM"};
		
		for(int i=0;i<str.length;i++)
		{    int count=0;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j]&&str[i]!=" ")
				{
					count++;
					str[j]=" ";
				}
			}
			//System.out.println(Arrays.toString(str));
			if(count>=1)
			if(count<str.length&&str[i]!=" ")
			{
				System.out.println(str[i] +"-->" + count);
			}
		}
	}
}
