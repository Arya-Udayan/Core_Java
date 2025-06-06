
 import java.util.Scanner;
class DoWhile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		int choice;
		char ch;
		
		do{
			System.out.println("Menu\n==============");
			System.out.println("1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit");
		
			System.out.println("Enter your num1:");
			num1=sc.nextInt();
			
			System.out.println("Enter your num2:");
			num2=sc.nextInt();
			
			System.out.println("Enter your Choice:");
			choice=sc.nextInt();
			
			
			switch(choice) {
				case 1:
					System.out.println("Result is : "+(num1+num2));
					break;
				case 2:
					System.out.println("Result is : "+(num1-num2));
					break;
				case 3:
					System.out.println("Result is : "+(num1*num2));
					break;	
				case 4:
					System.out.println("Result is : "+(num1/num2));
					break;
				case 5:
					System.exit(0);	//used to exit from a loop. 
					break;			//break is not mandatory, just used for readability//
				default:
					System.out.println("Invalid");
					break;
			}

			System.out.println("Do you want to continue: (Y/N)");	
			ch=sc.next().charAt(0);	
		
			 }while(ch=='Y' || ch=='y');
		//if(ch=='Y' || ch=='y')      
			//	continue;
			//else
				//break;
		//}while(true);	//loop works infinitely while using this statement.
	}
}