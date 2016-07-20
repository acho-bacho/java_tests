package samples;

interface IOne
{
	void m();
}



class Parent implements IOne
{
	Parent()
	{
		System.out.println("Parent constructor");
	}
	
	public void m()
	{
		System.out.println("m parent");
	}
}

public class Simple extends Parent 
{
	final String sf = "a";
	
	static
	{
		
	}
	
	public Simple()
	{
		super();

		System.out.println("Simple constructor");
	}
	
	Simple(int a)
	{
		this();
		System.out.println("Simple constructor Simple(int a)");
	}
	public void m()
	{
		System.out.println("m Simple");
		super.m();
	}

	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public static void main(String[] args)
	{
	
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
	}

}
