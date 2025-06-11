package methods;

import java.util.Scanner;

public class StudentAgeArray {

	 public static void acceptAges(int[] ages) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the age of 5 students:");
	        for (int i = 0; i < ages.length; i++) {
	            System.out.print("Age of student " + (i + 1) + ": ");
	            ages[i] = sc.nextInt();
	        }
	    }
	 
	 
	  public static void displayAges(int[] ages) {
	        System.out.println("\nAges of the 5 students are:");
	        for (int i = 0; i < ages.length; i++) {
	            System.out.println("Student " + (i + 1) + ": " + ages[i]);
	        }
	    }
	 
	public static void main(String[] args) {
		 int[] ages = new int[5]; 
	        acceptAges(ages);        
	        displayAges(ages);   

	}

}
