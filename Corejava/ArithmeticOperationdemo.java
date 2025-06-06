import java.util.Scanner;
	class ArithmeticOperation {
		public static void main(String args[]){
			Scanner scan=new Scanner(System.in);
			int num1,num2;
			System.out.println("Enter first");
			num1=scan.nextInt();
			System.out.println("Enter second");
			num2=scan.nextInt();
			System.out.println("ARITHMETIC OPERATION");
			System.out.println("=====================");
			System.out.println("num1 + num2 ="+(num1+num2));
			System.out.println("num1 - num2 ="+(num1-num2));
			System.out.println("num1 * num2 ="+(num1*num2));
			System.out.println("num1 / num2 ="+(num1/num2));
		}
	}