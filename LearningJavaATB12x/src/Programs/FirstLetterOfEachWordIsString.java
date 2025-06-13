package Programs;

import java.util.Scanner;

public class FirstLetterOfEachWordIsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string word:");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		
		
		for (String word : words) {
			if(!word.isEmpty()) {
				System.out.println(word.charAt(0)+ " ");
			}
				
		}
	}
}
