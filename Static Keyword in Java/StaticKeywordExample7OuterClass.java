public class StaticKeywordExample7OuterClass 
{
	public static String message = "Hello...";
	static class StaticKeywordExample7InnerClass
	{
		static void displayMessage()
		{
			System.out.println("The message is : "+message);
		}
	}

	public static void main(String[] args)
	{
		StaticKeywordExample7InnerClass.displayMessage();
	}
}