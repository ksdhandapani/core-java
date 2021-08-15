public class StaticKeywordExample8OuterClass 
{
	public static String message = "Hello...";
	static class StaticKeywordExample8InnerClass
	{
		void printMessage()
		{
			System.out.println("The message is : "+message);
		}
	}

	public static void main(String[] args)
	{
		StaticKeywordExample8OuterClass.StaticKeywordExample8InnerClass obj = new StaticKeywordExample8OuterClass.StaticKeywordExample8InnerClass();
		obj.printMessage();
	}
}