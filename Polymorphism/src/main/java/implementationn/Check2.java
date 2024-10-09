package implementationn;

public class Check2 implements InterA,InterB

{
public void sam()
{
	System.out.println("good");
	
}
public void show()
{
	System.out.println("morning");
	
}
public void display()
{
	System.out.println("afternoon");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check2 obj=new Check2();
		obj.sam();
		obj.show();
		obj.display();
		}

}
