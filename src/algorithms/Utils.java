package algorithms;

import java.util.Arrays;


public class Utils
{
	public static int[] stringToIntArray(String inputString)
	{
		String[] items = inputString.split(",");

		int[] results = new int[items.length];

		for (int i = 0; i < items.length; i++)
		{
			try
			{
				results[i] = Integer.parseInt(items[i]);
			} 
			catch (NumberFormatException nfe)
			{
			}
		}

		return results;
	}

	public static int arrayMaxValue(int array[])
	{
		return Arrays.stream(array).max().getAsInt();
	}
}
