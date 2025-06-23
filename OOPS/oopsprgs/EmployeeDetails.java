package oopsprgs;

import java.util.Scanner;

class Employee {
	
	int empId;
	String empName;
	double empSalary;
	
	Employee(int id,String name,double salary){     //the parameter of this constructor is given to pass it to the instance variable.
		
		empId=id;
		empName=name;
		empSalary=salary;
		
	}
	
	public void print() {
		
		System.out.println("Id is : "+empId+"   name : "+empName+"   Salary: "+empSalary);
		
	}
	
}

public class EmployeeDetails {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		int id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name :");
		String name=sc.nextLine();
		
		System.out.println("Enter salary :");
		double salary=sc.nextDouble();
		
		Employee obj1=new Employee(id,name,salary);
		
		
		//obj1.print();
		
		System.out.println("Enter id :");
		 id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name :");
		name=sc.nextLine();
		
		System.out.println("Enter salary :");
		salary=sc.nextDouble();
		
		Employee obj2=new Employee(id,name,salary);
		obj1.print();
		obj2.print();
	}

}
