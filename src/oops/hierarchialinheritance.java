package oops;
class animal
{
	public void animalmethod()
	{
		System.out.println("animalmethod");
	}
}
class tiger extends animal
{
	public void tigermethod()
	{
		System.out.println("tigermethod");
	}
}
class lion extends animal
{
	public void lionmethod()
	{
		System.out.println("lionmethod");
	}
}
public class hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tiger t=new tiger();
t.tigermethod();
t.animalmethod();
lion l=new lion();
l.animalmethod();
l.lionmethod();

	}

}
