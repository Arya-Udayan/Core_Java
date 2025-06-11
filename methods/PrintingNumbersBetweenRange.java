package methods;

import java.util.Scanner;

public class PrintingNumbersBetweenRange {

	public static void printRange(int startNo, int endNo) {
		System.out.println("The numbers between " + startNo + " and " + endNo);

		for (int i = startNo + 1; i < endNo; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNo;
		int endNo;

		System.out.println("Enter the StartNO:");
		startNo = sc.nextInt();
		System.out.println("Enter the EndNo:");
		endNo = sc.nextInt();
		printRange(startNo, endNo);
		
		sc.close();
	}

}
