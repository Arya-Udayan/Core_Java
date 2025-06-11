package methods;

import java.util.Scanner;

public class SumOddAndEvenNumbers {
	public static void oddEvenSum(int startNo, int endNo) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = startNo + 1; i < endNo; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
			
		}
		System.out.println("Sum of Even numbers between " + startNo + " and " + endNo + " is " + sumEven);
		System.out.println("Sum of Odd numbers between " + startNo + " and " + endNo + " is " + sumOdd);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int startNo;
		int endNo;

		System.out.println("Enter the StartNO:");
		startNo = sc.nextInt();
		System.out.println("Enter the EndNo:");
		endNo = sc.nextInt();
		oddEvenSum(startNo, endNo);

		sc.close();
	}

}
