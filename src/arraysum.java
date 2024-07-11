import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) {
	int []ab=new int[3];
	
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
	int sum=0;
	for(int i=0;i<3;i++)
	{
      ab[i]=sc.nextInt();
      sum=sum+ab[i];
	}
	System.out.println("sum="+sum);
	
	

	for(String v:ab)
	{
		System.out.println(v);
	}

}
}
