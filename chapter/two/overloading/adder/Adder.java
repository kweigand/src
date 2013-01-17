package chapter.two.overloading.adder;

public class Adder {
	public int addThem(int x, int y) {
		return x + y;
	}
	
	//overload the addThem method to add doubles instead of ints 
	public double addThem(double x, double y) {
		return x + y;
	}
}
