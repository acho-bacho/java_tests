package java_basics;

import java.util.function.Consumer;

public class LambdaScopesTest
{
	public int x = 0;

	class FirstLevel
	{
		public int x = 1;

		void methodInFirstLevel(int x)
		{
			// The following statement causes the compiler to generate
			// the error "local variables referenced from a lambda expression
			// must be final or effectively final" in statement A:
			//
			// x = 99;

			Consumer<Integer> myConsumer = (y) -> {
				System.out.println("x = " + x); // Statement A
				System.out.println("y = " + y);
				System.out.println("this.x = " + this.x);
				System.out.println("LambdaScopesTest.this.x = " + LambdaScopesTest.this.x);
			};

			myConsumer.accept(x);

		}
	}

	public static void main(String... args)
	{
		LambdaScopesTest st = new LambdaScopesTest();
		LambdaScopesTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}