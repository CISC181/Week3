package CISC181.Week3.Package1;

import java.util.Date;

public class Student extends Person {

	private String Major;
	
	public String getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (String Major)
    {
        this.Major = Major;           
    }
    
    /*
     * 
	public Student() {
		
	}
     */

	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.Major = Major;
		
	}

}
