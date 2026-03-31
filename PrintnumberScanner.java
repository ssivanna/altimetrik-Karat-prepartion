import java.util.*;
public class PrintnumberScanner {
	
	public static void main(String args[])
			{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number of elemetns");
		 int num=sc.nextInt();
		 System.out.println("Enter" +num+ "elemnt");
		 int[] n=new int[num];
		 for(int i=0;i<num;i++)
		 {
			n[i]=sc.nextInt();
		 }
		 System.out.println(Arrays.toString(n));
				
			}

}
