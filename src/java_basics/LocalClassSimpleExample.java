package java_basics;


interface MyInterface
{
	void print();
	
}


class Tester
{
	
	 int index = 1;

	
	MyInterface iterator()
	{
		class MyLocalClass implements MyInterface
		{
			int index = 2;

			@Override
			public void print()
			{
				System.out.println("index is " + this.index);
				System.out.println("outer index is " + Tester.this.index);
			}
		}
		return new MyLocalClass();
	}

	
}

public class LocalClassSimpleExample
{
	public static void main(String[] args)
	{
		Tester aTest = new Tester();
		
		MyInterface iter = aTest.iterator();
	
		iter.print();
	}
}

