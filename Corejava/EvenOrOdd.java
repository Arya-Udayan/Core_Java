import java.util.Scanner;
class EvenOrOdd {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		
		if(num%2==0){
			System.out.println("Number is even");
		}else{
			System.out.println("Number is odd");
		}
	}
}