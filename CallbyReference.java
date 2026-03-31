
public class CallbyReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bclass b=new Bclass();
		b.lenght=20;
		System.out.println(b.lenght);
		method(b);
		System.out.println(b.lenght);


	} 
	public static void method(Bclass b1)
	{
		b1.lenght=50;
		System.out.println(b1.lenght);

	}

}

class Bclass
{   
	int lenght;
	int breath;
}


