package com.careeit.cj.basics.forloop;

import java.util.Scanner;

public class GeneratePrimeInRange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the number n value : ");
	//int n = sc.nextInt();
	System.out.println("Enter the number lr value : ");
	int lr = sc.nextInt();
	
	System.out.println("Enter the number ur value : ");
	int ur = sc.nextInt();
	//boolean isPrime = true;
	int count = 0;
	for(int i = lr; i<=ur;i++) {
		boolean isPrime = true;
		for(int j=2;j<=i/2;j++) {
			if(i % j ==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime && i != 1) {
			System.out.println(i);
			count ++;
		}
	}
	System.out.println("Number of primes are " +count);
	/*int num = 10;
	boolean isPrime = true;
	for(int i =2;i<=num/2; i++) {
		if(num % i ==0) {
			isPrime = false;
			break;
		}
	}*/
	
	/*if(isPrime) {
		System.out.println(num);
	}*/
	sc.close();
}
}
