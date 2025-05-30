import java.util.Scanner;
class AlphaDigitSpeCharCheck {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter the value of ch");
		ch= sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println(" It is an Alphabet");
		}else if(ch>='0' && ch<='9') {
			System.out.println(" It is a Digit");
		}else{
			System.out.println(" It is a Special Character");
		}
	}
}