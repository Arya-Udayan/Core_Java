import java.util.Scanner;
class Pallindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		int rev=0;
		int mod;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		while(num>0) {
			mod=num%10;
			num=num/10;
			rev=rev*10+mod;
		}
		
		System.out.println("Reverse is : "+rev);
	}
}


	
			
		