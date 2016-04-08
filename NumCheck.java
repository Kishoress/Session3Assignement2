package PrimeNumCheck;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number for check:");
		
		int num=scan.nextInt();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println(num + " is Prime Number");
		else
		   System.out.println(num + " is not Prime Number");

	}

}
