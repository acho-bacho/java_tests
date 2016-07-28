package algorithms.arrays;

import java.util.Arrays;

import algorithms.Utils;

public class RotateArray
{
	public static int[] rotateByAcho(int[] arr, int steps)
	{
		int length = arr.length;
		if (steps > length)
		{
			steps = steps % length;
		}

		int[] result = new int[length];

		for (int j = 0; j < length; j++)
		{
			result[j] = arr[j];
		}
		for (int i = 0; i < steps; i++)
		{
			int last = result[length - 1];

			System.arraycopy(result, 0, result, 1, length - 1);
			result[0] = last;

		}
		return result;
	}

	//this is in O(1) space and in O(n) time
	//			Assuming we are given {1,2,3,4,5,6} and order 2. The basic idea is:
	//
	//			1. Divide the array two parts: 1,2,3,4 and 5, 6
	//			2. Reverse first part: 4,3,2,1,5,6
	//			3. Reverse second part: 4,3,2,1,6,5
	//			4. Reverse the whole array: 5,6,1,2,3,4
			
	public static void rotate(int[] arr, int order)
	{
		if (arr == null || arr.length == 0 || order < 0)
		{
			throw new IllegalArgumentException("Illegal argument!");
		}

		if (order > arr.length)
		{
			order = order % arr.length;
		}

		// length of first part
		int a = arr.length - order;

		reverse(arr, 0, a - 1);
		reverse(arr, a, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	public static void reverse(int[] arr, int left, int right)
	{
		if (arr == null || arr.length == 1)
			return;

		while (left < right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args)
	{
		while (true)
		{
			String line = Utils.getLine("enter int array");
			int[] arr = Utils.stringToIntArray(line);
			String steps = Utils.getLine("number of steps to rotate");

			System.out.println("rotated : " + Arrays.toString(RotateArray.rotateByAcho(arr, Integer.parseInt(steps))));
			RotateArray.rotate(arr, Integer.parseInt(steps));
			System.out.println("rotated : " + Arrays.toString(arr));
		}

	}

}
