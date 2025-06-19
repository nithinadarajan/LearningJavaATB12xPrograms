package task_9th_June;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display student details
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	// Main method to test the class
public static void main(String[] args) {
	Student student1 = new Student("Nithi",20);  // Creating an object of Student
	student1.display();  // Displaying the student details
	}

}
