package ex1;

import fyw.turtles.*;

public class Ex1Squares {

	/**
	 * create turtle in a GUI, and an input frame
	 * 
	 * @param args
	 *            strings from command line
	 */
	public static void main(String[] args) {
		Turtle theTurtle = new Turtle();
		new TurtleGUI(theTurtle);
		@SuppressWarnings("unused")
		InputFrame theInputFrame = new InputFrame();

		/*
		 * Write your own code and comments within the area below
		 * vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
		 */

		//drawSquare(theTurtle, 100);
		//drawSquareGrid(theTurtle, 100, 3, 4, 20);
		threeSquareGrid(theTurtle);

		/*
		 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		 * Write your own code and comments within the area above
		 */

	}

	private static void drawSquare(Turtle theTurtle, int lengthOfSide) {
		//Check that lengthOfSide is positive
		if(lengthOfSide == 0){
			lengthOfSide = 1;
		} else if(lengthOfSide < 0){
			lengthOfSide = Math.abs(lengthOfSide);
		}
		
		theTurtle.penDown();
		for (int i = 0; i < 4; i++) {
			theTurtle.move(lengthOfSide);
			theTurtle.turn(90);
		}
		theTurtle.penUp();

	}

	private static void drawSquareGrid(Turtle theTurtle, int lengthOfSide,
			int gridWidth, int gridHeight, int distanceBetweenSquares) {
		//Check that some of the parameters (apart from theTurtle) are positive
		if(lengthOfSide == 0){
			lengthOfSide = 1;
		} else if(lengthOfSide < 0){
			lengthOfSide = Math.abs(lengthOfSide);
		}
		
		if(gridWidth < 0){
			gridWidth = Math.abs(gridWidth);
		}
		
		if(gridHeight < 0){
			gridHeight = Math.abs(gridHeight);
		}
		
		if(distanceBetweenSquares < 0){
			distanceBetweenSquares = Math.abs(distanceBetweenSquares);
		}
		
		//Ensure pen is up, just in case a previous function left it down
		theTurtle.penUp();

		// Draw a grid of squares
		// LOOP INVARIANT: i < gridHeight
		for (int i = 0; i < gridHeight; i++) {
			// Draw a row of squares
			// LOOP INVARIANT: j < gridWidth
			for (int j = 0; j < gridWidth; j++) {
				drawSquare(theTurtle, lengthOfSide);
				theTurtle.turn(90);
				theTurtle.move(lengthOfSide + distanceBetweenSquares);
				// Return to original orientation
				theTurtle.turn(270);
			}

			// Move back to start of row
			theTurtle.turn(270);
			theTurtle.move((lengthOfSide + distanceBetweenSquares) * gridWidth);
			theTurtle.turn(90);
			
			/* The two successive turning actions here could be combined into one
			 * however, for clarity I will leave keep them separated
			 */
			
			// Move to start of next row
			theTurtle.move(lengthOfSide + distanceBetweenSquares);

		}
		
		// Return to original position
		theTurtle.turn(180);
		theTurtle.move((lengthOfSide + distanceBetweenSquares) * gridHeight);
		theTurtle.turn(180);

		
	}
	
	private static void threeSquareGrid(Turtle theTurtle){
		//Draw the first grid
		drawSquareGrid(theTurtle, 210, 2, 2, 2);
		
		//Move diagonally up to keep the grids inside of each other
		theTurtle.move(2);
		theTurtle.turn(90);
		theTurtle.move(2);
		theTurtle.turn(270);
		
		//Draw the second grid
		drawSquareGrid(theTurtle, 100, 4, 4, 6);
		
		//Move diagonallly up to keep the grids inside of each other
		theTurtle.move(6);
		theTurtle.turn(90);
		theTurtle.move(6);
		theTurtle.turn(270);
		
		//Draw the third grid
		drawSquareGrid(theTurtle, 35, 8, 8, 18);
		
		//Return to original position
		theTurtle.turn(180);
		theTurtle.move(8);
		theTurtle.turn(90);
		theTurtle.move(8);
		theTurtle.turn(90);
	}
}
