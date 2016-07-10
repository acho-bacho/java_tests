package java_tests;

public class LambdaExpression
{

	interface IntegerMath
	{
		int operation(int a, int b);
	}
	
	static class Calculator
	{
		public int operateBinary(int a, int b, IntegerMath op)
		{
			return op.operation(a, b);
		}
	}
	
	public static void main(String... args)
	{
		Calculator myApp = new Calculator();
		
		// 1. with lambda
		IntegerMath addition = (a, b) -> a + b;
		
		// 2. with anonymous class
		IntegerMath addition2 = new IntegerMath()
		{
			@Override
			public int operation(int a, int b)
			{
				return a + b;
			}
		};
		
		
		IntegerMath subtraction = (a, b) -> a - b;
		
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition2));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
	}
}
