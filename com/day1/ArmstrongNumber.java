package com.day1;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 

		// Prompt the user to enter a number

		 System.out.print("Enter a number: "); 
		int number = scanner.nextInt();
		int originalNumber,remainder,result=0,n=0;
		originalNumber=number;
		while(originalNumber!=0)
		{
			originalNumber/=10;++n;
		}
		originalNumber=number;
		while(originalNumber!=0)
		{
			remainder=originalNumber%10;
			result+=Math.pow(remainder,n);
			originalNumber/=10;
		}
		if(result==number)
			System.out.println(number+"is an Armstrong.");
		else System.out.println(number+"is not an Armstrong number");
		scanner.close();
			
		}


	}


