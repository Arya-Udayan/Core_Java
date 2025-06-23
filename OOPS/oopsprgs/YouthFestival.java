package oopsprgs;

import java.util.Scanner;

class Participants {
	int rollNo;
	String name;
	static String collegeName = "Rajagiri";

	Participants(int roll, String studentName) {
		rollNo = roll;
		name = studentName;
//	collegeName = college;
	}

	void displayParticipants() {
		System.out.println("Roll no :  " + rollNo + "\nName :  " + name + "\nCollege : " + collegeName);
	}

}

public class YouthFestival {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int roll;
		String studentName;
//		String college;

		System.out.println("Enter roll no:");
		roll = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter name:");
		studentName = sc.nextLine();

//		System.out.println("Enter college name :");
//		college = sc.nextLine();
//		
		Participants obj1 = new Participants(roll, studentName);

		System.out.println("Enter roll no:");
		roll = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter name:");
		studentName = sc.nextLine();

//		System.out.println("Enter college name :");
//		college = sc.nextLine();
//		
		Participants obj2 = new Participants(roll, studentName);
		obj1.displayParticipants();
		obj2.displayParticipants();

	}

}
