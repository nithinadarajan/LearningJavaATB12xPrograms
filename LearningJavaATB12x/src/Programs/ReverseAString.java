package Programs;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String input = sc.nextLine();
		
		//for loop
		String reversed="";
		for(int i=input.length()-1;i>=0;i--) {
			reversed = reversed+input.charAt(i);
		}
		System.out.println("The reverse of a string is "+ reversed);
		
		//using inbuilt function
		StringBuffer buffer=new StringBuffer();
		buffer.append(input);
		buffer.reverse();
		System.out.println(buffer);
		sc.close();
		
	}
}