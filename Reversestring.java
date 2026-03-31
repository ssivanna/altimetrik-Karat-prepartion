import java.util.Arrays;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="welcome to java world";
         String str2[]= str.split(" ");
         
         System.out.println(Arrays.toString(str2));
         
         for(int i=str2.length-1;i>=0;i--)
         {
        	 System.out.print(str2[i]+ " ");
         }
        
         
         
	}

}
