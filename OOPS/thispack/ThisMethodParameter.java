//this key word as method parameter

package thispack;

class ParameterMethod {

	public void display() {
		System.out.println("Hi");
		show(this);
	}

	public void show(ParameterMethod obj1) {
		System.out.println("Hello");
	}
}

public class ThisMethodParameter {

	public static void main(String[] args) {
		ParameterMethod obj = new ParameterMethod();
		obj.display();
		
	}

}
