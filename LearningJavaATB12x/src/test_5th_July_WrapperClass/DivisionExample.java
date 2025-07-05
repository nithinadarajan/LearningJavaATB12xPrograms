package test_5th_July_WrapperClass;

import java.util.Scanner;

public class DivisionExample {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     try {
	         System.out.print("Enter numerator: ");
	         int numerator = scanner.nextInt();

	         System.out.print("Enter denominator: ");
	         int denominator = scanner.nextInt();

	         int result = numerator / denominator;
	         System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        } finally {
	            System.out.println("This block always executes (finally block).");
	            scanner.close();
	        }
	    }
	
	}

