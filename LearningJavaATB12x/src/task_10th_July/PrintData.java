package task_10th_July;
// METHOD OVERLOADING

class Printer {
	 // Method to print String data
	void printData(String data){
		System.out.println("String data: " + data);
	}
	// Overloaded method to print int data
	void printData(int data) {
		System.out.println("Integer data: " + data);
	}
	 // Overloaded method to print float data
	void printData(float data){
		System.out.println("Float data: " + data);
	}
}
public class PrintData {
	
	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		// Call printData with different data types
		myPrinter.printData("HelloNithi"); // String version
		myPrinter.printData("123456");		// int version
		myPrinter.printData("58.69f");		 // float version

	}

}
