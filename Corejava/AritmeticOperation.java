import java.util.Scanner;
class AritmeticOperation {
	public static void main(String args[]) {
			int num1;
			int num2;
			int res;
			char operator;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the First Number");
			num1=sc.nextInt();
			
			System.out.println("Enter the Second Number");
			num2=sc.nextInt();
			
			System.out.println("Enter the Operator");
			operator=sc.next().charAt(0);
			
			switch(operator) {
				case '+':
					res=num1+num2;
					System.out.println("Addition:result value is "+res);
					break;
				case '-':
					res=num1-num2;
					System.out.println("Subtraction:result value is "+res);
					break;
				case '*':
					res=num1*num2;
					System.out.println("Multiplication:result value is "+res);
					break;
				case '/':
					res=num1/num2;
					System.out.println("Division:result value is "+res);
					break;
				default:
					System.out.println("Not a valid operator");
				}
	}
}	