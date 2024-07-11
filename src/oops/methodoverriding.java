package oops;
class shape
{
	public void draw()
	{
		System.out.println("draw any shape");
	}
}
class circle extends shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}
	
public class methodoverriding {


	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
circle ob=new circle();
ob.draw();
	}
}
}


