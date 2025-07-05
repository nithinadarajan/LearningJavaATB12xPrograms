package test_5th_July_WrapperClass;

public class GenericSum {
	// Generic method that accepts only subclasses of Number and returns the sum
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;
        for (T element : array) {
            total += element.doubleValue();  // Convert each number to double
        }
        return total;
    }
	public static void main(String[] args) {
		 Integer[] intArray = {10, 20, 30};
	        Double[] doubleArray = {1.5, 2.5, 3.5};
	        Float[] floatArray = {1.0f, 2.0f, 3.0f};

	        System.out.println("Sum of Integer array: " + sum(intArray));
	        System.out.println("Sum of Double array: " + sum(doubleArray));
	        System.out.println("Sum of Float array: " + sum(floatArray));

	}

}
