package task_12th_June_MethodOverriding_in_Inheritance;

public class Main {

	public static void main(String[] args) {
		  Shape s;

	        s = new Circle();
	        s.area();  // Calls Circle's overridden method

	        s = new Rectangle();
	        s.area();  // Calls Rectangle's overridden method
	}

}
