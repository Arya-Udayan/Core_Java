package methods;

import java.util.Scanner;

public class MultiplicationTableWithinRange {
	public static void MultiplicationTable(int startNo, int endNo, int num) {
		System.out.println("Multiplication Table \n===================");
		for (int i = startNo; i <= endNo; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int startNo;
		int endNo;

		System.out.println("Enter the number:");
		num = sc.nextInt();
		System.out.println("Enter the StartNO:");
		startNo = sc.nextInt();
		System.out.println("Enter the EndNo:");
		endNo = sc.nextInt();
		MultiplicationTable(startNo, endNo, num);
		
		sc.close();
	}
	
	

}
