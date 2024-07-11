package METHOD;

import java.util.Scanner;

import controlstatements.scannerprgm;

public class vowel {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner  sc=new Scanner(System.in);
		String S=sc.next();
	vowel V=new vowel();
		V.vowelcount(S);
	}
	public void vowelcount(String S)
	{
		int count=0;
		for(int i=0;i<S. length();i++)
		{
			if(S.charAt(i)=='a')//(S.charat(i)=='e')//s.charat(i)=='i'//s.chart(i)=='o'//s.charat(i)=='u')
				{
						count++;
						
				}
		}
		System.out.println("vowel count="+count);
		

	}

}
