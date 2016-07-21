package java_basics;

public class NestedClassExample
{
	static int statInt = 11;
	int instInt = 22;
    static class StaticNestedClass 
    {
        public void print()
        {
        	System.out.println("static nested " + statInt);
        }
    }
    class InnerClass 
    {
    	public void print()
        {
        	System.out.println("inner " + NestedClassExample.this.instInt);
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
 