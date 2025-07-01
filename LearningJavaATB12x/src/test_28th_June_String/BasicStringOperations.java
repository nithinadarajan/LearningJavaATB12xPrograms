package test_28th_June_String;

public class BasicStringOperations {

	public static void main(String[] args) {
		//Declaring two strings
		String firstName="Nithi";
		String lastName="devi";
		
		//concatenation
		String fullName = firstName + lastName;
		System.out.println(fullName); 
		
		//length of fullName
		System.out.println(fullName.length()); 
		
		//substring extract "devi"
		String lastPart =fullName.substring(5,9);
		System.out.println(("substring(6,9)" + lastPart));
		
		//character extraction
		char charAt0=fullName.charAt(0);
		System.out.println("Character at index 0: '" + charAt0 + "'");
		
		char lastchar=fullName.charAt(fullName.length()-1);
		System.out.println("Last character: '" +lastchar + "'");
		
	}

}
 