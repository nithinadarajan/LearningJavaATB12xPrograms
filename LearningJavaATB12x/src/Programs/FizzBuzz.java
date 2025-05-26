package Programs;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Print the number between 1 -100  for multiples of 3," +
         " print Fizz instead of the number, and for multiples of 5, print Buzz."
         + "For numbers that are multiples of both 3 and 5, print FizzBuzz");
		for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

		}
}
}
