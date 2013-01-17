package chapter.two.polymophism.game;

import java.awt.Shape;

public class TestShapes {

	/**
	 * test class for Game
	 * @param args
	 * @author Kenneth Weigand
	 */
	public static void main(String[] args) {
		PlayerPiece playerPiece = new PlayerPiece();
		TileShape tileShape = new TileShape();
		doShapes(playerPiece);
		doShapes(tileShape);
		
	}
	
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}

}
