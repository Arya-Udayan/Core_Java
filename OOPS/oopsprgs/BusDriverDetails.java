package oopsprgs;

import java.util.Scanner;

class BusDriver {

	String driverName;
	int busNumber;
	static int count=0;

	BusDriver(String name, int number) {
		driverName = name;
		busNumber = number;
		count++;
	}
	
	public void printDetails() {
		
		System.out.println("Driver name: " + driverName + "\nBus Number : " + busNumber);
		System.out.println("\n---------------------");
	}
	
}

public class BusDriverDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int number;
		int count=0;
		
		System.out.println("\nDriver Details\n============");

		System.out.println("Enter Name : ");
		name = sc.nextLine();

		System.out.println("Enter Bus Number: ");
		number = sc.nextInt();

		BusDriver obj1 = new BusDriver(name, number);
		obj1.printDetails();
		
		sc.nextLine();
		
		System.out.println("Enter Name : ");
		name = sc.nextLine();

		System.out.println("Enter Bus Number: ");
		number = sc.nextInt();

		BusDriver obj2 = new BusDriver(name, number);
		obj2.printDetails();
		
		System.out.println("Total number of Drivers : "+BusDriver.count); 
		

	}

}
