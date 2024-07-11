package oops;
class vehicle
{
	public void drivemethod()
	{
		System.out.println("drivemethod");
	}
}
class car extends vehicle
{

	@Override
	public void drivemethod() {
		System.out.println("repairing a car");
		super.drivemethod();
	}
	
}

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car ob=new car();
ob.drivemethod();
	}

}
