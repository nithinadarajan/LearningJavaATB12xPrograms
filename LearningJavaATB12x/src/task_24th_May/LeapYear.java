package task_24th_May;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your month");
		int month = sc.nextInt();
		int year = 2025;
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println("The month has 31 days");
			break;
		case 4,6,9,11:
			System.out.println("The month has 30 days");
			break;
		case 2:
			if(year%4==0) {
				System.out.println("The month has 29 days as it is a leap year");
			} else {
				System.out.println("The month has 28 days");
			}
			break;
		default:
			System.out.println("Invalid input");

		}

	}
}
