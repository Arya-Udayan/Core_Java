
package inheritancepack;

class Doctor{		//superclass / Base class/ parent class
	
	String skills="MBBS";
	
	public void showSkill() {
		System.out.println(skills);
	}
}

class Ortho extends Doctor{		//sub class /  Derived class / Child class
	String qualification = "MS";
	
//	public Ortho(String qualification) {
//		this.qualification = qualification;
//	}
	
	public void showDetails(){
		System.out.println(qualification);
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Ortho ortho =new Ortho();
		System.out.println(ortho.skills);
		System.out.println(ortho.qualification);
		
		ortho.showDetails();
		ortho.showSkill();
	}

}
