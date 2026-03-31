
public class Defaultconstructer {

	public static void main(String args[])
	{
		Student st=new Student("ssivanna");
		System.out.println(st.id);
		//System.out.println(st.name);
	}

}
class Student
{
	int id=10;
	String name=" heello ";
	public Student(String name) {
		this.name=name;
		System.out.println(name);
		// TODO Auto-generated constructor stub	  
	}
	public Student()
	{  
		this("Gannavi");
		System.out.println("Default");
	}

}