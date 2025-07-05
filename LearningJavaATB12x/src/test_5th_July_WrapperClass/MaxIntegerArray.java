package test_5th_July_WrapperClass;

public class MaxIntegerArray {

	public static void main(String[] args) {
		Integer[] numbers = {10, 45, 32, 67, 23};

        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        Integer max = numbers[0]; // Start with the first element

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }

	}


