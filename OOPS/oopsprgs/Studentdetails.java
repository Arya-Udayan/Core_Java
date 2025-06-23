package oopsprgs;

import java.util.Scanner;

class Student {
	int rollNo;
	String studentname;
	String coursename;

	Student(int roll , String name,String course) {
		rollNo= roll;
		 studentname=name;
		 coursename=course;
	}
	
	public void printDetails() {
		System.out.println("Roll non: "+ rollNo+"   Name : "+studentname+"  Course : "+coursename);
	
	}
}

public class Studentdetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll;    //method inside variable declare cheythal memory allocate aavum 
		String name;
		String course;
	    

		System.out.println("Enter Roll no:");
		roll=sc.nextInt();
		//nextInt() is a non static method.so to call a non static method in a static function main we need to create the obj on non satic class that is scanner classs
		sc.nextLine();
		System.out.println("Enter Name:");
		name = sc.nextLine();
		
		System.out.println("Enter Course:");
		course = sc.nextLine();
		
		Student studentOne = new Student(roll,name,course);//object name should be same as class name in camel case

		System.out.println("Enter Roll no:");
		roll=sc.nextInt(); 
		
		sc.nextLine();
		System.out.println("Enter Name:");
		name = sc.nextLine();
		
		System.out.println("Enter Course:");
		course = sc.nextLine();
		
		Student studentTwo = new Student(roll,name,course);
		
		 studentOne.printDetails();
		 
		 studentTwo.printDetails();

	}

}
