package task_25th_May;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No: ");
		int no = sc.nextInt();
		int count = 0;
		
		if(no==0 && no==1) {
			System.out.println(no + "The no is not prime");
		} else {
			for(int i=2;i<=no;i++) {
				if(no%i==0) {
					count++;
				}
			}
		}
		if(count==1) {
			System.out.println(no + " is a prime no");
		} else {
			System.out.println(no + " is not a prime no ");
		}
	}

}
