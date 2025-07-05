package test_5th_July_WrapperClass;

public class ExceptionPropagation {
	// Method C: throws the actual exception
    static void methodC() {
        System.out.println("Inside methodC");
        int result = 10 / 0;  // Causes ArithmeticException
        System.out.println("Result: " + result);
    }

    // Method B: calls methodC
    static void methodB() {
        System.out.println("Inside methodB");
        methodC(); // Exception propagates from here
    }
 // Method A: calls methodB
    static void methodA() {
        System.out.println("Inside methodA");
        methodB(); // Exception propagates further
    }
	public static void main(String[] args) {
		try {
            methodA(); // Top-level call
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");

	}

}
