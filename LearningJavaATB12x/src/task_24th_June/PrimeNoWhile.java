package task_24th_June;

import java.util.Scanner;

public class PrimeNoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. ");
		int no=sc.nextInt();
		
		boolean isPrime=true;
		if(no==0 || no==1) {
			System.out.println("Given no is not prime");
		} else {
			int i=2;
			while(i<=no/2) {
				if(no%i==0) {
					isPrime=false;
					break;
				}
			i++;
			}
		}
		if(isPrime) {
			System.out.println(no + " Given no is prime");
		} else {
			System.out.println((no + " Given no is not prime"));
		}
		
	}

}
