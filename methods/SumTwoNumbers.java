//Function with arguments and with return value.//
package methods;

import java.util.Scanner;

public class SumTwoNumbers {
	
	public static int sum(int firstNo,int secondNo) {	//called function with return value//
		
//		int result= firstNo+secondNo;
//		return result;
		
		return firstNo+secondNo;
		
	}

	public static void main(String[] args) {	//calling function with arguments//
		Scanner sc=new Scanner(System.in);
		int firstNo;
		int secondNo;
		System.out.println("Enter 2 nos:");
		firstNo=sc.nextInt();
		secondNo=sc.nextInt();
//		int result=sum(firstNo,secondNo);	//arguments (actual value) of functn sum : firstNo,secondNo//
//		 
//		System.out.println("The Result is :"+result);
		
		System.out.println("Sum="+sum(firstNo,secondNo));
	}

}
