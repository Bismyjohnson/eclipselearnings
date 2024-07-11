package METHOD;

public class area {

	public static void main(String[] args) {
		area ob=new area();
		ob.rectangle();
		double v=ob.circle(3.14, 6, 4);
		System.out.println("circle="+v);
		double value=ob.triangle(0.5, 5, 6);
		System.out.println("triangle="+value);
		ob.square(14, 14);

	}
	public void rectangle()
	{
		int a=8,b=5,c;
		c=a*b;
		System.out.println(c);
	}
	public double circle(double a,int b,int d)
	{
		double c=a*b*d;
		return c;
	}
	public double  triangle(double a,int b,int d)
	{
		  
		
		 double c=a*b*d;
		return c;
	}
	public void square(int a,int b)
	{
		int c=a*b;
		System.out.println("square="+c);
	}

}
