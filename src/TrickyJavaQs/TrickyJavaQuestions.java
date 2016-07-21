package TrickyJavaQs;

import java.util.HashSet;

public class TrickyJavaQuestions
{

	public static void main(String[] args)
	{
		System.out.println("1. ----------------------");
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
		System.out.println(s1 == s2);

		System.out.println("2. ----------------------");
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));

		System.out.println("3. ----------------------");
		HashSet<Short> shortSet = new HashSet<Short>();
		for (short i = 0; i < 100; i++)
		{
			shortSet.add(i);
			shortSet.remove(i - 1); // shortSet.remove((short) (i - 1));
		}
		System.out.println(shortSet.size());

		System.out.println("4. ----------------------");
		String str = null;
		String str1 = "abc";
		System.out.println(str1.equals("abc") || str.equals(null)); // System.out.println(str1.equals("abc")
																	// |
																	// str.equals(null));
		System.out.println("5. ----------------------");
		class InnerClassTest
		{
			public  void method(Object o)
			{
				System.out.println("Object impl");
			}

			public  void method(String s)
			{
				System.out.println("String impl");
			}
		}
		InnerClassTest tst = new InnerClassTest();
		tst.method(null); //compiler picks the most specific function. Obviously String class is more specific 
		
		System.out.println("6. ----------------------");
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
		
	}

}
