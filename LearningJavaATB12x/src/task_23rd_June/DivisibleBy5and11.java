package task_23rd_June;

import java.util.Scanner;

public class DivisibleBy5and11 {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter the number");
	        int num=scanner.nextInt();
	        System.out.println("Enter the first divider");
	        int d1=scanner.nextInt();
	        System.out.println("Enter the second divider");
	        int d2=scanner.nextInt();
	        if(num%d1==0 && num%d2==0){
	            System.out.println("Number_is_Divisible_by_d1_and_d2");
	        } else if (num%d1 ==0 ) {
	            System.out.println("number is divisable by d1 only");
	        } else if (num%d2 ==0 ) {
	            System.out.println("number is divisable by d2 only");
	        } else
	            System.out.println("Number is not divisable by d1 nor d2");

	}

}
