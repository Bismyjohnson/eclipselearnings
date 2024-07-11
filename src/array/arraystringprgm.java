package array;

import java.util.Scanner;

public class arraystringprgm {

	public static void main(String[] args) {
		int[] string=new int[4];
		System.out.println("enter names");
	
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
		string[i]=sc.nextInt();
		}
		System.out.println("enter name");
		for(int i=0;i<4;i++);
		{
			System.out.println(string[i]);
		}
		

	}

}
