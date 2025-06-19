package task_9th_June;

public class Car {
	private String brand;
	private String model;
	private double price;
	// Constructor to initialize the Car object
	public Car(String brand, String model, double price) {
		 this.brand = brand;
		 this.model = model;
		 this.price = price;
	}

	// Method to display car details
	public void displayDetails() {
		  System.out.println("Car Brand: " + brand);
		  System.out.println("Car Model: " + model);
		  System.out.println("Car Price: ₹" + price);
	}

	// Main method to test the Car class
	public static void main(String[] args) {
	// Create a Car object
		  Car myCar = new Car("Hyundai", "Creta", 2150000);

	// Display the car details
		  myCar.displayDetails();
	}
}


