package com.day1;
import java.util.Scanner;

public class AverageCalculater {
 public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 // Prompt the user to enter the first number
	 System.out.print("Enter the first number:");
	 double num1=scanner.nextDouble();
	 //prompt the user to enter the second number
	 System.out.print("Enter the second number:");
	 double num2=scanner.nextDouble();
	 //calculate the average
	 double average=(num1+num2)/2;
	 //print the result
	 System.out.println("The average of"+num1+"and"+num2+"is:"+average);
	 //close the scanner
	 scanner.close();
	
}

}
