package Aggregation;

public class Employee {
	int id;
	String name;
	Details details;
	
	Employee(int id,String name,Details details)
	{
		this.id=id;
		this.name=name;
this.details=details;
	}
	public void emp()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(details.city);
		System.out.println(details.state);
		System.out.println(details.country);
	}

	public static void main(String[] args) {
		
		Details d1=new Details("tvm","kerala","india");
		Employee obj=new Employee(1060,"appu",d1);
		obj.emp();
		
	}

}
