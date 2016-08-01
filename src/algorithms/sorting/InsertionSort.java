package algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort
{
	public static int[] sort(int[] unsorted)
	{
		int[] result = unsorted.clone();

		for (int i = 1; i < result.length; i++)
		{
			int valueToSort = result[i];
			int j = i;
			while (j > 0 && result[j - 1] > valueToSort)
			{
				result[j] = result[j - 1];
				j--;
			}
			result[j] = valueToSort;
		}

		return result;
	}

	public static void main(String[] args)
	{
		String line = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true)
		{
			try
			{
				System.out.println("Enter comma delimited array:");
				line = in.readLine();
			} catch (Exception e)
			{
				System.out.println("Error reading");
			}

			int[] unsorted = Utils.stringToIntArray(line);
			int[] sorted = InsertionSort.sort(unsorted);

			System.out.println("sorted: " + Arrays.toString(sorted));
		}
	}

}
