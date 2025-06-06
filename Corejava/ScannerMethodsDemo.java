import java.util.Scanner;
class ScannerMethodsDemo {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int rollNumber;
		String studentName;
		char division;
		float marks;
		double fees;
		String teacherName;

		System.out.println("Enter Rollno:");
		rollNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter StudentName:");
		studentName = sc.nextLine();

		System.out.println("Enter Division:");
		division = sc.next().charAt(0);

		System.out.println("Enter Marks:");
		marks = sc.nextFloat();

		System.out.println("Enter Fees:");
		fees = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter TeacherName:");
		teacherName = sc.nextLine();

		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Student Name:"+studentName);
		System.out.println("Division:"+division );
		System.out.println("Marks:"+marks);
		System.out.println("Fees:"+fees);
		System.out.println("Teacher Name:"+teacherName);
	}
}
