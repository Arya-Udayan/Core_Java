package com.array;

import java.util.Scanner;

public class SumOfEvenAndOddArrayElements {

	public static int[] inputArray(int n) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static void printEvenAndOddSums(int[] arr) {
		int evenSum = 0, oddSum = 0;
		for (int num : arr) {
			if (num % 2 == 0)
				evenSum += num;
			else
				oddSum += num;
		}
		System.out.println("Sum of even elements: " + evenSum);
		System.out.println("Sum of odd elements: " + oddSum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size :");
		size = sc.nextInt();
		int[] arr = inputArray(size);
		 printEvenAndOddSums(arr);                  
	        
	        sc.close();

}
}
