class Employee 
{
	String employeeId;
	String emailAddress;
	static String companyName = "DSoft";
	static void changeCompanyName()
	{
		companyName = "KSoft";
		System.out.println(employeeId); // Trying to access and print non-static data member of a class
	}
}

public class StaticKeywordExample3
{
	public static void main(String[] args)
	{
		Employee.changeCompanyName(); // Calling the static method using class name
	}
}