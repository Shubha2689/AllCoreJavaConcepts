package core.java.allconcept.keywords;

public class Animal {
	String color = "White";

	void eating() {
		System.out.println("Dog eating food......");

	}

	public Animal() {
		System.out.println("Animal is created");

	}

}

class Dog extends Animal {

	String color = "Black";

	void Dog() {

		System.out.println("Dog is created");

	}

	public void DisplayColor() {
		System.out.println(color);

	}

	void eating() {
		System.out.println("Dog is paying......");
		super.eating();
	}

}
