package samples;

public class JavaPassByValue
{
	public static void main(String[] args)
	{

		Balloon red = new Balloon("Red"); // memory reference 50
		Balloon blue = new Balloon("Blue"); // memory reference 100

		swap(red, blue);
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		foo(blue);
		System.out.println("blue color=" + blue.getColor());
		
		
		int zero = 0;
		Balloon.intTest(zero);
		System.out.println("zero is " + zero);
		
		Integer zero2 = new Integer(0);
		
		Balloon.integerTest(zero2);
		System.out.println("zero2 is " + zero2);
		

	}

	private static void foo(Balloon balloon)
	{ // baloon=100
		balloon.setColor("Red"); // baloon=100
		balloon = new Balloon("Green"); // baloon=200
		balloon.setColor("Blue"); // baloon = 200
	}

	// Generic swap method
	public static void swap(Object o1, Object o2)
	{
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}
}

class Balloon
{
	private String color;

	public Balloon()
	{
	}

	public Balloon(String c)
	{
		this.color = c;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	public static void intTest(int testme)
	{
		testme = 999;
	}
	
	public static void integerTest(Integer testme)
	{
		testme = 999;
	}
}