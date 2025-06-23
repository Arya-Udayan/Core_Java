package thispack;

class CurrentTest{
	
	public void show() {
		System.out.println("Inside show method");
	}
	public CurrentTest getDisplay() {   //since the datatype of obj is a class we use return type as class name
		System.out.println("hello");
		return this;     //"this" will return the current object
	}
}

public class ThisCurrentInstanceClass {

	public static void main(String[] args) {
		
		CurrentTest current = new CurrentTest();
		current.getDisplay().show();    //to call the show method we need an object , so the getdisplay method needs to return an object
	}

}
