package methods;

import java.util.Scanner;

public class HarmonicSeries {
	
	public static void harmonicsum(int num) {
		double sum=0;
		
		System.out.print("Harmonic Series: ");
		
		for(int i=1;i<=num;i++) {
			System.out.print("1/" + i);
            if (i < num) {
                System.out.print(" + ");
            }
			sum=sum+1.0/i;
		}
		System.out.println("\nThe Harmonic Sum is "+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter the number limit :");
	num=sc.nextInt();
	harmonicsum(num);
	
	sc.close();

	}

}
