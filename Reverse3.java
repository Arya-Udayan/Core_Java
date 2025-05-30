import java.util.Scanner;
class Reverse3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		int num1;
		int mod;
		int rev=0;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		num1=num;
		while(num>0) {											//printing both actual no and reverse no//
			mod=num%10;
			num=num/10;
			rev=rev*10+mod;
			
			
		}
		System.out.println("The actual No:" +num1);
		System.out.println("The reverse No:" +rev);
	}
}