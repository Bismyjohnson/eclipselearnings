package oops;
class member
{
	String name;
	int age;
	String phonenumber;
	String address;
	int salary;
	public void printdetails()
	{
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phonenumber="+phonenumber);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		
	}
}
class employee extends member
{
	
	
		
		String specification;
	}

class manager extends member
{
	String department;
}


	
	
	
	


public class inheritanceprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee ob=new employee();
ob.name="arjun";
ob.age=24;
ob.phonenumber="8765498881";
ob.address="abcd";
ob.salary=40000;
ob.printdetails();
System.out.println(ob.specification="development");
	}

}
