package com.careeit.cj.basics.forloop;

import java.util.Scanner;
//The number which is divisalble one and itself called as by prime

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n value : ");
		int n = sc.nextInt();
		//print factors of n
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n % i ==0) {
				System.out.print(i +" ");
				count += 1;
			}
			
			
		}
		
		
		//effective solution
		/*boolean isPrime = true;
		for(int i=2;i<=n/2;i++) {
			if(n % i ==0) {
				isPrime = false;
				break;
			}
			
			
		}
		
		if(isPrime) {
			System.out.println("\n " + n +"n is prime");
		}else {
			System.out.println("\n " + n +"n is not a prime");
		}*/
		
		
		if(count == 2) {
			System.out.println("\n " + n +"n is prime");
		}else {
			System.out.println("\n " + n +"n is not a prime");
		}
		
		
		sc.close();
	}

}
