package task_19th_June_If_Else;

import java.util.Scanner;

public class MaximumOfTwoNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no: ");
		int no1=sc.nextInt();
		
		System.out.println("Enter the second no: ");
		int no2=sc.nextInt();
		
		if(no1>no2) {
			System.out.println(no1 + " is a maximum number");
		} else {
			System.out.println(no2 + "is a maximum number");
		}
		sc.close();

	}

}
