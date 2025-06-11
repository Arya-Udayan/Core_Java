package methods;

import java.util.Scanner;

public class PiApproximation {

    public static void calculatePi(int terms) {
        double pi = 0.0;

        System.out.print("Series: ");
        for (int i = 0; i < terms; i++) {
            int denominator = 2 * i + 1;
            double term = 1.0 / denominator;

            if (i == 0) {
                System.out.print("1/" + denominator);
            } else if (i % 2 == 0) {
                System.out.print(" + 1/" + denominator);
            } else {
                System.out.print(" - 1/" + denominator);
            }

          
            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
        }

        pi *= 4;

        System.out.println("\nApproximate value of π using " + terms + " terms: " + pi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        calculatePi(terms);
        sc.close();
    }
}
