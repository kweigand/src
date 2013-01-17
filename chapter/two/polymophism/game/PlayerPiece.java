/**
 * 
 */
package chapter.two.polymophism.game;

/**
 * PlayerPiece Moves the GamePiece
 * 
 * @author Ken Weigand
 * 
 */
public class PlayerPiece extends GameShape implements Animatable{

	public void movePiece() {
		System.out.println("moving game piece");
	}

	@Override
	public void animate() {
		System.out.println("animating...");
		
	}

	// more implementation code
}
