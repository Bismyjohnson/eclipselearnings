package oops;

import java.util.Scanner;

interface bank
{
	public void accountdetails();
	public void balance();
	public void withdraw();
	public void deposit();
}
class sbi implements bank
{
Scanner sc=new Scanner(System.in);
static String bankname="sbi";
int balance=1000;
	@Override
	public void accountdetails() {
		System.out.println("enter account number");
		long accountno=sc.nextLong();
		System.out.println("your account number="+accountno+"bank name");
	}

	@Override
	public void balance() {
 System.out.println("balance");
		
	}

	@Override
	public void withdraw() {
		System.out.println("enter your withdrawl amount");
		int wamt=sc.nextInt();
		balance=balance-wamt;
		System.out.println("your final balance="+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("enter your deposit");
	balance+=deposit;
	System.out.println("your final balance="+deposit);
		
	}
	
}

public class interfaceprgm2 {

	public static void main(String[] args) {
		
	
		System.out.println("accountdetails");

	}

}



