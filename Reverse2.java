import java.util.Scanner;
class Reverse2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		while(num>0) {
			
			System.out.print(num%10);			//printing reverse without using more than one  variable.
			num=num/10;
			
		}
		
	}
}			
