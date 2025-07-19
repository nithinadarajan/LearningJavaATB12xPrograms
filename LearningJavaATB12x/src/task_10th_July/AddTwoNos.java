package task_10th_July;

//METHOD OVERLOADING - AddTwoNos

 class Calculator {
	// Method to add two integers
	 int add(int a, int b) {
		 return a+b;
	 }
	 // Overloaded method to add two doubles
	 double add(double a,double b) {
		 return a+b;
	 }
 }
public class AddTwoNos{
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		
		int addInt=myCalculator.add(5, 8);   // Calls int version
		 double addDouble = myCalculator.add(5.56, 8.79); // Calls double version
		
		System.out.println("Sub of integers: " + addInt);
		System.out.println("Sub of Double: " + addDouble);
	}

}
