package CISC181.Week3.Package5;

public class ClassC {

	
	public static double DivideTwoNumbers(int a, int b)
	{
		try
		{
			return a / b;
		}
		catch (Exception e)
		{
			System.out.println("Exception found in ClassC, throwing to caller ");
			throw e;
		}
	}
}
