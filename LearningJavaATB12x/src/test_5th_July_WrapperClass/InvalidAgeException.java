package test_5th_July_WrapperClass;

import java.util.Scanner;

public final class InvalidAgeException extends Exception {
	  public InvalidAgeException(String message) {
          super(message);
      }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			if(age<18) {
				throw new InvalidAgeException("Age must be 18 or older");
			} else {
				System.out.println("Valid age: " + age);
			}
		} catch(InvalidAgeException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
		sc.close();

	}
}
