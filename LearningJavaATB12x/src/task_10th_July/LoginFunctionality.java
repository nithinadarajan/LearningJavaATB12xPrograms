package task_10th_July;
//Method Overriding
//Base class
class User {
	void login() {
		System.out.println("This is User login");
	}
}
//Subclass AdminUser overrides login()
class AdminUser extends User {
	@Override
	void login() {
		System.out.println("This is Admin User");
	}
}
//Subclass RegularUser overrides login()
class RegularUser extends User {
	@Override
	void login() {
		System.out.println("This is Regular User");
	}
}
public class LoginFunctionality {

	public static void main(String[] args) {
		User admin = new AdminUser(); // Base class reference, AdminUser object
		User regular = new RegularUser();  // Base class reference, RegularUser object
		
		admin.login();  // Outputs: This is Admin User
		regular.login(); 	 // Outputs: This is Regular User
		

	}

}
