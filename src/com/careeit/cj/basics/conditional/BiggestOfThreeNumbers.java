package com.careeit.cj.basics.conditional;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		// int big = a>b && b>c && ?b:c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		System.out.println("Enter the num3");
		int num3 = sc.nextInt();
        
		
		/*if (num1 > num2) {
			System.out.println("num1 is big :"+num1);
		} else {
			System.out.println("num2 is big:"+num2);
		}*/
		
		
		//By using Ternary operator
		//int big =  num1 > num2 ? num1 :num2
		
		//int big = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3
		int big = 0;
		if(num1 == num2 && num2 == num3) {
			System.out.println("All are equal");
		}
		 if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is big :"+num1);
		} else if(num2 > num3) {
			System.out.println("num2 is big:"+num2);
		} else {
			System.out.println("num3 is big:"+num3);
		}
		System.out.printf("The biggest of(%d, %d, %d) = %d", num1,num2,num3,big);
		//System.out.printf("The biggest of(%d, %d, %d) = %d", num1,num2,num3,big)
		
       sc.close();
	}

}
