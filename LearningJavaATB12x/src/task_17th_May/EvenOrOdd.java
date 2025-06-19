package task_17th_May;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the No.");
		int No=sc.nextInt(); //input->No entered by user
		
		String result = (No%2==0) ? "even" : "odd"; //output->string->even or odd
		System.out.println(result);

	}

}
