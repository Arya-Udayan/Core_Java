package methods;

import java.util.Scanner;

public class RightAlignedHashPattern {

	public static void HashPattern(int size) {
		for (int i = 1; i <= size; i++) {
			for (int s = 0; s < size - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		HashPattern(size);
		sc.close();

	}

}
