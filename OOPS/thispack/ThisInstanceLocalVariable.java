package thispack;

import java.util.Scanner;

class Student {
	int rollNo;
	
	Student(int rollNo){   ///if this is not used then it will create confusion , so we get '0'
		this.rollNo=rollNo;   //allocating the value of local variable to the instance variable.
	}
}

public class ThisInstanceLocalVariable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rollNo;

		System.out.println("Enter Roll No :");
		rollNo = sc.nextInt();
		Student obj=new Student(rollNo);
		
		System.out.println(obj.rollNo);

	}

}
