import java.util.Scanner;
class VotingEligibility {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter age :");
		age=sc.nextInt();
		if( age >=18){
			System.out.println("Elligible to Vote");
		}else {
			System.out.println("Not Elligible");
		}
	}
}