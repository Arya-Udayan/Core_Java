package methods;

import java.util.Scanner;

public class PrimeOrNot {

	public static void primeCheck(int num) {
		if (num <= 1) {
			System.out.println("Not Prime Number");
			return;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("Not Prime Number");
				return;
			}
		}

		System.out.println("Prime Number");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		primeCheck(num);
		sc.close();
	}
}
