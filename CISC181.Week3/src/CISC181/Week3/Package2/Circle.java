package CISC181.Week3.Package2;

public class Circle extends Shape implements iShape {
	
	/*
	 * Field - Radius.  Stores the value of the radius for the shape.
	 */
	private int radius;
	final double PI = 3.14159;
			
	// constructor
	Circle(int newx, int newy, int newradius) {
		super(newx, newy);
		setRadius(newradius);
	}

	/*
	 * {@link Circle#radius}
	 */
	int getRadius() {
		return radius;
	}

	/*
	 * {@link Circle#radius}
	 */
	void setRadius(int newradius) {
		radius = newradius;
	}

	@Override
	public double ComputeArea()
	{
		return this.radius * this.radius * PI;
	}
	// draw the circle
	public void draw() {
		System.out.println("Drawing a Circle at:(" + getX() + ", " + getY()
				+ "), radius " + getRadius());
	}
}