package encapsulation;

class Employee{
	int empid;
	String empname;
	float empsalary;
	
	public void setId(int empid) {
		this.empid=empid;
	}
	
	public int getId() {
		return empid;
	}
	
	public void setName(String empname) {
		this.empname=empname;
	}
	
	public String getName() {
		return empname;
	}
	
	public void setSalary(float empsalary) {
		this.empsalary=empsalary;
	}
	
	public float getSalary() {
		return empsalary;
	}
	
	public String toString() {
		return empid+"   "+empname+"    "+empsalary ;
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		
		int id;
		String name;
		float salary;
		
		Employee employee=new Employee();
		
		employee.setId(10);
		employee.getId();
	
		
		employee.setName("Arya");
		employee.getName();
		
		
		employee.setSalary(10000);
		employee.getSalary();
		
//		System.out.println(employee.getId()+"   " +employee.getName()+ "    "+employee.getSalary());

		System.out.println(employee);		///without givimg toString() , we will get only the memory address and not the variable value
	}

}
