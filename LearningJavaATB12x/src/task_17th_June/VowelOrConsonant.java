package task_17th_June;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c=sc.next().charAt(0);
		c=Character.toLowerCase(c);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println(c + " is vowel");
			} else {
			System.out.println(c +" is consonant");
			}
		}

	}

