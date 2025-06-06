package methods;

import java.util.Scanner;

public class FactorialWithFunction {
	public static void fact(int num) {
		int result=1;
		for(int i=1;i<=num;i++) {
			result=result*i;
			
		}
		System.out.println("Factorialis :"+result);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Enter the number:");
	num=sc.nextInt();
	
	fact(num);

	}

}
