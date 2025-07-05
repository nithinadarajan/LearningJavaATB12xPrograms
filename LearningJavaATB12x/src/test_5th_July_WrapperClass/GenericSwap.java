package test_5th_July_WrapperClass;

public class GenericSwap {
// Simple generic method to swap two elements in an array
	  public static <T> void swap(T[] array, int i, int j) {
	      T temp = array[i];
	      array[i] = array[j];
	      array[j] = temp;
	  }	
	  public static void main(String[] args) {
		        // Example with Integer array
		        Integer[] numbers = {1, 2, 3, 4};
		        System.out.println("Before swap: " + java.util.Arrays.toString(numbers));
		        swap(numbers, 0, 2);
		        System.out.println("After swap: " + java.util.Arrays.toString(numbers));

		        // Example with String array
		        String[] fruits = {"apple", "banana", "cherry"};
		        System.out.println("Before swap: " + java.util.Arrays.toString(fruits));
		        swap(fruits, 1, 2);
		        System.out.println("After swap: " + java.util.Arrays.toString(fruits));
		    }
		
}


