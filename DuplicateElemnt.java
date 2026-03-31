
public class DuplicateElemnt {

	public static void main(String args[])
	{
		int a[]=new int[] {1,3,3,4,5,2,3,4,5,5};

		for(int i=0;i<a.length;i++)
		{   int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j]&& a[i]!=' ')
			{
				//a[count]=a[i]	;

				count++;
				a[j]=' ';
				System.out.print(a[i]);	

			}


		}
		if(count>1&& a[i]!=' ')
		{
			System.out.println( a[i] + "-> " + count);
		}
		}



	}

}
