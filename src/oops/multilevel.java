package oops;

class father
{
	public void fathermethod()
	{
		System.out.println("father");
	}
}
class son extends father
{
	public void sonmethod()
	{
		System.out.println("son");
	}
}
class grandson extends son
{
	
	public void grandsonmethod()
	{
		System.out.println("grandson");
	}
}

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
grandson ob=new grandson();

ob.grandsonmethod();
ob.sonmethod();
ob.
ob.grandsonmethod();
	}

}
