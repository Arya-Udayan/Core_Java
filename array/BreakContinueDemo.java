package com.luminar;

public class BreakContinueDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			/*
			 * if(i%2==0) //if number is even then skip and continue. continue;
			 * System.out.println(i); //print the odd numbers only
			 */
			for (int j = 1; j <= 4; j++) {
				if (i == 3) {
					continue;
				}
				System.out.println(i + " " +j);
			}
			System.out.println("");
		}

	}

}
