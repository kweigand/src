/**
 * 
 */
package car;

/**
 * Abstract example class for experimenting 
 * with Abstract objects
 * @author Ken
 *
 */
public abstract class Car {
	
	//Concrete methods 
	void startEngine() {
		//TODO:
	}
	void stop() {
		//TODO:
	}
	
	// Abstract methods
	abstract void goForward();
	abstract void reverse();
	abstract void turn(int whichWay);
	
	
}
