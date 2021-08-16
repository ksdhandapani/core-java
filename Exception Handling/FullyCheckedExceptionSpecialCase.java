public class FullyCheckedExceptionSpecialCase
{
	public static void main(String[] args)
	{
		try 
		{
			System.out.println("Fully Checked Exception - Special Case");
		}catch(java.io.IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}