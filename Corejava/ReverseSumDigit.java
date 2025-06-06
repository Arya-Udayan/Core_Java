package com.luminar;

import java.util.Scanner;

public class ReverseSumDigit {

	public static void main(String[] args) {
		int num, rev, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();

		System.out.print("Reverse Number : ");
		while (num > 0) {
			rev = num % 10;
			num = num / 10;
			System.out.print(rev);
			sum = +rev;
			
		}
		System.out.println("\nSum is : " + sum);
	}

}
