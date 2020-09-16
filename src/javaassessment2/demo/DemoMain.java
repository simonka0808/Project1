package javaassessment2.demo;

public class DemoMain {
	
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		AnimalTwo cat1 = new Cat("Cetty");

		System.out.println(animal1.makeSound());
		System.out.println(cat1.toString());
	}
	
}
