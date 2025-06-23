package thispack;

class MethodChaining{
	
	public void display() {
		System.out.println("Display method");
		this.show();   //for a method chaining this , need not to be the first statement.
	}
	
	public void show() {
		System.out.println("Show method");
	}
}

public class ThisMethodDemo {

	public static void main(String[] args) {
	
		MethodChaining obj=new MethodChaining();
		obj.display();
		//obj.show();
	}

}
