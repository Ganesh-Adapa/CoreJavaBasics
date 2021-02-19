package com.careeit.cj.basics.conditional;

import java.util.Scanner;

public class MultiplicationOfTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		/*for(int i=1;i<= n;i++) {
			System.out.println(n +"*" +i + "=" +(n * i) );
		}*/
		
		for(int i=n;i>= 1;i--) {
			System.out.println(n +"*" +i + "=" +(n * i) );
		}
		//reverse order need to implement
		sc.close();
		
	}

}
