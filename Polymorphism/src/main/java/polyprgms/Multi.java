package polyprgms;

public class Multi {
int a;
int b;
int c;


Multi(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
//int d=a*b*c;
}
public void mul()
{

	
	int d=a*b*c;
	System.out.println(d);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multi obj=new Multi(2,4,3);
obj.mul();
	}

}
