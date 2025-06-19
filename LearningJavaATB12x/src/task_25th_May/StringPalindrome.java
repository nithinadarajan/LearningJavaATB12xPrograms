package task_25th_May;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		String reverse ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("The given string is Palindrome");
		} else {
			System.out.println("The given string is not Palindrome");
		}
		
	}

}
