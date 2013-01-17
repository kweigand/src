package chapter.two.reference.variable.casting;

public class DogTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a1 = d;
		Animal a2 = (Animal) d;
		d.playDead();
		d.makeNoise();
		a1.makeNoise();
		a2.makeNoise();

	}

}
