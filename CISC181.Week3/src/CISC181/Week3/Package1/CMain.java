package CISC181.Week3.Package1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CMain {

	public static void main(String[] args) {

		CreatePersonInstance();
		CreateStudentInstance();

	}

	private static void CreatePersonInstance() {
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Person per = new Person("Bert", "Randall", "Gibbons", dBirthDate,"214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu");

		per.PrintName();
		
		System.out.print("Is per a instance of Person class? ");
		System.out.println(per instanceof Person);
		System.out.print("Is per a instance of Student class? ");
		System.out.println(per instanceof Student);

	}

	private static void CreateStudentInstance() {
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Student stu = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");

		stu.PrintName();
		
		System.out.print("Is stu a instance of Person class? ");
		System.out.println(stu instanceof Person);
		System.out.print("Is stu a instance of Student class? ");
		System.out.println(stu instanceof Student);
		
		
		Person per;
		per = (Person) stu;

		System.out.print("Is per a instance of Person class? ");
		System.out.println(per instanceof Person);
		System.out.print("Is per a instance of Student class? ");
		System.out.println(per instanceof Student);
		
	}

}
