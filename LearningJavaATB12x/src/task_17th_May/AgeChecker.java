package task_17th_May;

import java.util.Scanner;

public class AgeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		String category = (age <= 18)  ? "Minor" : (age > 65) ? "Senior"  : "Adult";

                   
		System.out.println("You are a(n): " + category);

		sc.close();
	}

}
