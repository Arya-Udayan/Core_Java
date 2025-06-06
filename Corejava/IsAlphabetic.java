import java.util.Scanner;
class IsAlphabetic {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char alpha;
		System.out.println("Enter the value of alpha");
		alpha = sc.next().charAt(0);
		
		if((alpha>='a' && alpha<='z') || (alpha>='A' && alpha<='Z')) {
			System.out.println(alpha+ " is an Alphabet");
		}else {
			System.out.println(alpha+ " not an Alphabet");
		}
	}
}