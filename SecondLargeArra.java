import java.util.Arrays;

public class SecondLargeArra {

	public static void main(String args[])
	{
		int a[]=new int[] {9,4,5,8,2,7};
		int max=a.length;
		System.out.println(second(a,6));
		
	}

	public static int second(int a[],int max)
	{  int tmp;
      for(int i=0;i<max;i++)
      {
    	  for(int j=i+0;j<max;j++)
    	  {  
    		  if(a[i]<a[j])
    		  {
    			  tmp=a[i];
    			  a[i]=a[j];
    			  a[j]=tmp;
    		  }
    		  
    	  }
      }
		System.out.println(Arrays.toString(a));
		return a[max-2];
	}
}



