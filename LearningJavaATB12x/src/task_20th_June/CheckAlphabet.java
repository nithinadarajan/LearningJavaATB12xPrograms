package task_20th_June;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char c = sc.next().charAt(0);

	        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	            System.out.println("It is an alphabet.");
	        else
	            System.out.println("Not an alphabet.");

	}

}
