package com.array;

import java.util.Scanner;

public class GreatestArrayElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int size,greatest=0;
		
		System.out.println("Enter size:");
		size=sc.nextInt();
		
		int[] anArray=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter elements:");
			anArray[i]=sc.nextInt();
		}
		
		for(int i=0;i<size-1;i++) {
			if(anArray[i]> anArray[i+1]) {
				greatest=anArray[i];
			}else {
				greatest=anArray[i+1];
			}
			
		}
		System.out.println("Greatest Element :" +greatest);
	}

}
