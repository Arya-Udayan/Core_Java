import java.util.Scanner;
class SwappingTwoNumbers {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter the first Number:");
		a = sc.nextInt();
		System.out.println("Enter the second Number:");
		b= sc.nextInt();
		
		System.out.println("Before Swapping\n====================");
		System.out.println("First Number: " +a);
		System.out.println("Second Number: " +b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\nAfter Swapping\n================");
		System.out.println("First Number: " +a);
		System.out.println("Second Number: " +b);
	}
}
		
