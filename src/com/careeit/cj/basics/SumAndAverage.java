package com.careeit.cj.basics;
import java.lang.*;
import java.util.Scanner;

/**
 * @author Ganesh
 * 
 *         Program accept three numbers from the user, finds sum and average
 *
 */

public class SumAndAverage {
	
	/* Main method,which accepts the input (3 integers) from user 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		num1 = sc.nextInt();
		System.out.println("Enter the num2");
		num2 =sc.nextInt();
		System.out.println("Enter the num3");
		num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		float avg = sum/(float)3; // Converting 3 to 3.0f
		System.out.printf("Sum of %d,%d and %d = %d", num1,num2,num3,sum);
		System.out.printf("\nAvg of %d,%d and %d = %f", num1,num2,num3,avg);
		sc.close();
		
	}

}
