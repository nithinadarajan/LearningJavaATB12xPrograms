package task_25th_May;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.next();
		input = input.toLowerCase();
		int vowelCount = 0;
		int consonant = 0;
		
		char[] given = input.toCharArray();
		
		for(int i =0; i<given.length;i++) {
		if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' ||
			input.charAt(i)=='u') {
				vowelCount++;
			} else {
				consonant++;
			}
		
	}
		System.out.println("The vowel count is: " + vowelCount);
		System.out.println("The consonant count is: " + consonant);
	}
}
