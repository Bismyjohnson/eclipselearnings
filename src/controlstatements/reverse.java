package controlstatements;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int reverse=0,rem;
while (n>0)
{
	rem=n%10;
	reverse=reverse*10+rem;
	n=n/10;
}
System.out.println(reverse);
	}
	System.out.println("reverse=n");

}
