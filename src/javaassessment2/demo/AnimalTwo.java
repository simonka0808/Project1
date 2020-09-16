package javaassessment2.demo;

public abstract class AnimalTwo {
	
	private String name;
	
	public AnimalTwo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract public String makeSound();

	@Override
	public String toString() {
		return String.format("Name: %s", this.getName());
	}
	
	
}
