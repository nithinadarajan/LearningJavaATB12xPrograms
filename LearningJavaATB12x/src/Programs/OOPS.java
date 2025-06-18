package Programs;

public class OOPS {

	public static void main(String[] args) {
		// Main class to run the program
	    // Create Person object
	    Person p = new Person("Alice", 40);
	    System.out.println("=== Person Info ===");
	    p.displayInfo();

	    System.out.println("\n=== Student Info ===");
	    // Create Student object
	    Student s = new Student("Bob", 20, "S123", "Computer Science");

	    // Demonstrate method overriding
	    s.displayInfo();

	    // Demonstrate method overloading
	    s.enroll("Mathematics");
	    s.enroll("Physics", "Fall 2025");
		}
	}

	// Base class
	class Person {
		private String name;
		private int age;

		// Constructor Overloading
		public Person() {
		this.name = "Unknown";
		this.age = 0;
		}

		public Person(String name, int age) {
		this.name = name;
		this.age = age;
		}

		// Encapsulation: Getters and Setters
		public String getName() {
		return this.name;
		}

		public void setName(String name) {
		this.name = name;  // use of 'this' keyword
		}

		public int getAge() {
		return this.age;
		}

		public void setAge(int age) {
		this.age = age;
		}

		// Method to be overridden
		public void displayInfo() {
		 System.out.println("Name: " + name);
		 System.out.println("Age: " + age);
		}
	}
	// Derived class using single inheritance
	class Student extends Person {
		  private String studentId;
		  private String course;

		  // Constructor
		  public Student(String name, int age, String studentId, String course) {
		     super(name, age); // call to base class constructor
		     this.studentId = studentId;
		     this.course = course;
		  }

		  // Method Overloading
		  public void enroll(String course) {
		      this.course = course;
		      System.out.println(this.getName() + " enrolled in " + course);
		  }

		  public void enroll(String course, String semester) {
		        this.course = course;
		        System.out.println(this.getName() + " enrolled in " + course + " for " + semester);
		   }

		  // Method Overriding (Polymorphism)
		  @Override
		  public void displayInfo() {
		        super.displayInfo(); // use of 'super' to call base method
		        System.out.println("Student ID: " + studentId);
		        System.out.println("Course: " + course);
		    }
		}

		