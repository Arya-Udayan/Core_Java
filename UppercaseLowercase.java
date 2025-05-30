import java.util.Scanner;
class UppercaseLowercase {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter the value of ch");
		ch= sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') { 
			System.out.println(" It is a Lowercase Alphabet");
		}else if(ch>='A' && ch<='Z') {
			System.out.println(" It is an Uppercase Alphabet");
		}else {
			System.out.println(" It is not an Alphabet");
		}
	}
}