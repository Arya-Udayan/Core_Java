package com.array;

import java.util.Scanner;

public class ReadAndPrintTwoDimensionalArray {
	public static int[][] inputArray(int row,int col) {
		System.out.println("Enter array elements:");
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static  void printTwoDArray(int[][] arr) {
		System.out.println("Array elements are :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row;
		int col;
		System.out.println("Enter number of rows:");
		row=sc.nextInt();
		System.out.println("Enter number of columns:");
		col=sc.nextInt();
		int[][] arr = inputArray(row,col);
		printTwoDArray(arr);
		
		sc.close();

	}

}
