class Employee 
{
	String employeeId;
	String emailAddress;
	static String companyName = "DSoft";

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

public class StaticKeywordExample1
{
	public static void main(String[] args)
	{
		Employee emp1=new Employee("dhandapani.sudhakar","dhandapani.sudhakar@dsoft.com");
		emp1.displayEmployeeInfo();
		Employee emp2=new Employee("mallini.baskar","mallini.baskar@dsoft.com");
		emp2.displayEmployeeInfo();

	}
}