package oopsprgs;

import java.util.Scanner;

class Teacher{
	
	int id;
	String teacherName;
	static String departmentName="MCA";
	
	Teacher(int teacherId , String name){
		id =teacherId;
		teacherName=name;
	}
	
	public void printDetails() {
		System.out.println("Id: " +id+"  Name: "+teacherName+"  Department : "+departmentName);
	}
}

public class TeacherDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int teacherId;
		String name;
		
		System.out.println("Enter Teacher Id : ");
		teacherId=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name : ");
		name=sc.nextLine();
		
		Teacher teacherOne=new Teacher(teacherId ,name);
		
		System.out.println("Enter Teacher Id : ");
		teacherId=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name : ");
		name=sc.nextLine();
		
		Teacher teacherTwo=new Teacher(teacherId ,name);
		
		teacherOne.printDetails() ;
		teacherTwo.printDetails() ;
		
		
	}

}
