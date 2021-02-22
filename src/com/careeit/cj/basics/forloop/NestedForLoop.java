package com.careeit.cj.basics.forloop;

import java.util.Scanner;

public class NestedForLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number n value : ");
	int n = sc.nextInt();
	
	/*for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}*/
	
	/*for(int i=n;i>=1;i--) {
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
		System.out.println();
	}*/
	
	/*for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}*/
	sc.close();
}
	
}
