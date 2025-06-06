package com.array;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;

		System.out.println("Enter size:");
		size = sc.nextInt();

		sc.nextLine();
		String[] namesArray = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Names:");
			//namesArray[i] = sc.next(); //next() wont take lenthy names , so better to use nextLine()
			namesArray[i] = sc.nextLine(); 	
		}
		System.out.println("The Names are:");
		for (String str : namesArray) {
			System.out.println(str);
		}
		sc.close();
	}
}
