package oops;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodoverloading ob= new methodoverloading;
ob.substraction();
ob.substraction(20, 15);
ob.substraction(40, 15.5);
System.out.println(c);
	}

}
public void substraction()
{
	int a=20,b=15;
	int c=a-b;
	System.out.println(c);
}
public void substraction(int a,int b )
{
	
	int c=a-b;
	System.out.println("c="-c);
}
public void substraction(int a,double b)
{
	double c=a-b;
	System.out.println("c="-c);
}