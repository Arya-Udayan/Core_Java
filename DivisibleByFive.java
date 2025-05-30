import java.util.Scanner;
class DivisibleByFive {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		
		if(num%5==0){
			System.out.println("Number is Divisible by 5");
		}else{
			System.out.println("Not Divisible");
		}
	}
}