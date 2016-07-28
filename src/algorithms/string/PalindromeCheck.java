package algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;



public class PalindromeCheck
{
	public static boolean check(String str)
	{
		if(str==null || str.equals(""))
		{
			return false;
		}
		StringBuffer buffer = new StringBuffer(str);
		return buffer.toString().equals(buffer.reverse().toString());
	}
	
	public static boolean check2(String str)
	{
		if(str==null || str.equals(""))
		{
			return false;
		}
		
		int length = str.length();
		
		for (int i = 0; i < length/2; i++)
		{
			if(str.charAt(i)!=str.charAt(length-i-1))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String line = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true)
		{
			try
			{
				System.out.println("Enter string:");
				line = in.readLine();
			}
			catch (Exception e)
			{
				System.out.println("Error reading");
			}

			System.out.println(line + " is palindrome: " + PalindromeCheck.check(line));
			System.out.println(line + " is palindrome2: " + PalindromeCheck.check2(line));
			
			byte[] bytes = line.getBytes();
			System.out.println(line + " to byte: " + Arrays.toString(bytes));
			System.out.println(line + " from byte: " + new String(bytes));
		}

	}

}
