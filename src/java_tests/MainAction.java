package java_tests;

public class MainAction
{
	public static void main(String[] args)
	{
		System.out.println("test");
		
		
		
		
		ClassExample ex = new ClassExample();
		System.out.println(ex.m_intProtected);
		System.out.println(ex.m_intPackagePrivate);
		ex.m_Nested.getNestedInd();
	}
}



