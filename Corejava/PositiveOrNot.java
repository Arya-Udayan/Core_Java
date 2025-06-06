import java.util.Scanner;
class PositiveOrNot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the value of a");
		a= sc.nextInt();
		
		if(a>=0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number is Negative");
		}
	}
}