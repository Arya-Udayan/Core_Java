package com.array;

import java.util.Scanner;

public class ArraySorting {

	public static int[] inputArray(int size) {
		System.out.print("Enter Array elements:");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void sortedArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.print("Sorted Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size:");
		size = sc.nextInt();
		int[] arr = inputArray(size);
		sortedArray(arr);
		sc.close();

	}
}
