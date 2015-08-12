package CISC181.Week3.Package3;

public class CMain {

	public static void main(String[] args) {
		
		HandleException1();
		HandleException2();

	}
	
	private static void HandleException1()
	{
	      try{
	          int a[] = new int[2];
	          System.out.println("Access element three :" + a[3]);
	       }catch(ArrayIndexOutOfBoundsException e){
	          System.out.println("Exception thrown  :" + e);	          
	       }
	       System.out.println("Out of the block");
	}

	
	private static void HandleException2()
	{
	      try{	          
	    	  SubMethod();
	       }catch(ArrayIndexOutOfBoundsException e){
	          System.out.println("Exception thrown  :" + e);	          
	       }

		
	}
	
	private static void SubMethod()
	{
	
		
	      try{
	          int a[] = new int[2];
	          System.out.println("Access element three :" + a[3]);
	       }catch(ArrayIndexOutOfBoundsException e){
	          System.out.println("Exception thrown  :" + e);	          
	       }
	       System.out.println("Out of the block");
	
	}
}
