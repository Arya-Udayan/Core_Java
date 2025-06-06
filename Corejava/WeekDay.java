import java.util.Scanner;
class WeekDay {
	public static void main(String args[]) {
			int weekday;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Weekday");
			weekday=sc.nextInt();
			
			if(weekday==1) {
					System.out.println("Sunday");
				}else if(weekday==2) {
						System.out.println("Monday");
				}else if(weekday==3) {
					System.out.println("Tuesday");
				}else if(weekday==4) {
					System.out.println("wednesday");
				}else if(weekday==5) {
					System.out.println("Thursday");
				}else if(weekday==6) {
					System.out.println("Friday");
				}else if(weekday==7) {
					System.out.println("Saturday");
				}else {
					System.out.println("Not a Valid Day");	
				}
				
	}
}	