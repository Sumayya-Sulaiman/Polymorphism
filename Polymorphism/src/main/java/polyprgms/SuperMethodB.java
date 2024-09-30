package polyprgms;

public class SuperMethodB extends SuperMethod
{
public void dis()
{
	super.dis();
	System.out.println("hellooo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SuperMethodB obj=new  SuperMethodB();
		 obj.dis();
	}

}
