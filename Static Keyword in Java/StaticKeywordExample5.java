class Employee 
{
	String employeeId;
	String emailAddress;
	static String companyName = "DSoft";
	
	// non-static block 
	{
		System.out.println("Non static block executed");
	}
	// static block 
	static
	{
		System.out.println("Static block executed");
		companyName = "DSoft";
	}

	Employee(String employeeId, String emailAddress)
	{
		this.employeeId = employeeId;
		this.emailAddress = emailAddress;
	}

	void displayEmployeeInfo()
	{
		System.out.println("Employee Id : "+employeeId+", Email Address : "+emailAddress+", Company Name: "+companyName);
	}
}

public class StaticKeywordExample5
{
	public static void main(String[] args)
	{
		Employee employee = new Employee("dhandapani.sudhakar","dhandapani.sudhakar@dsoft.com");
		employee.displayEmployeeInfo();
	}
}