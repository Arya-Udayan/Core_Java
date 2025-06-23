package com.array;

import java.util.Scanner;

public class IncrementArrayElements {

	public static int[] inputArray(int size) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements :");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		return arr;
	}

	public static void IncrementArray(int[] arr) {
		System.out.println("Incremented array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 1;
			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size :");
		size = sc.nextInt();
		int[] arr = inputArray(size);
		IncrementArray(arr);

		sc.close();

	}

}
