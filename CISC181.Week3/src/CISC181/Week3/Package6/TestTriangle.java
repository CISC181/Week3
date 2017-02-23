package CISC181.Week3.Package6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void TestTriangle() {
		Triangle t = new Triangle(3,4,50);
		System.out.println(t.Perimeter());
		try {
			System.out.println(t.Area());
		} catch (TriangleException Te) {
			
			System.out.println("Bad Triangle \n SideA: " + Te.getT().getSideA() + "\n SideB: " + Te.getT().getSideB() + "\n SideC: " + Te.getT().getSideC() + "\n");
			
		}
	}

}
