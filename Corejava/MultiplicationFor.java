import java.util.Scanner;
class MultiplicationFor {
	public static void main(String args[]) {
		int startNo,endNo,num;
		
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the StartNo:");
		startNo=sc.nextInt();
		System.out.println("Enter the EndNo:");
		endNo=sc.nextInt();
		System.out.println("Enter the Number:");
		num=sc.nextInt();
		
		System.out.println("========Multiplication Table=========");
		
		for(;startNo<=endNo;startNo++){
			System.out.println(startNo+"x"+num+"="+(startNo*num));
		}
	
	}
}	