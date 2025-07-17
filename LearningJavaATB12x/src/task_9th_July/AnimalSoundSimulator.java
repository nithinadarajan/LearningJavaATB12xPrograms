package task_9th_July;

 class Animal {
	 void makeSound() {
		System.out.println("Animal makes sound");
	}
 }
 class Cat extends Animal{
	 void meow() {
		System.out.println("Cat sounds meow");
	}
}
 public class AnimalSoundSimulator {
	public static void main(String[] args) {
	Cat cat= new Cat();
	cat.makeSound();
	cat.meow();
	}
}
