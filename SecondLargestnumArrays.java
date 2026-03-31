import java.util.Arrays;

public class SecondLargestnumArrays {


	public static void main(String args[])
	{
		int[] num=new int[] {2,9,5,3,8};
		//getSecondLargest(int[] num, 5);
		int max=getSecondLargest(num,5);
		System.out.println(max);  

	}

	

public static int getSecondLargest(int[] num, int total)
{      
	for(int i=0;i<num.length;i++)
	{

		for(int j=i+1;j<num.length;j++)
		{
			int tmp=0;
			if(num[i]<num[j])
			{
				tmp=num[i];
				num[i]=num[j];
				num[j]=tmp;
			}
		}


		//System.out.println(Arrays.toString(num));


	}
	return num[total-2];
}
}










