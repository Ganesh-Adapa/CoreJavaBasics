package com.careeit.cj.basics.forloop;

import java.util.Scanner;

public class PatternExamples {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number n value : ");
	int n = sc.nextInt();
	
	int count =0;
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			count++;
			System.out.print(count +" ");
		}
		System.out.println();
	}
	
	/*int k = 0;
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			k += 19;
			System.out.print(k + " ");
		}
		System.out.println();
	}*/
	
	sc.close();
}
}
