package oops;
interface car1
{
	public void acceleration();
	public void speedlimit();
}
class maruthi implements car1
{

	@Override
	public void acceleration() {
		System.out.println("maruthi acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("maruthi speedlimit");
		
	}
	
}
class suzuki implements car1
{

	@Override
	public void acceleration() {
	System.out.println("suzuki acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("suzuki speedlimit");
		
	}
	
}
public class interfaceprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
maruthi ob=new maruthi();
ob.acceleration();
ob.speedlimit();
suzuki ob1=new suzuki();
ob1.acceleration();
ob1.speedlimit();
	}

}
