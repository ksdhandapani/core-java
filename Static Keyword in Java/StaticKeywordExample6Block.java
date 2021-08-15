import java.util.*;

public class StaticKeywordExample6Block 
{
	public static Map<Integer, String> hashMap = new HashMap<Integer, String>();
    public static Set<String> hashSet = new HashSet<String>();
    
    static
    {
    	System.out.println("Executing static block");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");    
        hashMap.put(3, "Three");
        
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
    }

    public static void main(String[] args)
	{
		System.out.println("Executing Main method");
		StaticKeywordExample6Block obj = new StaticKeywordExample6Block();
        System.out.println("HashMap values : "+ hashMap);
        System.out.println("HashSet values : "+ hashSet);
	}
}

