package com.array;

import java.util.Scanner;

public class SmallestArrayElements {
	
	public static int[] inputArray(int n) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		return arr;
	}
	
	public static void smallestArrayElement(int[] arr) {
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element in the array: " + min);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size :");
		size = sc.nextInt();
		int[] arr = inputArray(size);
		smallestArrayElement(arr);
		
		sc.close();

	}

}
