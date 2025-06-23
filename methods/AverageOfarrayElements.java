package methods;

import java.util.Scanner;

public class AverageOfarrayElements {

	public static int[] inputArray(int size) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		return arr;
	}

	public static double getAvg(int[] arr) {
		int sum = 0;
		for (int num : arr)
			sum += num;
		return (double)sum / arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size :");
		size = sc.nextInt();
		int[] arr = inputArray(size);
		double average = getAvg(arr);

		System.out.println("Average of array elements: " + average);
		sc.close();

	}

}
