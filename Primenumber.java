package Pojo;

public class Primenumber {
	
	public static void main(String[] args)
	{
		int[] numbers = {6, 9, 3, 2, 7};
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println("evn :" + numbers[i]);
			}
			else 
			{
				System.out.println("odd:" + numbers[i]);
			}
		}
	}

}
// {62937}
