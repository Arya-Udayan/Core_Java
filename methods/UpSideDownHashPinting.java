package methods;

import java.util.Scanner;

public class UpSideDownHashPinting {
	
	public static void HashPattern(int size) {
		for(int i=size;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("#");
				
			}
			System.out.print("\n");
		}
	}
		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size:");
		size=sc.nextInt();
		HashPattern(size);
		sc.close();
		

	}

}
