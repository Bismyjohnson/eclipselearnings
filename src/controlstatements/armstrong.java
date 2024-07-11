package controlstatements;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
 System.out.println("enter a number");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int temp=n;
	
 
 int a=0,r;
	
 while(n>0)
 {
	 r=n%10;
	 a=a+r*r*r;
	 n=n/10;
 }
 if(temp==a)
 {
	 System.out.println("armstrong number");
	 
	 
 }
 else
 {
 System.out.println("no armstrong number");
 
 }
	}
}

		


