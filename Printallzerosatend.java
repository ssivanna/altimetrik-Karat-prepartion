import java.util.Arrays;

public class Printallzerosatend {

	public static void main(String args[])
	{
		int[] num= new int[] {0,5,6,0,1,3,0,3,7};
		int count=0;
		for(int i=0;i<num.length;i++)
		{    
			if(num[i]>0)
			{
				
				num[count]=num[i];
				count++;
				
				
			//	System.out.print(num[count] + " , ");
			}
			
		}
		//System.out.print(Arrays.toString(num));
	   while(count<num.length)
		{
		num[count]=0;
			count++;
		}

		System.out.println(Arrays.toString(num));
	}
}
