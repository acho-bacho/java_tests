package java_basics;

public class InitDemo
{
	static double double1Static;
	double double2;
	static int int1Static;
	int int2;
	static String string1Static;
	String string2;
	boolean bool;
	static boolean staticBool;

	static
	{
		System.out.println("[class] double1Static = " + double1Static);
		System.out.println("[class] int1Static = " + int1Static);
		System.out.println("[class] string1Static = " + string1Static);
		System.out.println("[class] staticBool = " + staticBool);
		System.out.println();
	}

	{
		System.out.println("[instance] double2 = " + double2);
		System.out.println("[instance] int2 = " + int2);
		System.out.println("[instance] string2 = " + string2);
		System.out.println("[instance] bool = " + bool);
		System.out.println();
	}

	static
	{
		double1Static = 1.0;
		int1Static = 1000000000;
		string1Static = "abc";
		staticBool = true;
	}

	{
		double2 = 1.0;
		int2 = 1000000000;
		string2 = "abc";
		bool = true;
	}

	InitDemo()
	{
		System.out.println("InitDemo() constructor called");
		System.out.println();
	}

	static double double3Static = 10.0;
	double double4 = 10.0;

	static
	{
		System.out.println("[class] double3Static = " + double3Static);
		System.out.println();
	}

	{
		System.out.println("[instance] double4 = " + double4);
		System.out.println();
	}

	public static void main(String[] args)
	{
		System.out.println("main() started");
		System.out.println();
		System.out.println("[class] double1Static = " + double1Static);
		System.out.println("[class] double3Static = " + double3Static);
		System.out.println("[class] int1Static = " + int1Static);
		System.out.println("[class] string1Static = " + string1Static);
		System.out.println();
		for (int i = 0; i < 2; i++)
		{
			System.out.println("About to create InitDemo object");
			System.out.println();
			InitDemo id = new InitDemo();
			System.out.println("id created");
			System.out.println();
			System.out.println("[instance] id.double2 = " + id.double2);
			System.out.println("[instance] id.double4 = " + id.double4);
			System.out.println("[instance] id.int2 = " + id.int2);
			System.out.println("[instance] id.string2 = " + id.string2);
			System.out.println();
		}
	}
}