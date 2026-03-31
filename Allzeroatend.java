package Pojo;

public class Allzeroatend {
	
	public static void main(String args[])
	{
		int [] values ={2,0,3,0,4,5,0,77,88,0,99,0,603,607};
		 int count=0;
		for (int i=0;i<values.length;i++)
		{
			//System.out.print(values[i]);
			if(values[i]!=0)
			{
				//System.out.print(values[i] + " ,");
				values[count]= values[i];
				System.out.print(values[i] + " ,");
				count++;
			}
			
		}
		System.out.println();
			while(count<values.length)
			{
				values[count]=0;
				count++;
				
			}
			
			for (int i=0;i<values.length;i++)
			{
				System.out.print(values[i] + ",");
			}
		}
		
	}


