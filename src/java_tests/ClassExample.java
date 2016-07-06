package java_tests;

public class ClassExample
{
	protected int m_intProtected = 20;
	int m_intPackagePrivate = 33;
	
	public class NestedClass
	{
		public int m_intNested = 55;
		public final int getNestedInd()
		{
			return m_intNested;
		}
	}
	
	NestedClass m_Nested = new NestedClass();
	
	public void test()
	{
		m_Nested.getNestedInd();
	}
}
