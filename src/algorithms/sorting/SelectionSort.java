package algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectionSort
{
	public static int[] sort(int[] unsorted)
	{
		int[] result = unsorted.clone();

		for (int i = 0; i < result.length-1; i++)
		{
			int minPos = i; //position of minimum element
			for (int j = i+1; j < result.length; j++)
			{
				if(result[j]<result[minPos])
				{
					minPos=j;
				}
			}
			int smallest = result[minPos];
			result[minPos] = result[i];
			result[i] = smallest;
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
			int[] sorted = SelectionSort.sort(unsorted);

			System.out.println("SelectionSort sorted: " + Arrays.toString(sorted));
		}
	}

}
