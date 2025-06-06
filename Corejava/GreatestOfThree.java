import java.util.Scanner;
	class GreatestOfThree {
		public static void main (String args[]) {
			
			Scanner sc = new Scanner(System.in);
			int num1,num2,num3;
			System.out.println(" Enter num1:");
			num1 = sc.nextInt();
			System.out.println(" Enter num2:");
			num2 = sc.nextInt();
			System.out.println(" Enter num3:");
			num3 = sc.nextInt();
		
			if((num1>num2) && (num1>num3)) {
				System.out.println("Greatest number is : "+num1);
			}else if((num2>num3) && (num2>num3)){
				System.out.println("Greatest number is : "+num2);
			}else {
				System.out.println("Greatest number is : "+num3);
			}
		}
	}					

			
			