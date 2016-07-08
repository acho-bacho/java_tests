package java_tests.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;

enum Color
{
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
	private int r, g, b;

	private Color(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public String toString()
	{
		return "R = " + r + ", G = " + g + ", B = " + b;
	}
}

public class MapDemo
{

	public static void main(String[] args)
	{
		Map<String, Color> colorMap = new TreeMap<String, Color>();
		colorMap.put("red", Color.RED);
		colorMap.put("blue", Color.BLUE);
		colorMap.put("green", Color.GREEN);
		colorMap.put("RED", Color.RED);
		for (String colorKey : colorMap.keySet())
		{
			System.out.println(colorKey);
			System.out.println(colorMap.get(colorKey));
		}

		Collection<Color> colorValues = colorMap.values();

		for (Iterator<Color> it = colorValues.iterator(); it.hasNext();)
		{
			System.out.println(it.next());
		}

		for (Map.Entry<String, Color> colorEntry : colorMap.entrySet())
		{
			System.out.println(colorEntry.getKey() + " >>>> " + colorEntry.getValue());
		}

		////////////////////

		Map<String, Integer> msi = new TreeMap<String, Integer>();
		String[] fruits = { "apples", "pears", "grapes", "bananas", "kiwis" };
		
		int[] quantities = { 10, 15, 8, 17, 30 };
		
		for (int i = 0; i < fruits.length; i++)
		{
			msi.put(fruits[i], quantities[i]);			
		}
		for (Map.Entry<String, Integer> entry : msi.entrySet())
		{
			System.out.println(entry.getKey() + ": " + entry.getValue());			
		}

	}

}
