package java_basics;



interface One
{
	int x = 1;
	int foo();
}

interface Two
{
	int x = 2;
	int foo();
}

public class InterfaceCollision implements One, Two
{
	public int foo()
	{
		return Two.x;
	}
	public static void main(String[] args)
	{
		InterfaceCollision ic = new InterfaceCollision();
		System.out.println(ic.foo());
	}
}
