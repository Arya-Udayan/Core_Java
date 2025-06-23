
package oopsprgs;

class Test{
	
	int num;
	
	Test() {
		num=10;
	}
	
	static {
		System.out.println(num);
		display();//non static members can't be accessed in static initialize block.
	}
	
	public static void print() {
		System.out.println(num);
		display();// non static methods can't be accessed in static methods.
	}
	
	public void display() {
		System.out.println(num);
	}
}
public class StsticDemo {

	public void main(String[] args) {
		
		
	}

}
