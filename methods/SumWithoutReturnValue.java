//Function with arguments and without return value

package methods;

import java.util.Scanner;

public class SumWithoutReturnValue {

	public static void sum(int noFirst,int noSecond) {
		System.out.println("Sum="+(noFirst+noSecond));
			
		}

		public static void main(String[] args) {	
			
			Scanner sc=new Scanner(System.in);
			int firstNo;
			int secondNo;
			
			System.out.println("Enter 2 nos:");
			firstNo=sc.nextInt();
			secondNo=sc.nextInt();
			
			sum(firstNo,secondNo);
			

	}




	}


