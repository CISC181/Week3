package CISC181.Week3.Package5;

public class ClassA {

	public static double HandleTwoNumbers(int a, int b)
	{
		double c = 0;
		try
		{
			c= ClassB.AddTwoNumbers(a, b);	
		}
		catch (Exception e)
		{
			System.out.println("Exception found in ClassA, handling it ");
			System.out.println(e.getStackTrace());
		}

		return c;
	}
}
