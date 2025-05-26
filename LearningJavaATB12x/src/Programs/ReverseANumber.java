package Programs;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		
		int reversedNo = 0;
		
		for(;no!=0;no/=10) {
			int digit = no%10;
			reversedNo = reversedNo * 10 + digit;
		}
		System.out.println("The reverse of the no is : " + reversedNo);
	}

}
