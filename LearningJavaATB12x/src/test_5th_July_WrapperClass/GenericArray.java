package test_5th_July_WrapperClass;

public class GenericArray {
	// Generic method to print any array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // New line after printing
    }
	public static void main(String[] args) {
		 // Example with Integer array
        Integer[] intArray = {1, 2, 3, 4};
        printArray(intArray);

        // Example with String array
        String[] strArray = {"apple", "banana", "cherry"};
        printArray(strArray);
        
     // Example with Double array
        Double[] dblArray = {1.1, 2.2, 3.3};
        printArray(dblArray);

	}

}
