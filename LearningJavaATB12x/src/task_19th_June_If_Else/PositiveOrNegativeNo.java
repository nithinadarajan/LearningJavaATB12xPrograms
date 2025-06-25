package task_19th_June_If_Else;

import java.util.Scanner;

public class PositiveOrNegativeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		
		if(no>0) {
			System.out.println(no  + "is positive");
		} else {
			System.out.println(no + "is negative");
		}
		sc.close();
	}

}
