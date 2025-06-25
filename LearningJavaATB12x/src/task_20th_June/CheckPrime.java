package task_20th_June;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No: ");
        int no=sc.nextInt();
        
        boolean isPrime=true;
        if(no <= 1) {
        	System.out.println(no + " is not prime");
        } else {
        	for(int i=2;i<=no/2;i++) {
        		if(no%i==0) {
        			isPrime=false;
        			break;
        		}
        	}
        }if(isPrime) {
        	System.out.println(no +" is prime");
        }else {
        	System.out.println(no + " is not prime");
        }

	}

}
