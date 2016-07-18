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
	
		double total = 0;
		for (int i = 0; i < 50; i++)
		{
			total += 0.1;
		}
		System.out.println(total);
		try
		{
			Simple s = null;
			
			s = new Simple(1);
			s.m();
			System.out.println(s.sf);
			
		} 
		finally
		{
			System.out.println("FINALLY");
		}
	}

}
