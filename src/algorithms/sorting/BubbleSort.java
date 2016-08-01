package algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort
{
	public static int[] sort(int[] unsorted)
	{
		int[] result = unsorted.clone();

		int tmp;
		for (int i = 0; i < result.length-1; i++)
		{
			for (int j = 1; j < result.length-i; j++)
			{
				if(result[j-1]>result[j])
				{
					//swap
					tmp = result[j-1];
					result[j-1] = result[j];
					result[j] = tmp;
				}
			}
			//System.out.println("Array after "+(i+1)+"th iteration:"+Arrays.toString(result));
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
			int[] sorted = BubbleSort.sort(unsorted);

			System.out.println("Bubble sorted: " + Arrays.toString(sorted));
		}
	}

}
