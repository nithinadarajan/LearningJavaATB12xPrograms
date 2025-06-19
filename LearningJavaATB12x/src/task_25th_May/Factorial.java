package task_25th_May;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no: ");
		int no = sc.nextInt();
		int fact = 1;
        if( no == 0){
            fact = 1;
        }

        if(no > Integer.MAX_VALUE){ // if(n > 2147483647){
            System.out.println("I can't handle the number > Max of Int");
        }


        for (int i = 1; i <= no ; i++) {
            fact = fact*i;
        }

        System.out.println(fact);


	}

}
