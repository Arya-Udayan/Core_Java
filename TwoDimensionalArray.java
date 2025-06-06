package com.array;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Values in 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
//        for(int[]rowValue :array) {
//        	for(int i:rowValue) {
//        		System.out.println(i+"\t");
//        	}
//        	System.out.println();
//        }

        sc.close();
    }
}
