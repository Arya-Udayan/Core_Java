package oopsprgs;

class DoctorRecords {

	public static void print() {
		System.out.println("Doctor is available");
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {

		DoctorRecords.print();    //static method can be called using class name

	}

}
