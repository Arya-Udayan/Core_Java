package encapsulation;

import java.util.Scanner;

class Student {

	private int id;		//each data members need both get and setter methods 
	private String name;

	public void setId(int id) {   
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class JavaBeanClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int id;
		String name;

		System.out.println("Enter id : ");
		id = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter Name : ");
		name = sc.nextLine();

		Student student = new Student();
		student.setId(id);
		student.setName(name);

		System.out.println(student.getId() + "   " + student.getName());

	}

}
