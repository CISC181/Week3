package CISC181.Week3.Package6;

public class TriangleException extends Exception {

	private Triangle t;

	public TriangleException(Triangle t) {
		super();
		this.t = t;
	}

	public Triangle getT() {
		return t;
	}
	
}
