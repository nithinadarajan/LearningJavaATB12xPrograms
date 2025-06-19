package task_9th_June;

public class Rectangle {
	private double length;
	private double breadth;

	// Constructor to initialize length and breadth
	public Rectangle(double length, double breadth) {
		  this.length = length;
		  this.breadth = breadth;
	}

	// Method to calculate area
	public double calculateArea() {
		  return length * breadth;
	}

	// Method to display area
	public void displayArea() {
		   System.out.println("Length: " + length);
		   System.out.println("Breadth: " + breadth);
		   System.out.println("Area of Rectangle: " + calculateArea());
	}

	// Main method to test the Rectangle class
	public static void main(String[] args) {
	// Create Rectangle object
	Rectangle rect = new Rectangle(12.5, 3.0);

	// Display area
	rect.displayArea();
	 }
		
}


