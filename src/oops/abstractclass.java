package oops;
abstract class car
{
	abstract public void acceleration();
	abstract public void speedlimit();
	public void carcolour()
	{
		System.out.println("black");
	}
}
class kia extends car
{

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println(" kia speedlimit");
		
	}
	
}
class BMW extends car
{

	@Override
	public void acceleration() {
		System.out.println("BMW acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println(" BMW speedlimit");
		
	}
	
}

public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
kia ob=new kia();
ob.acceleration();
ob.speedlimit();
BMW ob1=new BMW();
ob1.acceleration();
ob1.speedlimit();
	}

}
