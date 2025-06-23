package inheritancepack;

class Student {

	String name = "Arya";
}

class CollegeStudent extends Student {
	String course = "MCA";
}

class McaStu extends CollegeStudent {
	String semester = "3rd sem";

	public void showDetails() {

		System.out.println(name);
		System.out.println(course);
		System.out.println(semester);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		McaStu obj1 = new McaStu();
		obj1.showDetails();

	}

}
