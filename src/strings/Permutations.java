package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutations
{
	public static void permut(String str)
	{
		Set<String> permSet = permutationFinder(str);

		System.out.println("Permutations for '" + str + "' are: [" + permSet.size() + "]\n " + permSet);
		
		permutation2("", str);
	}

	public static Set<String> permutationFinder(String str)
	{
		Set<String> perm = new HashSet<String>();
		// Handling error scenarios
		if (str == null)
		{
			return null;
		}
		else if (str.length() == 0)
		{
			perm.add("");
			return perm;
		}

		char initial = str.charAt(0); // first character
		String rem = str.substring(1); // Full string without first character

		Set<String> words = permutationFinder(rem);

		for (String strNew : words)
		{
			for (int i = 0; i <= strNew.length(); i++)
			{
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;
	}

	private static void permutation2(String prefix, String str)
	{
		int length = str.length();
		
		if (length == 0)
		{
			System.out.println(prefix);			
		}
		else
		{
			for (int i = 0; i < length; i++)
			{
				permutation2(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, length));				
			}
		}
	}

	public static String charInsert(String str, char c, int pos)
	{
		String begin = str.substring(0, pos);
		String end = str.substring(pos);
		return begin + c + end;
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

			Permutations.permut(line);

		}
	}
}
