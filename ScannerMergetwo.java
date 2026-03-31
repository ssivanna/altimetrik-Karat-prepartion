import java.util.Arrays;
import java.util.Scanner;

public class ScannerMergetwo {

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Print max of number");
		int n=sc.nextInt();
		System.out.println("Enter " + n + "Element");
		int[] num=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Original Orray is" + Arrays.toString(num));

		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{    int tmp;
			if(num[i]<num[j])
			{
				tmp=num[i];
				num[i]=num[j];
				num[j]=tmp;
			}
			}
			
		}
		System.out.println(Arrays.toString(num));


	}

}
