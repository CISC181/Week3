package CISC181.Week3.Package2;

/**
 * 
 * @author Dad
 * @version - 1.0
 * @since - 07/13/2014
 */

abstract class Shape {
	private int x;
	private int y;

	/**
	 * Constructor for Shape
	 * @param newx - Initial "X" coordinate
	 * @param newy - Initial "Y" coordinate 
	 */
	Shape(int newx, int newy) {
		moveTo(newx, newy);
	}

	/**
	 * Getter for 'x'
	 * @return - returns the value for 'x'
	 */
	int getX() {
		return x;
	}

	/**
	 * Getter for 'y'
	 * @return - return the value for 'y'
	 */
	int getY() {
		return y;
	}

	/**
	 * Setter for 'x'
	 * @param newx - value for 'x'
	 */
	
	void setX(int newx) {
		x = newx;
	}

	/**
	 * Setter for 'y'
	 * @param newy - value for 'y'
	 */
	void setY(int newy) {
		y = newy;
	}


	/**
	 * Move shape to new coordinates
	 * @param newx - new 'x' value
	 * @param newy - new 'y' value
	 */
	void moveTo(int newx, int newy) {
		setX(newx);
		setY(newy);
	}

	/**
	 * Move shape using delta values
	 * @param deltax - delta 'x' value
	 * @param deltay - delta 'y' value
	 */
	void rMoveTo(int deltax, int deltay) {
		moveTo(getX() + deltax, getY() + deltay);
	}

	/**
	 * This abstract method will compel any class that inherits this class to implement this method
	 */
	abstract void draw();
	
	
	abstract public double ComputeArea();
}