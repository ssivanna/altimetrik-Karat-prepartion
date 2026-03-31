import java.util.HashSet;

public class Startingandending {
  
	public static void main(String args[])
	{
		String[] str = new String[]{"Alpha", "Beta", "Gama", "Delta", "Alpha", "Beta", "MAM"};
		HashSet<String> hs=new HashSet<>();
		
		for(String word:str)
		{
			if ( Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length() - 1))) {
                hs.add(word);
            }
			
		/*
		 * if ( Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length() - 1))) {
	                uniqueWords.add(word);
	            }
		 * 	 
		 */
			 
			 
		}
		System.out.println(hs);
	}
	
}