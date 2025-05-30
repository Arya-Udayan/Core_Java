import java.util.Scanner;
class IfElseExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter age :");
		age=sc.nextInt();
		if(age>=60){
			System.out.println("Elligible for covishield ");
		}else if(age>=40 && age<60){
			System.out.println("Elligible for covaccine");
		}else if(age>=18 && age<40){
			System.out.println("Elligible for pfizer");
		}else if (age>=12 && age<18){
			System.out.println("Elligible for sputnik V");
		}else{System.out.println("Not eligible for any vaccine");
		}
	}
}	