package com.array;

import java.util.Scanner;

public class CountEvenAndOddNumbersOfArray {

	public static int[] inputArray(int size) {
		System.out.println("Enter array elements:");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void CountEvenAndOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			
		}
System.out.println("The count of even number is : "+evenCount);
System.out.println("The count of odd number is : "+oddCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size:");
		size = sc.nextInt();
		int[] arr = inputArray(size);
		CountEvenAndOdd(arr);
		
		sc.close();

	}

}
