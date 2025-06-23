package methods;

import java.util.Scanner;

public class SumAndAverageOfNumberRange {

	public static void sumAverage(int startNo, int endNo) {

		int sum = 0;
		int count = 0;
		for (int i = startNo + 1; i < endNo; i++) {
			sum = sum + i;
			count++;
		}
		if (count > 0) {
			double avg = (double) sum / count;
			System.out.println("The sum of " + startNo + " to " + endNo + " is " + sum);
			System.out.println("The average is " + avg);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNo;
		int endNo;

		System.out.println("Enter the StartNO:");
		startNo = sc.nextInt();
		System.out.println("Enter the EndNo:");
		endNo = sc.nextInt();
		sumAverage(startNo, endNo);

		sc.close();

	}

}
