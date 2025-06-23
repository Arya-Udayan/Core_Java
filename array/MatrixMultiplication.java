package com.array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows of Matrix1 :");
		int r1 = sc.nextInt();

		System.out.println("Enter number of columnsof Matrix1 :");
		int c1 = sc.nextInt();

		System.out.println("Enter number of rows of Matrix2 :");
		int r2 = sc.nextInt();

		System.out.println("Enter number of columnsof Matrix2 :");
		int c2 = sc.nextInt();

		if (c1 != r2) {
			System.out.println("Matrix Multiplication is not possible");
			return;
		}

		int[][]matrix1=new int[r1][c1];
		int[][]matrix2=new int[r2][c2];
		int[][]result = new int[r1][c2];
		
		
		System.out.println("Enter elements of Matrix1 :");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of Matrix2 :");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				for (int k = 0; k < c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
			}
			
		}
			System.out.println("Result of Matrix Multiplication:\n==================");
	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                System.out.print(result[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    	sc.close();
		}
	
	}

