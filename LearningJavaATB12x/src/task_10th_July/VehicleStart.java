package task_10th_July;
//Method Overriding
//Base class
class Vehicle{
	void start() {
		System.out.println("Each vehicle has a different method to start engine");
	}
}
//Subclass Bike overrides start()
class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Kick start the bike");
	}
}
//Subclass Car overrides start()
class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Turn the key to start the car");
	}
}
public class VehicleStart {

	public static void main(String[] args) {
		Vehicle Bike = new Bike();
		Vehicle Car = new Car();
		
		Bike.start(); // Outputs: Kick start the bike
		Car.start(); // Outputs: Turn the key to start the car

	}

}
