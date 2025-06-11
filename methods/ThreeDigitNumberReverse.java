package methods;

import java.util.Scanner;

public class ThreeDigitNumberReverse {

	public static void reverseDigit(int num) {

		while (num > 0) {
			int rev = num % 10;
			System.out.print(rev);
			num = num / 10;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the 3 digit number:");
		num = sc.nextInt();
		reverseDigit(num);

		sc.close();

	}

}
