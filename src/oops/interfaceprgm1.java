package oops;
interface basicanimal
{
	public void eat();
	public void sleep();
}
 class human implements basicanimal
{

	@Override
	public void eat() {
		System.out.println("human eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("human sleep");
		
	}

}
 class monkey
 {
	 public void monkeymethod();
	 {
		 System.out.println("jump,bite");
	 }
 }
 class human1 extends monkey
 {
	 public void humanmethod();
	 {
		 System.out.println("speak");
	 }
 }

	
	


public class interfaceprgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
basicanimal ob=new human();
ob.eat();
ob.sleep();
	}

}
