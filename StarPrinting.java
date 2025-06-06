//Function without argument and return value//
package methods;

public class StarPrinting {

	public static void printStar() { //calling method without return value

		for (int i = 0; i < 60; i++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {		//calling method without arguments//

	System.out.println("Welcome");
	printStar();
//		for (int i = 0; i < 60; i++)
//			System.out.print("*");
//
		System.out.println("\n To");
		printStar();
//		for (int i = 0; i < 60; i++)
//			System.out.print("*");
//
	System.out.println("\nLuminar");
		printStar();
//		for (int i = 0; i < 60; i++)
//			System.out.print("*");
//
	System.out.println("\nKochi");
		printStar();
//		for (int i = 0; i < 60; i++)
//			System.out.print("*");

	}

}
