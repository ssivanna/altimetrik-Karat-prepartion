import java.util.*;

public class ReadArraysfromuser {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("size of Arrays");
		int size=sc.nextInt();
		System.out.println("Enter " + size + "Element");
		int[] n=new int[size];
		for(int i=0;i<size;i++)
		{
			n[i]=sc.nextInt();
		}		
		System.out.println("Orizinal Array" +Arrays.toString(n));

		//Arrays.sort(n);
//		////		//System.out.println("Sorted Arrays" + Arrays.toString(n));
				//######################################################
		
		//int[] n=new int[] {2,3,1,9,8};
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				int tmp=0;
				if(n[i]>n[j])
				{
				tmp=n[i];
				n[i]=n[j];
				n[j]=tmp;
				}
			}
			
		}
		System.out.println(Arrays.toString(n));
	}



}


