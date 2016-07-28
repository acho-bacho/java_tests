package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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

	public static String getLine(String... args)
	{
		String msg="";
		if(args.length==0)
		{
			msg = "Enter string:";
		}
		else
		{
			msg = args[0];
		}
		String line = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.println(msg);
			line = in.readLine();
		}
		catch (Exception e)
		{
			System.out.println("Error reading");
		}

		return line;
	}
}
