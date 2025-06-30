package task_24th_June;

import java.util.Scanner;

public class PrimeNoFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. ");
		int no=sc.nextInt();
		
		boolean isPrime=true;
		 if (no <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= no / 2; i++) {
	                if (no % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
		if(isPrime) {
			System.out.println(no + " Given no is prime");
		} else {	
			System.out.println(no + " Given no is not prime");
		}
	}
}


