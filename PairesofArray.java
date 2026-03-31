package Pojo;

public class PairesofArray {
	
	
	public static void main(String args[]) {
		
		//Example : nums = [3,6,12,4] , target = 15
		//output : 0,2
		
		int[] num=new int[] { 3,6,12,4 };
		
		 for(int i=0;i<num.length;i++)
		 {
			 int target = 15;
			for(int j=1;j<num.length;j++)
			{
				if(num[i]+num[j]==15)
				{
				 System.out.print( i);
				 System.out.print(j );
				}
			}
		 }
	}

}
