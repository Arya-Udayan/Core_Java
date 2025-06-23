package oopsprgs;

class BlockDemo{		//class load aavumbo static block execute cheyum. 
	
	 static {
		 
		 System.out.println("Inside static block");
	 }
	 
	 {
		 
		 System.out.println("Inside Non-static block");		//non static object create cheythittanu work aaye, thats why we get this statement 2 times.
	 }
	 
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		
//		BlockDemo obj1=new BlockDemo();
//		BlockDemo obj2 =new BlockDemo();

	}

}
