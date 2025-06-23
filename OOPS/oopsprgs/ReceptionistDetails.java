package oopsprgs;

import java.util.Scanner;

class Receptionist {
	String recepname;
	static String shift = "Morning";
	String hostname;
	
	 Receptionist(String rname,String hname){
		 recepname=rname;
		 hostname=hname;
	 }
	 public void greet() {
		 System.out.println("Welcom "+ hostname);
	 }
	 public void displayShift() {
		 System.out.println("Current shift of "+ recepname+" is "+shift);
	 }
}

public class ReceptionistDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String hname;
		String rname;
		
		
		System.out.println("Enter Receptionist name : ");
		rname = sc.nextLine();
		
		System.out.println("Enter host name : ");
		hname = sc.nextLine();
		
		Receptionist obj=new Receptionist(rname,hname);
		obj.greet();
		obj.displayShift();
		
	}

}
