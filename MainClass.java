
public class MainClass {

	public static void main(String[] args) {
		
	  String[] str=new String[] { "Alpha" ,"Beta","Gama","Delta","Alpha" ,"Beta","MAM" };
	    
	  String[] str2= {"A","B"};
	  
	  for(int i=0;i<str.length;i++)
	  {  
		  int count=1;
		// System.out.println(str[i]);
	   for(int j=i+1;j<str.length;j++)	 
	   {
		   if(str[i]==str[j]&& str[i]!=" ")
		   {
			  count++; 
			  str[j]=" ";
		   }
	   }
	   if(count>1&&str[i]!=" ")
	   {
		   System.out.println( str[i] + " " + count);
	   }
	  }
	
	

	}

}











