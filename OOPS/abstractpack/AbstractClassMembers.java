package abstractpack;


abstract class AbstractDemo{
	int num=50;		//hardcoded bcz we cant instantiate it 
	static String str = "Abstract Class";
	
	abstract void display();    //abstract method doesn't have a body
	
	public void print(String str) {		//non static method or concrete metthod
		System.out.println(str);
	}
	
	static void show() {
		System.out.println("Inside Show Method......");
	}
}

class Test extends AbstractDemo{

	@Override
	void display() {
		System.out.println(num);
		System.out.println(str);
	}
	
}

public class AbstractClassMembers {

	public static void main(String[] args) {
		Test obj1=new Test();
		obj1.display();
		obj1.print("hi!!");;
		AbstractDemo.show();

	}

}
