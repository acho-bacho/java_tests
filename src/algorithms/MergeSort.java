package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSort
{
	private int[] m_Array;
	private int[] m_HelperArray;
	private int size;

	public int[] sort(int[] arrToSort)
	{
		this.m_Array = arrToSort;
		size = arrToSort.length;
		this.m_HelperArray = new int[size];
		mergeSort(0, size - 1);
		
		return m_Array;
	}

	private void mergeSort(int low, int high)
	{
		// check if low is smaller then high, if not then the array is sorted
		if (low < high)
		{
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;

			// Sort the left side of the array
			mergeSort(low, middle);
			// Sort the right side of the array
			mergeSort(middle + 1, high);

			// Combine them both
			merge(low, middle, high);
			//System.out.println("[low:"+low+"] [high:"+high+"] mergeSort: " + Arrays.toString(m_Array));
		}
	}

	private void merge(int low, int middle, int high)
	{
		// Copy both parts into the helper array
		for (int i = low; i <= high; i++)
		{
			m_HelperArray[i] = m_Array[i];
		}

		int helperLow = low;
		int helperMiddle = middle + 1;
		int actualIndex = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (helperLow <= middle && helperMiddle <= high)
		{
			if (m_HelperArray[helperLow] <= m_HelperArray[helperMiddle])
			{
				m_Array[actualIndex++] = m_HelperArray[helperLow++];
			}
			else
			{
				m_Array[actualIndex++] = m_HelperArray[helperMiddle++];
			}
			
		}
		// Copy the rest of the LEFT side of the array into the target array
		while (helperLow <= middle)
		{
			m_Array[actualIndex++] = m_HelperArray[helperLow++];
			
		}
		//Copy the rest of the RIGHT side of the array into the target array
		while (helperMiddle <= high)
		{
			m_Array[actualIndex++] = m_HelperArray[helperMiddle++];
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
			}
			catch (Exception e)
			{
				System.out.println("Error reading");
			}

			int[] unsorted = Utils.stringToIntArray(line);
			
			MergeSort mergeSorter = new MergeSort();
			
			
			int[] sorted = mergeSorter.sort(unsorted);
			System.out.println("MergeSort sorted: " + Arrays.toString(sorted));
		}
	}
}
