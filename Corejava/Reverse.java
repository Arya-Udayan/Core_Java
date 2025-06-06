import java.util.Scanner;
class Reverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		int mod;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		while(num>0) {
			mod=num%10;
			System.out.print(mod);  //"System.out.print"  will print all digit in one line.
			num=num/10;
			
		}
		
	}
}
	
				

	
			
		