import java.util.Arrays;

public class Allzeroend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1233090123";
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{  
		if(ch[i]!='0')
		{
			ch[count]=ch[i];
			count++;
		}
		}
		while(count<ch.length)
		{
			ch[count]='0';
			count++;
		}

		
		System.out.println(ch);
	}
	

}
