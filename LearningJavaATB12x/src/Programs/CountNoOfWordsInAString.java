package Programs;

import java.util.Scanner;

public class CountNoOfWordsInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string word:");
		String input=sc.nextLine();
		
		String[] words=input.split(" ");
		System.out.println("Word Count=" + words.length);
	}

}
