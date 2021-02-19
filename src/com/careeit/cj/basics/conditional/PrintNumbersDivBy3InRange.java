package com.careeit.cj.basics.conditional;

import java.util.Scanner;

public class PrintNumbersDivBy3InRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb number");
		int lb = sc.nextInt();
		System.out.println("Enter the ub number");
		int ub = sc.nextInt();
		for(int i=lb;i<ub;i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}
}
