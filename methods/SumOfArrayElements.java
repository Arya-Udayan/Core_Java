package methods;

import java.util.Scanner;

public class SumOfArrayElements {

	public static int[] inputArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }
	public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();
	        int[] arr = inputArray(size);
	        System.out.println("Sum = " + getSum(arr));
	        sc.close();

	}

}
