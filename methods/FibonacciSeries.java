package methods;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void printFibonacci(int terms) {
		 int first = 0, second = 1;

	        System.out.print("Fibonacci Series: " + first + ", " + second);

	        for (int i = 2; i < terms; i++) {
	            int next = first + second;
	            System.out.print(", " + next);
	            first = second;
	            second = next;
	        }
	    }
	public static void main(String[] args) {
		int totalTerms = 20;
        printFibonacci(totalTerms);
	        

	}

}
