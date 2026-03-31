
public class Testclass123 {

	//[0,2,1,4,0,0]
	//[0,0,0,2,1,4]

	public static void main(String args[])
	{
		int[] a= {0,2,1,4,0,0};
		int count=0;
		int n=a.length;
		for(int i=0;i<n;i++)
		{  
			if(a[i]!=0)
			{  
				//a[count++]=a[i];
				//System.out.println();
			}

		}
		while(count<n)
		{
			a[count++]=0;
		}


		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}
}






