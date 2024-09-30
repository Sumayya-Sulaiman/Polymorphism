package polyprgms;

public class Salaryy {
	String name;
	int age;
	float salary;
	public  Salaryy(String name,int age,float salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
	
		
	}
public void emp()
{
System.out.println(name);
System.out.println(age);
System.out.println(salary);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Salaryy obj=new Salaryy("akku",13,689.0f);
obj.emp();
	
	
	}

}
