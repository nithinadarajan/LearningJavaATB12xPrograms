package task_23rd_June;

import java.util.Scanner;

public class WebsiteIdentification {

	public static void main(String[] args) {
		   Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter the website url");
	        String url=scanner.nextLine();
	        if(url.contains(".com")){
	            System.out.println("The website type is: Commercial website");
	        } else if (url.contains(".org")) {
	            System.out.println("The website type is: Non-profit organization");
	        } else if (url.contains(".edu")) {
	            System.out.println("The website type is: Educational institution");
	        }else if(url.contains(".gov")){
	            System.out.println("The website type is: Government website");
	        } else if (url.contains(".net")) {
	            System.out.println("The website type is: Network-related website");
	        } else if (url.contains(".info")) {
	            System.out.println("The website type is: Informational website");
	        }else System.out.println("The website type is: Unknown or other types of websites");

	}

}
