package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuickSort
{
	int[] m_ArrayToSort;

	public int[] sort(int[] arrayToSort)
	{
		m_ArrayToSort = arrayToSort;

		quickSort(0, arrayToSort.length - 1);

		return m_ArrayToSort;
	}

	private void quickSort(int lowerIndex, int higherIndex)
	{
		int i = lowerIndex;
		int j = higherIndex;
		
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = m_ArrayToSort[lowerIndex + (higherIndex - lowerIndex) / 2];
		
		// Divide into two arrays
		while (i <= j)
		{
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (m_ArrayToSort[i] < pivot)
			{
				i++;
			}
			while (m_ArrayToSort[j] > pivot)
			{
				j--;
			}
			if (i <= j)
			{
				// exchangeNumbers(i, j);
				 int temp = m_ArrayToSort[i];
				 m_ArrayToSort[i] = m_ArrayToSort[j];
				 m_ArrayToSort[j] = temp;
			
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		
		// call quickSort() method recursively
		if (j > lowerIndex)
		{
			quickSort(lowerIndex, j);			
		}
		if (i < higherIndex)
		{
			quickSort(i, higherIndex);			
		}
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

			QuickSort quickSorter = new QuickSort();

			int[] sorted = quickSorter.sort(unsorted);

			System.out.println("QuickSort sorted: " + Arrays.toString(sorted));
		}
	}

}
