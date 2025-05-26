package Programs;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter you grade");
	        String Grade = sc.next().toUpperCase();
	        switch (Grade){
	            case "A" :
	                System.out.println("Excellent");
	                break;
	            case "B" :
	                System.out.println("Very Good");
	                break;
	            case "C" :
	                System.out.println("Good");
	                break;
	            case "D" :
	                System.out.println("Need Improvement");
	                break;

	            case "F" :
	                System.out.println("Fail");
	                break;
	            default:
	                System.out.println("Invaild Grade");

	        }

	}

}
