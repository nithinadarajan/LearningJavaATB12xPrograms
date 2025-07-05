package test_5th_July_WrapperClass;

public class MultipleExceptionHandling {

	public static void main(String[] args) {
		try {
            int[] numbers = {10, 20, 30};
            
            // This will cause ArithmeticException if denominator is 0
            int result = numbers[1] / 0;
            System.out.println("Result: " + result);

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Element at index 5: " + numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
		System.out.println("Program continues after exception handling.");

	}

}
