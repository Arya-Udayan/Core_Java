package com.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		
		int[] anArray=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Nos:");
			anArray[i]=sc.nextInt();
		}
			for(int i=0;i<size;i++) {
				if(anArray[i]%2==0) {
					System.out.println(anArray[i]+" is an even number");
				}
			}
	}

}
