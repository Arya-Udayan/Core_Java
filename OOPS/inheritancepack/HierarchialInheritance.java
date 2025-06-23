package inheritancepack;

class Manager {
	int mid = 10;
	String mname = "Arya";

}

class Developer extends Manager {
	int did = 25;
	String dname = "Joyce";

	public void display() {
		System.out.print("Developer :"+did);
		System.out.print("  Developer: "+dname);
		System.out.print("  Manager : "+mname);
		System.out.print("  Manager Id : "+mid);
	}
}

class Tester extends Manager {
	int tid = 20;
	String tname = "Priya";
	public void display() {
		System.out.print("\n Tester  :"+tid);
		System.out.print("  Tester: "+tname);
		System.out.print("  Manager :"+mname);
		System.out.print("  Manager Id :"+mid);
	}
}

class Designer extends Manager {
	int sid = 30;
	String sname = "Vaishnav";
	public void display() {
		System.out.print("\n Designer :"+sid);
		System.out.print("  Designer :"+ sname);
		System.out.print("  Manager : "+mname);
		System.out.print("  Manager Id : "+mid);
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Developer obj1=new Developer();
		obj1.display();
		
		Tester obj2=new Tester();
		obj2.display();
		
		Designer obj3=new Designer();
		obj3.display();
	}

}
