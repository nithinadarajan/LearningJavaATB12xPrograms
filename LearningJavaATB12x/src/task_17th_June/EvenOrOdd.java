package task_17th_June;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		
		if(no%2==0) {
			System.out.println(no + " is an even number");
		} else {
			System.out.println(no + " is odd number");
		}
		sc.close();
	}

}
