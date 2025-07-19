package task_10th_July;
	//Method Overloading
class Greeter {
	 // Method with no parameters
	void GreetOne() {
		System.out.println("GreetOne: " + "Hello!");
	}
	  // Overloaded method with one String parameter
	void GreetTwo(String name) {
		System.out.println("GreetTwo: Hello, " + name + "!");
	}
}

public class GreetUser {

	public static void main(String[] args) {
		Greeter greetings = new Greeter();
		greetings.GreetOne();  // Calls greet() with no parameters
		greetings.GreetTwo("Akshay");  // Calls greet(String name)
	}

}
