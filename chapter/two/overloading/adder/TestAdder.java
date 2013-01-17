package chapter.two.overloading.adder;

public class TestAdder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Adder a = new Adder();
		int b = 27;
		int c = 37;
		double d = 43.59;
		double e = 50.2;
		int intResult = a.addThem(b, c); //
		double doubleResult = a.addThem(d, e);
		
		System.out.println("intResult is " + intResult);
		System.out.println("doubleResult is " + doubleResult);

	}

} 
