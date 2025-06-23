//this can be used as a parameter in constructor code

package thispack;

class Demo{
	
	Demo(Test ob){
		System.out.println(" Hi");
	}
}
	class Test{
		Test(){
			Demo obj1=new Demo(this); 
			System.out.println("Hello");//this passed through test() is obj
			
		}
	}


public class ThisConstructorParameter {

	public static void main(String[] args) {
		
		Test obj=new Test();

	}

}
