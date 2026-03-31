import java.util.Arrays;

public class SecondLargestnumber {
	
	public static void main(String args[])
	{
		int[] num=new int[] {3,5,1,3,8,5};
		
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				int tmp=0;
				if(num[i]>num[j])
				{
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
			
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num[num.length-2]);
	}

}
