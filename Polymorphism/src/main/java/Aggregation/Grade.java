package Aggregation;

public class Grade {
	float mark1,mark2,mark3;
	Student_A student_a;
	
	Grade(float mark1,float mark2,float mark3,Student_A student_a)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.student_a=student_a;
	}
	public void std()
	{
		System.out.println(mark1);
		System.out.println(mark2);
		System.out.println(mark3);
		System.out.println(student_a.name);
		System.out.println(student_a.age);
		System.out.println(student_a.cls);
		
	}
	
	
	public static void main(String[] args) {
		Student_A s1=new Student_A("appu",5,"ukg");
Grade obj=new Grade(50.0f,46.8f,39.9f,s1);
obj.std();
	}

}
