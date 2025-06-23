package oopsprgs;

import java.util.Scanner;

class Librarian {
	String libname;
	int lid;
	String bookname;

	Librarian(int id, String name, String bname) {
		libname = name;
		lid = id;
		bookname = bname;
	}

	public void bookIssue() {
		System.out.println("Book Name : " + bookname);
		System.out.println("Librarian who issues the book : " + libname);
	}
}

public class LibraryDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		String bname;

		System.out.println("Enter Librarian id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();

		System.out.println("Enter Book Name : ");
		bname = sc.nextLine();

		Librarian obj = new Librarian(id, name, bname);
		obj.bookIssue();

	}

}
