import java.util.HashSet;

public class StartignEndingsame {
	
	public static void main(String args[])
	{
		 String[] str = new String[]{"Alpha", "Beta", "Gama", "Delta", "Alpha", "Beta", "MAM"};
		 method(str);
	}

	public static void method(String[] ele )
	{
		HashSet<String> has=new HashSet<>();
		for(String word:ele)
		{
			if ( Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length() - 1))) {
                 has.add(word);
            }
		}
		//if ( Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length() - 1))) {
        //uniqueWords.add(word);
    
		//
		//
		//
		
		for(String unique: has)
		{
			System.out.println(unique);
		}
			
	}
	
	
}
