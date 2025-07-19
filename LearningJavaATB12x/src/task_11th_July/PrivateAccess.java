package task_11th_July;
class Person {
    private String name = "John Doe";

    // Getter for name
    public String getName() {
        return name;
    }
}
public class PrivateAccess {

	public static void main(String[] args) {
		 Person person = new Person();
	        System.out.println("Name: " + person.getName());
	}

}
