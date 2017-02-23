package CISC181.Week3.Package5;

public class ClassB {
	
	public static double AddTwoNumbers(int a, int b)
	{
		try
		{
			ClassC.DivideTwoNumbers(a, b);
			return a + b;
		}
		catch (Exception e)
		{
			System.out.println("Exception found in ClassB, throwing to caller ");
			throw e;
		}
	}

}
