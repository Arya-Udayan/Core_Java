package methods;

import java.util.Scanner;

public class FactorialWithoutMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, res = 1;
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			res= res * i;
		}
		System.out.println("The Factorial of " + num + " is :" + res);
	}

}
