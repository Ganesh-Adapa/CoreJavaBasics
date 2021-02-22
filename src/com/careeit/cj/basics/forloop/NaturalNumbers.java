package com.careeit.cj.basics.forloop;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n value : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			//System.out.println("Print n numbers " +i);
			System.out.print(i+" ");
			sum += i;
			
		}
		//print even numbers
		/*for(int i=2; i<=n; i=i+2) {
			System.out.print(i +" ");
		}*/
		
		//print odd numbers
		/*for(int i=1;i<=n;i=i+2) {
			System.out.print(i +" ");
		}*/
		//int sum = (n * (n + 1))/2;
		System.out.println("\n The sum of n numbers " +sum);
		sc.close();
	
	}

}
