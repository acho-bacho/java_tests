package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BucketSort
{

	public static int[] sort(int[] arrayToSort, int maxVal)
	{
		int[] result = arrayToSort.clone();
		
		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < result.length; i++)
		{
			bucket[result[i]]++;
		}

		
		int outPos = 0;
		for (int i = 0; i < bucket.length; i++)
		{
			for (int j = 0; j < bucket[i]; j++)
			{
				result[outPos++] = i;
			}
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
			int[] sorted = BucketSort.sort(unsorted, Utils.arrayMaxValue(unsorted));

			System.out.println("Bucket sorted: " + Arrays.toString(sorted));
		}
	}
}