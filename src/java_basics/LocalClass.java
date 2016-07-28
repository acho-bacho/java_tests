package java_basics;


public class LocalClass
{
}

class A
{
	protected char a = 'a';
}

class B
{
	protected char b = 'b';
}

class C extends A
{
	private char c = 'c'; // Private fields visible to local class
	public static char d = 'd';

	public void createLocalObject(final char e)
	{
		final char f = 'f';
		int i = 0; // i not final; not usable by local class
		class Local extends B
		{
			char g = 'g';

			public void printVars()
			{
				// All of these fields and variables are accessible to this
				// class
				System.out.println(g); // (this.g) g is a field of this class
				System.out.println(f); // f is a final local variable
				System.out.println(e); // e is a final local parameter
				System.out.println(d); // (C.this.d) d -- field of containing
										// class
				System.out.println(c); // (C.this.c) c -- field of containing
										// class
				System.out.println(b); // b is inherited by this class
				System.out.println(a); // a is inherited by the containing class
			}
		}
		Local l = new Local(); // Create an instance of the local class
		l.printVars(); // and call its printVars() method.
	}
}