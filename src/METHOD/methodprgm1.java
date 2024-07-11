package METHOD;

public class methodprgm1 {

	public static void main(String[] args) {
		methodprgm1 ob=new methodprgm1();
		ob.add();
		int value =ob.sub();
		System.out.println("substraction="+value);
		ob.mul(20,30);
		double v=ob.div(30,2);
		System.out.println("division="+v);

	}
	public void add()
	{
		int a=34,b=40,c;
		c=a+b;
		System.out.println(c);	
		}
public int sub()
{
	int a=34,b=40,c;
	c=a+b;
	return c;
}
public void mul(int a,int b)
{
	int c=a*b;
	System.out.println("multiplication="+c);
}
public double div(int a,int b)
{
	double c=a/b;
	return c;
}
}
