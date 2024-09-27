package polyprgms;

public class Fib {
	

	
	static int a=0;
static int b=1;
	static int c;
static 	int n=10;
	

	public static void show() {
		System.out.println(a+" "+b);	
	
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
		
			a=b;
			b=c;
		}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fib obj=new Fib();
obj.show();
		
		}
	

}
