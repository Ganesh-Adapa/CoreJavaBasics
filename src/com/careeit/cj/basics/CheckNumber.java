package com.careeit.cj.basics;

import java.util.Scanner;

//Accept integer value from the user and if the number is -ve convert to +ve and display the same.
public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num = sc.nextInt();
		if (num < 0) {
			num = -num;
		}

		System.out.println(num);
		sc.close();
	}
}
