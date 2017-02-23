package CISC181.Week3.Package6;

public class Triangle {

	private int SideA;
	private int SideB;
	private int SideC;
	public Triangle(int sideA, int sideB, int sideC) {
		super();
		SideA = sideA;
		SideB = sideB;
		SideC = sideC;
	}
	
	public int getSideA() {
		return SideA;
	}

	public int getSideB() {
		return SideB;
	}

	public int getSideC() {
		return SideC;
	}

	public double Perimeter()
	{
		return SideA + SideB + SideC;
	}	
	private double HalfPerimeter()
	{
		return Perimeter()/2;
	}
	public double Area() throws TriangleException
	{
		double Area = 0;
		try
		{
			Area = Math.sqrt(HalfPerimeter()*(HalfPerimeter()-SideA)*(HalfPerimeter()-SideB)*(HalfPerimeter()-SideC));
			
			if (Double.isNaN(Area))
			{
				throw new TriangleException(this);
			}
			
		}
		catch (TriangleException e)
		{
			throw e;
		}
		catch (Exception e)
		{
			throw e;
		}
		
		return Area;
	}
}
