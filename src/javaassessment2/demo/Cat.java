package javaassessment2.demo;

public class Cat extends AnimalTwo {

	public Cat(String name) {
		super(name);
	}

	
	
	@Override
	public String toString() {
		String everything = super.toString() + String.format(" Sound: %s", makeSound());
		return everything;
	}



	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return null;
	}


}