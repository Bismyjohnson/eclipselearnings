package constructor;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0,r;
		while(n>0)
		{
			r=n%10;
			s=s+r;
			
			n=n/10;
			
		}
		System.out.println(s);

	}

}
