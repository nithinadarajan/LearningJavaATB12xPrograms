package task_23rd_June;

import java.util.Scanner;

public class ConversionOfDaysIntoYrs {

	public static void main(String[] args) {
		  int year=0;
	        int months=0;
	        int leftout_days=0;
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter the no of days");
	        int days=scanner.nextInt();
	        if(days>=365){
	            year=days/365;
	            int remaining_days=days%365;
	            if(remaining_days>=30){
	                months=remaining_days/30;
	                leftout_days=remaining_days%30;
	            } else if (remaining_days<30) {
	                leftout_days=remaining_days;
	            }
	        } else if (days<365) {
	            months=days/30;
	            leftout_days=days%30;

	        }

	        System.out.println(year+"  years  "+months+"   Months   "+leftout_days+"  days   ");

	}

}
