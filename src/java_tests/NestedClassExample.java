package java_tests;

public class NestedClassExample
{
    static class StaticNestedClass 
    {
        public void print()
        {
        	System.out.println("static nested");
        }
    }
    class InnerClass 
    {
    	public void print()
        {
        	System.out.println("inner");
        }
    }
    
	public static void main(String[] args)
	{
		
		
		NestedClassExample.StaticNestedClass snc = new NestedClassExample.StaticNestedClass();
		snc.print();
		
		NestedClassExample nce = new NestedClassExample();
		
		NestedClassExample.InnerClass inner = nce.new InnerClass();
		
		inner.print();
		
		//changes
	}

}
 