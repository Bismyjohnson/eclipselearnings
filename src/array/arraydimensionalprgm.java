package array;

import java.util.Scanner;

public class arraydimensionalprgm {

	public static void main(String[] args) {
 int[] ar=new int[3];
 System.out.println("enter number");
 Scanner sc=new Scanner(System.in);
 
 
 
 for (int i=0;i<3;i++)
 {
	 ar[i]=sc.nextInt();
 }
	 System.out.println("enter number:");
	 for(int i=0;i<3;i++)
	 {
		 
	 
	 System.out.println(ar[i]);
 }

	}
}


