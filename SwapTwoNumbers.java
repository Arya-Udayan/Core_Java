package methods;

import java.util.Scanner;

public class SwapTwoNumbers {
	
public static void swap(int firstNo,int secondNo) {
	
	
	firstNo=firstNo+secondNo;
	secondNo=firstNo-secondNo;
	firstNo=firstNo-secondNo;
	
	System.out.println("The firstno is :"+firstNo);
	System.out.println("The secondno is :"+secondNo);
}
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int firstNo;
int secondNo;
System.out.println("Enter 2 nos: ");
firstNo=sc.nextInt();
secondNo=sc.nextInt();

System.out.println("The firstno is :"+firstNo);
System.out.println("The secondno is :"+secondNo);

swap(firstNo,secondNo);
	}

}
