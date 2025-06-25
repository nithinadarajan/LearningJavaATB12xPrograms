package task_23rd_June;

import java.util.Scanner;

public class SeniorCitizenCheck {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter the age");
	        int age=scanner.nextInt();
	        if(age<12){
	            System.out.println("Person is: Child");
	        }else if(age>=13 && age<=19){
	            System.out.println("Person is: Teenager");
	        }else if(age>=20 && age<=64){
	            System.out.println("Person is: Adult");
	        }else if(age>=65){
	            System.out.println("person is: Senior Citizen");

	        }
	}
}
