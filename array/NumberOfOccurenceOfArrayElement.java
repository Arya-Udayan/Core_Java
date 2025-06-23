package com.array;

import java.util.Scanner;

public class NumberOfOccurenceOfArrayElement {
	
	public static int[] inputArray(int size) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void ArrayOccurance(int[] arr,int target) {
		int count=0;
		for(int num : arr) {
			if ( num==target) {
				count++;
			}
		}
		System.out.println("The element " + target + " occurs " + count + " time(s).");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size:");
		size=sc.nextInt();
		int[] arr=inputArray(size);
		
		System.out.print("Enter the element to count: ");
        int target = sc.nextInt();
		ArrayOccurance(arr,target);
		
		
		
		sc.close();

	}

}
