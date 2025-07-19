package task_10th_July;
//Method Overriding
//Base class
class Employee {
	void role() {
		System.out.println("General Employee");
	}
}
//Subclass Manager overrides role()
class Manager extends Employee{
	@Override
	void role() {
		System.out.println("I am the Manager");
	}
}
//Subclass Clerk overrides role()
class Clerk extends Employee{
	@Override
	void role() {
		System.out.println("I am the Clerk");
	}
}
//Subclass Tester overrides role()
class Tester extends Employee{
	@Override
	void role() {
		System.out.println("I am the Tester");
	}
}
public class EmployeeRoleInfo {

	public static void main(String[] args) {
		Employee Manager = new Manager();
		Employee Clerk = new Clerk();
		Employee Tester = new Tester();
		
		Manager.role(); // Outputs: I am the Manager
		Clerk.role(); // Outputs: I am the Clerk
		Tester.role(); // Outputs: I am the Tester

	}

}
