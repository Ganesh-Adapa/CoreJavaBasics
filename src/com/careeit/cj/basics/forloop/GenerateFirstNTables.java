package com.careeit.cj.basics.forloop;

import java.util.Scanner;

public class GenerateFirstNTables {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the number n value : ");
	//int n = sc.nextInt();
	System.out.println("Enter the number lb value : ");
	int lb = sc.nextInt();
	System.out.println("Enter the number ub value : ");
	int ub = sc.nextInt();
	
	/*for(int i=1;i<=10;i++) {
		System.out.printf("%d * %d = %d\n",n,i,n * i);
	}*/
	
	/*for(int j=1; j<=n;j++) {
		int num = j;
		for (int i=1;i<=10;i++) {
			System.out.println();
		}
		System.out.println("........................................");
	}*/
	
	/*for(int i=1;i<=n;i++) {
		for(int j=1;j<=10;j++) {
			System.out.printf("%d * %d = %d\n",i,j,i * j);
		}
		System.out.println("...................................");
	}*/
	
	for(int i=lb;i<=ub;i++) {
		for(int j=1;j<=10;j++) {
			System.out.printf("%d * %d = %d\n",i,j,i * j);
		}
		System.out.println("...................................");
	}
	sc.close();
}
}
