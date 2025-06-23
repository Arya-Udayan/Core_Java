package oopsprgs;

import java.util.Scanner;

class DoctorReport{
	String doctorName;
	String specialization;
	double experience;
	double salary;
	double totalSalary;
	
	 DoctorReport(String name, String spec, double years, double pay){
		doctorName=name;
		specialization = spec;
		experience= years;
		salary = pay;
		
		totalSalary=(pay+((0.1*pay)+(0.2*pay)));
		
	}
	public void printDetails() {
		
		System.out.println("\n Doctor Details \n=================");
		System.out.println(" Name : "+doctorName+ "  \nSpecialization : "+specialization+ "  \nExperience : "+experience+ " \nSalary : "+salary+"  \nTotal Salary : "+totalSalary);
	}
	
}

public class DoctorDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name;
		String spec;
		double  years;
		double pay;
		
		System.out.println("Enter name : ");
		name=sc.nextLine();
		
		System.out.println("Enter Specialization : ");
		spec=sc.nextLine();
		
		System.out.println("Enter years of Experiences : ");
		years=sc.nextDouble();
		
		System.out.println("Basic Salary : ");
		pay=sc.nextDouble();
		 DoctorReport doctorOne=new  DoctorReport(name,spec,years,pay);
		 
		 sc.nextLine();
		
		System.out.println("Enter name : ");
		name=sc.nextLine();
		
		System.out.println("Enter Specialization : ");
		spec=sc.nextLine();
		
		System.out.println("Enter years of Experiences : ");
		years=sc.nextDouble();
		
		System.out.println("Basic Salary : ");
		pay=sc.nextDouble();
		
		 DoctorReport doctorTwo=new  DoctorReport(name,spec,years,pay);
		
		doctorOne.printDetails();
		doctorTwo.printDetails();

	}

}
