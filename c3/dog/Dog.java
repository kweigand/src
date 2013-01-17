package c3.dog;

class Collar {
}

public class Dog {

	/**
	 * @param args
	 */
	Collar c; // Ins variable
	String name; // Ins variable

	public static void main(String[] args) {

		Dog d;
		d = new Dog();
		d.go(d);

	}

	void go(Dog dog) {
		c = new Collar();
		dog.setName("Akio");
		System.out.println(dog.name + " is born.");
	}

	void setName(String dogName) {
		name = dogName;

	}

}
