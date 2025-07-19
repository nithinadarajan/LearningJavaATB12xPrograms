package task_10th_July;
//Method Overriding

class Animal {
	void sound() {
		System.out.println("Animal do sound differently");
	}
}
//Subclass Dog overrides sound()
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("bark");
	}
}
//Subclass Cat overrides sound()
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("meow");
	}
}
//Subclass Cow overrides sound()
class Cow extends Animal {
	@Override
	void sound() {
		System.out.println("moo");
	}
}
public class AnimalSounds {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal cow= new Cow();  
		
		
		dog.sound();  // Outputs: Bark
		cat.sound(); 	// Outputs: Meow
		cow.sound();	// Outputs: Moo
		
		

	}

}
