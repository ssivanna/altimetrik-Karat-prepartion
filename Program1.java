package Pojo;

public class Program1 {
   static double tsalary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee();
		emp1.setid(123);
		emp1.setname("abc");
		emp1.setsalary(1.1);
		
		Employee emp2=new Employee();
		emp2.setid(1234);
		emp2.setname("abcd");
		emp2.setsalary(2.2);
		
		

		Employee emp3=new Employee();
		emp3.setid(1234);
		emp3.setname("abcd");
		emp3.setsalary(3.3);
		
		
		System.out.println("id is : "  + emp1.getid());
		System.out.println("name is " + emp1.getname());
		System.out.println("Salary is " + emp1.getsalary());
		
	  Employee[] employee=new Employee[]{emp1,emp2,emp3};
	  
	  System.out.println(employee);
	   for(Employee r:employee)
	   {
		   System.out.print("id is :" +r.getid()+ " ,");
		   System.out.print("name is :" + r.name+ " ,");
		   System.out.print("salary is : " + r.salary+ " ,");
		   System.out.println();
		    tsalary =tsalary+r.salary;
		   System.out.println("Total Salary is: " +  tsalary);
		   
	   }
			  
		
	}

}
