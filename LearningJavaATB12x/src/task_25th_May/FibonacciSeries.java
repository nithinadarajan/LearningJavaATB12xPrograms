package task_25th_May;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<no;i++) {
			int n3=n2+n1;
			System.out.println(n3);
			n1=n2;
			n2=n3;
				
		}
	}

}
