package com.careeit.cj.basics.conditional;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score (1-10)only");
		int score = sc.nextInt();
		String grade = "Score should be in between 1 to 10";
		if(score >= 8 && score <= 10) {
			grade = "A";
		}else if(score >= 5 && score <= 7) {
			grade = "B";
		} else if(score >= 1 && score <= 4) {
			grade = "C";
		}else {
			grade = "Score should be in between 1 to 10";
		}
		System.out.println("Grade is " + grade);
	}

}
