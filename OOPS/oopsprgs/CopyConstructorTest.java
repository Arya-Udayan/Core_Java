package oopsprgs;

class Admin {

	int enroll;
	String name;

	Admin(int roll, String adminName) {

		enroll = roll;
		name = adminName;
	}

	Admin(Admin first) {    //copy constructor  , this constructor copies the value of object first,
		enroll = first.enroll;
		name = first.name;
	}

	public void printDetails() {

		System.out.println("Enroll :" + enroll + "\tName:" + name);
	}

}

public class CopyConstructorTest {

	public static void main(String[] args) {

		Admin first = new Admin(23, "arya");
		System.out.println("Enroll= " + first.enroll + "\tName= " + first.name);

		Admin second = new Admin(first);
		second.printDetails();

	}

}
