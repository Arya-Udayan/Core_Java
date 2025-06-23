// Program to count the number of objects created.


package oopsprgs;

class ObjectCounter {

	static int count = 0;   //count is a static variable so all its current values can be accesed by all objects

	ObjectCounter() {
		count++;      //default constructor combiler direct vilichal nammaku print cheyan pattila, so nammal thanne default constructor set aaki, so that we will get the count.

	}

//	public void printObjects() {   //nonstatic method can be called only using objects.
//		System.out.println(count);
//	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		ObjectCounter obj1 = new ObjectCounter();
//		obj1. printObjects();
		
		ObjectCounter obj2 = new ObjectCounter();
		ObjectCounter obj3 = new ObjectCounter();
		ObjectCounter obj4 = new ObjectCounter();

//		obj4.printObjects();
		
		System.out.println(ObjectCounter.count);   ///since ststic variable is associated with class and notwith objects , we can also access it by class name.
		
	}

}
