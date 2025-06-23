package oopsprgs;

import java.util.Scanner;

class Accountant {
	String acctName;
	boolean dutyType;
	double salary;
	double totalSalary;

	Accountant(String name, boolean isPartTime, double sal) {
		acctName = name;
		dutyType = isPartTime;
		salary = sal;
	}

	public void calculate() {
		if (dutyType) {
			totalSalary = (salary+(salary * 0.1));
		} else {
			totalSalary = (salary+((salary * 0.2) + (salary * 0.1)));
		}
	}

	public void display() {
		System.out.println("\nName: " + acctName);
		System.out.println("Duty Type: " + (dutyType ? "Part Time" : "Full Time"));
		System.out.println("Base Salary: " + salary);
		System.out.println("Total Salary: " + totalSalary);
	}
}

public class AccountantDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		boolean isPartTime;
		double sal;

		System.out.println("Enter Name : ");
		
		name = sc.nextLine();

		System.out.print("Is the accountant part-time? (true/false): ");
		isPartTime = sc.nextBoolean();

		System.out.println("Salary : ");
		sal = sc.nextDouble();

		Accountant obj1 = new Accountant(name, isPartTime, sal);
		
		System.out.println("Accountant Details \n===============");

		System.out.println("Enter Name : ");
		sc.nextLine();
		name = sc.nextLine();

		System.out.print("Is the accountant part-time? (true/false): ");
		isPartTime = sc.nextBoolean();

		System.out.println("Salary : ");
		sal = sc.nextDouble();

		Accountant obj2 = new Accountant(name, isPartTime, sal);

		obj1.calculate();
		obj1.display();

		obj2.calculate();
		obj2.display();

	}

}
