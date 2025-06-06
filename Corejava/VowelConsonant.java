import java.util.Scanner;
class VowelConsonant {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char alphabet;
		System.out.println("Enter the value of Alphabet");
		alphabet= sc.next().charAt(0);
		
		if((alphabet>='a' && alphabet<='z') || (alphabet>='A' && alphabet<='Z')) {

			if((alphabet=='a') || (alphabet=='e') || (alphabet=='i') || (alphabet=='o') || (alphabet=='u')) {
				System.out.println(alphabet+ " is a vowel");
			}else {
				System.out.println(alphabet+ " is a Consonant");
			}
		}else{
			System.out.println(alphabet+ " not an Alphabet");
		}
	}
}
			