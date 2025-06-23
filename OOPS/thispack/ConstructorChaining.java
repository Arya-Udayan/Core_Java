package thispack;

class ConstructorDemo {
	int first;
	int second;

	ConstructorDemo() {     //this=obj1
		
		this(10, 20); //-------> //ConstructorDemo(int,int) 
		
		//this within the constructor means that the constructor is changing, to a constructor that has two "int parameters" here it is constructor 3. 
		/// it has 2 parameters , it will move to the constructor having 2 parametrs
						/// that is constructor 3.
	}

	ConstructorDemo(int first) {
		this(first, 30);
	}

	ConstructorDemo(int first, int second) {

		this.first = first;   //here this means obj1, because we started by taking this as obj1.
		this.second = second;
	}

	public void show() {

		System.out.println(first);
		System.out.println(second);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		ConstructorDemo obj1 = new ConstructorDemo();	
		obj1.show();

		ConstructorDemo obj2 = new ConstructorDemo(4);
		obj2.show();

		ConstructorDemo obj3 = new ConstructorDemo(4, 10);
		obj3.show();

	}

}
