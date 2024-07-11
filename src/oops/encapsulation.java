package oops;
class employees
{
	private String empname;
	private int emp;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmp() {
		return emp;
	}
	public void setEmp(int emp) {
		this.emp = emp;
	}
	
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employees ob=new employees();
ob.setEmpname("arun");
ob.setEmp(101);
System.out.println(ob.getEmp());
System.out.println(ob.getEmpname());
	}

}
