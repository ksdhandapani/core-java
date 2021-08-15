class Employee 
{
	String employeeId;
	String emailAddress;
	static String companyName = "DSoft";
	static void changeCompanyName()
	{
		companyName = "KSoft";
		sayHello(); // Trying to access and call non-static method from a static method
	}

	public void sayHello()
	{
		System.out.println("Hello...");
	}
}

public class StaticKeywordExample4
{
	public static void main(String[] args)
	{
		Employee.changeCompanyName(); // Calling the static method using class name
	}
}