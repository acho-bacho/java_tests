package java_tests;

class OuterClass
{
	private static int i;

	private static void m1()
	{
		System.out.println(i);
	}

	static void m2()
	{
		StaticInnerClass.accessOuterClass();
	}

	
	
	
	static class StaticInnerClass
	{
		static void accessOuterClass()
		{
			i = 1;
			m1();
		}

		void accessOuterClass2()
		{
			m2();
		}
	}
}

public class StaticClass
{
	public static void main(String[] args)
	{
		OuterClass.StaticInnerClass.accessOuterClass(); // Output: 1
		OuterClass.StaticInnerClass ec = new OuterClass.StaticInnerClass();
		ec.accessOuterClass2(); // Output: 1
	}
}