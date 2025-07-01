package test_28th_June_String;

public class CompareStrings {

	public static void main(String[] args) {
		//Declaring two strings
				String str1="Hello";
				String str2="Hello";
				
		// Create a new String object
		        String str3 = new String("Hello");

		// == operator (checks reference)
		System.out.println("Using '==' operator:");
		System.out.println("str1 == str2: " + (str1 == str2)); // true (same reference in string pool)
		System.out.println("str1 == str3: " + (str1 == str3)); // false (str3 is a new object)
		
		// equals() method (checks content)
        System.out.println("\nUsing equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        
        // equalsIgnoreCase() method
        String str4 = "HELLO";
        System.out.println("\nUsing equalsIgnoreCase() method:");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true
        
        // compareTo() method (lexicographical comparison)
        String str5 = "Apple";
        String str6 = "Banana";
        System.out.println("\nUsing compareTo() method:");
        System.out.println("str5.compareTo(str6): " + str5.compareTo(str6)); // < 0
        System.out.println("str6.compareTo(str5): " + str6.compareTo(str5)); // > 0
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // 0 (same content)


	}

}
