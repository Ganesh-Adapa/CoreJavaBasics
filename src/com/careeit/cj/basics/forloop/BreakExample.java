package com.careeit.cj.basics.forloop;

public class BreakExample {
	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5,6,7,8,9,10,35,25,256,33};
		for(int i=1;i<=10;i++) {
			if(i%4 ==0) {
				break;
			}
			System.out.println(i);
		}
	}

}
