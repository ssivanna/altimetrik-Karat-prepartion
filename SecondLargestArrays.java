import java.util.Arrays;

public class SecondLargestArrays {
	
	
	public static void main(String args[])
	{
		int[] arr=new int[] {2,5,9,3,1,6,};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);
		System.out.println("-------approach---------");
	}
   
}
