import java.util.Scanner;
class MultiplicationTable {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int startNo;
		int endNo;
		int num;
		
		System.out.println("Enter Start no:");
		startNo=sc.nextInt();
		
		System.out.println("Enter End no:");
		endNo=sc.nextInt();
		
		System.out.println("Enter no:");
		num=sc.nextInt();
		
		while(startNo<=endNo) {
			System.out.println(startNo+"x"+num+"="+(startNo*num));
			startNo++;
		}
	}
}
	