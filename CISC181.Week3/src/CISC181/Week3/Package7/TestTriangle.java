package CISC181.Week3.Package7;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void TestTriangles() {
		
		
		Triangle t1 = new Triangle(2,2,2);
		Triangle t2 = new Triangle(3,4,5);
		Triangle t3 = new Triangle(1,1,1);
		Triangle t4 = new Triangle(1,1,100);
		
		ArrayList<Triangle> Triangles = new ArrayList<Triangle>();
		
		if (t1.isValid())
			Triangles.add(t1);
		if (t2.isValid())
			Triangles.add(t2);
		if (t3.isValid())
			Triangles.add(t3);
		if (t4.isValid())
			Triangles.add(t4);

		Collections.sort(Triangles);
		
		for (Triangle t: Triangles)
		{
			try {
				System.out.println(t.Area());
			} catch (TriangleException e) {
				
				System.out.println("Bad Triangle, can't sort");
			}
		}
		
	}

}
