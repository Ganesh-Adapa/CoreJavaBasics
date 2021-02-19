package com.careeit.cj.basics;

import java.util.Scanner;

public class CalProfitOrLoss {
	public static void main(String[] args) {
		float sp, bp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the buying price");
		bp = sc.nextFloat();
		System.out.println("Enter the selling price");
		sp = sc.nextFloat();

		float amount = sp - bp;
		if (amount > 0) {
			System.out.println("Profit");
		} else if (amount < 0) {
			System.out.println("Loss");
		} else {
			System.out.println("No loss, No Profit");
		}

	}
}